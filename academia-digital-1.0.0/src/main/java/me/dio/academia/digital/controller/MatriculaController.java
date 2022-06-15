package me.dio.academia.digital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MartriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
	
	  @Autowired
	  private MartriculaServiceImpl service;
	  
	  @PostMapping

	  public Matricula create(@Valid @RequestBody MatriculaForm form) {
		   return service.create(form);
	  }
	  
	  
	  @GetMapping
	  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
	    return service.getAll(bairro);
	  }

}
