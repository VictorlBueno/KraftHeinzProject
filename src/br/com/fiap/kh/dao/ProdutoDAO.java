package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Produto;
import br.com.fiap.kh.singleton.ConnectionManager;

public class ProdutoDAO {
	
	Connection connection;
	
	public void cadastrar(Produto produto) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_PRODUTO( ID_PRODUTO, NM_PRODUTO ) VALUES ( KH_PRODUTO_SEQ.NEXTVAL, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setString(1, produto.getNome());	
			stmt.executeUpdate();
			
			System.out.println("Produto adicionado!");
			
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
