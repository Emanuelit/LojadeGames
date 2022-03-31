package org.generation.brazil.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.generation.brazil.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
