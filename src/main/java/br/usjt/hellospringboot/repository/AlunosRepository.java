package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Aluno;

public interface AlunosRepository  extends JpaRepository<Aluno, Long>{
	

}
