package br.org.generation.lojadegames.Service;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.org.generation.lojadegames.model.Usuario;
import br.org.generation.lojadegames.model.UsuarioLogin;
import br.org.generation.lojadegames.repository.UsuarioRepository;

@Service  //define quem pode e nao pode acessar	
public class UsuarioService {
	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	public Optional<Usuario> cadastrarUsuario(Usuario usuario){
		if(usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) {
			return Optional.empty();
		}
	
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(usuario.getSenha());
		
		usuario.setSenha(senhaEncoder);
		
		return Optional.of(usuarioRepository.save(usuario));
}
	
	
	
	
		
		public Optional<UsuarioLogin> loginUsuario(Optional<UsuarioLogin> usuarioLogin){
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());
			
			if(usuario.isPresent()) {
				if(encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha()));
					String auth = usuarioLogin.get().getUsuario() + ":" + usuarioLogin.get().getSenha();
					//thalyta@email
					//123456
					
					byte[] encoderAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
					//a6s5sa65as5as6
					
					String authHeader = "Basic " + new String(encoderAuth);
						//Basic a6s5sa65as5as6
					
					usuarioLogin.get().setId(usuario.get().getId());	
					usuario.get().setNome(usuario.get().getNome());
					usuario.get().setSenha(usuario.get().getSenha());
					usuario.get().setToken(authHeader);
					
					return usuarioLogin;
			}
			return Optional.empty();
		
		
	
	}
//public Optional<UsuarioLogin> loginUsuario(Optional<UsuarioLogin> usuarioLogin){
	//	if(usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) {
			//return Optional.empty();
		//}
	
		
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//
		//String senhaEncoder = encoder.encode(usuario.getSenha());
		
		//usuario.setSenha(senhaEncoder);
		
		//return Optional.of(usuarioRepository.save(usuario));
//}
//}
	



}
