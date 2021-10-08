package br.org.generation.lojadegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.lojadegames.repository.ProdutoRepository;





@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController<Produto> {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<br.org.generation.lojadegames.model.Produto>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}	
	
	@GetMapping("/{id}")
	public ResponseEntity<br.org.generation.lojadegames.model.Produto> getById(@PathVariable long id){
		return produtoRepository.findById(id)
				.map(resp->ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
				
	}
	
	@GetMapping("descricao/{decricao}")
	public ResponseEntity<List<br.org.generation.lojadegames.model.Produto>> getByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(produtoRepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	
	
	
	
}
