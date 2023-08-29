package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Fabrica;
import br.com.fiap.kh.singleton.ConnectionManager;

public class FabricaDAO {
	
	Connection connection;
	
	public void cadastrar(Fabrica fabrica) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_FABRICA( ID_FABRICA, NM_FABRICA, DS_ENDERECO ) VALUES ( KH_FABRICA_SEQ.NEXTVAL, ?, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setString(1, fabrica.getNome());
			stmt.setString(2, fabrica.getEndereco());
			stmt.executeUpdate();
			
			System.out.println("Fabrica adicionada!");
			
		// Se houver erro no insert
		} catch(SQLException e) {
			System.out.println("Erro de inserção!");
			e.printStackTrace();
		
		// Feche a conexão
		} finally {
			try {
				stmt.close();
				connection.close();
				
			// Se houver erro ao fechar a conexão
			} catch (SQLException e) {
				System.out.println("Erro ao fechar a conexão!");
				e.printStackTrace();
			}
		}

	}
}
