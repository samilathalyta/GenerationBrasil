package br.org.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/mentalidade")  // serve para dizer qual url vai ter acesso a classe de controle (quais metodosvao ser excutados e afins //no front: localost: 8080/hello

public class HelloController {
	@GetMapping // ta vindo uma requisicao da url: ("/hello")
	public String mostrarHello() {
		return "Utilizei a Habilidade de persistecia e Mentalidade de crescimento";
	}
}
