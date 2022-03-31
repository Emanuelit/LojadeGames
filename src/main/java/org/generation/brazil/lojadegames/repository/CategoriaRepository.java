package org.generation.brazil.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.generation.brazil.lojadegames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
