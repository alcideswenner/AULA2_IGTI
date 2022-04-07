package com.alcideswenner.AULA2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcideswenner.AULA2.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
// CRUD: SALVAR, DELETAR, ATUALIZAR E LISTAR
}
