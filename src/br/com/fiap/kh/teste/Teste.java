package br.com.fiap.kh.teste;

import java.sql.Date;

import br.com.fiap.kh.bean.Consumo;
import br.com.fiap.kh.bean.Fabrica;
import br.com.fiap.kh.bean.Lote;
import br.com.fiap.kh.bean.Maquina;
import br.com.fiap.kh.bean.Produto;
import br.com.fiap.kh.bean.Recurso;
import br.com.fiap.kh.dao.ConsumoDAO;
import br.com.fiap.kh.dao.FabricaDAO;
import br.com.fiap.kh.dao.LoteDAO;
import br.com.fiap.kh.dao.MaquinaDAO;
import br.com.fiap.kh.dao.ProdutoDAO;
import br.com.fiap.kh.dao.RecursoDAO;

public class Teste {

	public static void main(String[] args) {
		
		// Cadastra uma fabrica;
		FabricaDAO fabricaDAO = new FabricaDAO();
		Fabrica fabrica = new Fabrica("Eldorado", "Ed. Eldorado Business Towers");
		fabricaDAO.cadastrar(fabrica);
		
		// Cadastra um recurso;
		RecursoDAO recursoDAO = new RecursoDAO();
		Recurso recurso = new Recurso("Eletricidade", 0.06);
		recursoDAO.cadastrar(recurso);
		
		// Cadastra um produto;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = new Produto("Ketchup");
		produtoDAO.cadastrar(produto);
	
		// Cadastra uma maquina;
		MaquinaDAO maquinaDAO = new MaquinaDAO();
		Maquina maquina = new Maquina("Evaporador", 1);
		maquinaDAO.cadastrar(maquina);
		
		// Cadastra um lote;
		LoteDAO loteDAO = new LoteDAO();
		Lote lote = new Lote(1000, produto);
		lote.getProduto().setIdProduto(1);
		loteDAO.cadastrar(lote);
		
		// Cadastra um consumo;
		ConsumoDAO consumoDAO = new ConsumoDAO();
		Consumo consumo = new Consumo(1, 1000, Date.valueOf("2023-05-20"), Date.valueOf("2023-05-28"), recurso, lote);
		consumo.getLote().setIdLote(1);
		consumo.getRecurso().setIdRecurso(1);
		consumoDAO.cadastrar(consumo);
		
	}

}
