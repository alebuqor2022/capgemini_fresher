package com.capgemini.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.curso.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
