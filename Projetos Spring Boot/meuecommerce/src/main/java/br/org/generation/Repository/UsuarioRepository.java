package br.org.generation.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	public Optional <Usuario> findAllByUsuario(String usuario);
	
	public List <Usuario> findAllByNomeContainigIgnoreCase(String nome);
	
	public Usuario findByNome (String nome);

	public Optional<Usuario> findByUsuario(String userName);

	

}
