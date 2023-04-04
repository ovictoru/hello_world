package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "Hello World!!!";
	}

	@GetMapping("/BSM")
	public String bsm() {
		return "Orientação aos Detalhes<br/>" + "Orientação ao Futuro<br/>" + "Responsabilidade Pesosal<br/>" + "Dar e Receber<br/>" + "Trabalho em Equipe<br/>";

	}

	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return "Objetivos de aprendizagem da semana: Consolidar os conhecimentos adquirido em banco de dados e iniciar os estudos sobre o Framework Spring";

	}

}
