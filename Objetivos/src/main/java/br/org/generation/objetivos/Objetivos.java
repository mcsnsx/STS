package br.org.generation.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class Objetivos {

	@GetMapping
	public String objetivosShow() {
		return "<p>Objetivo: Ter mais paciencia</p>"
				+ "<p>Como aprimorar? \nAutoavaliação e reconhecimento do que pode debilitar a minha paciência.</p>"
				+ "<p>Como emplementar? \nPretendo entrar em contato com pessoas diversas e buscar ouvir ativamente.</p>";
	}

}





