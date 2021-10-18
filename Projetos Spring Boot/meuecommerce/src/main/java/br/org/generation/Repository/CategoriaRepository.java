package br.org.generation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	public List <Categoria> findAllByNomeContainingIgnoreCase (String nome);

}
