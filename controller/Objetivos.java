package br.org.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String meusObjetivos() {
		return "Tenho como objetivo aprender além do que e for passado em sala de aula. "
				+ "Uitlizar outras platafoemas que falem do assunto.";
	}

}
