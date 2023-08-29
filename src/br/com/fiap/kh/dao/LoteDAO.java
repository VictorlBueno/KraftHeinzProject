package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Lote;
import br.com.fiap.kh.singleton.ConnectionManager;

public class LoteDAO {
	
	Connection connection;
	
	public void cadastrar(Lote lote) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_LOTE( ID_LOTE, ID_PRODUTO, QT_PRODUCAO ) VALUES ( KH_LOTE_SEQ.NEXTVAL, ?, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setInt(1, lote.getProduto().getIdProduto());
			stmt.setDouble(2, lote.getQtProducao());
			stmt.executeUpdate();
			
			System.out.println("Lote adicionado!");
			
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
