package br.com.fiap.kh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.kh.bean.Consumo;
import br.com.fiap.kh.singleton.ConnectionManager;

public class ConsumoDAO {
	
	Connection connection;
	
	public void cadastrar(Consumo consumo) {
		PreparedStatement stmt = null;
		
		try {
			// Realiza conexão
			connection = ConnectionManager.getInstance().getConnection();
			
			// Insert na tabela
			String sql = "INSERT INTO T_KH_CONSUMO( ID_CONSUMO, ID_RECURSO, ID_MAQUINA, ID_LOTE, QT_RECURSO, DT_CONSUMO_INICIAL, DT_CONSUMO_FINAL ) VALUES ( KH_CONSUMO_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ? )";
			stmt = connection.prepareStatement(sql);	
			
			stmt.setInt(1, consumo.getRecurso().getIdRecurso());
			stmt.setInt(2, consumo.getMaquina());
			stmt.setInt(3, consumo.getLote().getIdLote());
			stmt.setDouble(4, consumo.getQtRecurso());
			stmt.setDate(5, consumo.getDataInicial());
			stmt.setDate(6, consumo.getDataFinal());
			stmt.executeUpdate();
			
			System.out.println("Consumo adicionada!");
			
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
