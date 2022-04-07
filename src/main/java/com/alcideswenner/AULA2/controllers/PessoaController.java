package com.alcideswenner.AULA2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alcideswenner.AULA2.entities.Pessoa;
import com.alcideswenner.AULA2.services.PessoaService;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaController {
	@Autowired
	public PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>>findAll(){
		return ResponseEntity.ok(pessoaService.findAll());
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Pessoa>savePessoa(@RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(pessoaService.savePessoa(pessoa));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean>deletePessoa(@PathVariable("id") Integer id){
		return ResponseEntity.ok(pessoaService.deletePessoa(id));
	}
	
}
