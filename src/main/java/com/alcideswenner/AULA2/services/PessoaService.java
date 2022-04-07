package com.alcideswenner.AULA2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alcideswenner.AULA2.entities.Pessoa;
import com.alcideswenner.AULA2.repositories.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa>findAll(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa savePessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public Boolean deletePessoa(Integer id) {
		try {
			pessoaRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
}
