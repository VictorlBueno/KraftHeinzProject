package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Recurso;
import br.com.fiap.kh.singleton.ConnectionManager;

public class RecursoDAO {
	
	Connection connection;
	
	public void cadastrar(Recurso recurso) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_RECURSO( ID_RECURSO, NM_RECURSO, VL_CUSTO_UN ) VALUES ( KH_RECURSO_SEQ.NEXTVAL, ?, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setString(1, recurso.getNome());
			stmt.setDouble(2, recurso.getCustoUnidade());
			stmt.executeUpdate();
			
			System.out.println("Recurso adicionada!");
			
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
