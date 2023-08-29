package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Maquina;
import br.com.fiap.kh.singleton.ConnectionManager;

public class MaquinaDAO {
	
	Connection connection;
	
	public void cadastrar(Maquina maquina) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_MAQUINA( ID_MAQUINA, NM_MAQUINA, ID_FABRICA ) VALUES ( KH_MAQUINA_SEQ.NEXTVAL, ?, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setString(1, maquina.getNome());
			stmt.setInt(2, maquina.getFabrica());
			stmt.executeUpdate();
			
			System.out.println("Maquina adicionada!");
			
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
