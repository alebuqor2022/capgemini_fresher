package com.capgemini.curso.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.capgemini.curso.model.Curso;

public interface CursoService {
List<Curso> getAllCursos();
void saveCurso(Curso curso);
Curso getCursoById(long id);
void deleteCursoById(long id);

Page<Curso> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection);

}
