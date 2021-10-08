package br.org.generation.lojadegames.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity //habilitar a camada de segurança
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {

		@Autowired
		private UserDetailsService userDetailsService;
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(userDetailsService);
		}
		
		@Bean
		public PasswordEncoder passowrdEncoder() {
			return new BCryptPasswordEncoder()
;		}
		
		@Override
		protected void configure(HttpSecurity http) throws Exception { //objeto do tipo http securitythrows tratativa de errro
			http.authorizeRequests() // autorizar requisição
			.antMatchers("/usuarios/logar").permitAll() //libera alguns caminhos do controle sem precisar passar o token
			.antMatchers("/usuarios/cadastrar").permitAll()  
			.anyRequest().authenticated() //as demais requisiões deverão ser autenticadas
			.and().httpBasic() //padrao basci para gerar o padrao token
			.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)  //indica qua tipo de sessao utilizamos/vai precisar de cookies, status, se fiar mto tempo logado o token expira....
			.and().cors()
			.and().csrf().disable(); //desabilitar o csrf
			
		}
}
