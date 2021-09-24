package br.org.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")

public class mentalidades {
	@GetMapping
	public String faleMentalidades() {
		return "Utillizaei a mentalidade de  teste crescimetno e a habilidade de "
				+ "peristenca para poder concluir a atividade da maneira correta";
	}

}
