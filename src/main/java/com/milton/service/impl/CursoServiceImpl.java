/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milton.service.impl;

import com.milton.dao.CursoDao;
import com.milton.model.pg_curso;
import com.milton.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milton Chapilliquén
 */
@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoDao cursoDao;

    @Transactional
    public void agregarCurso(pg_curso curso) {
        cursoDao.agregarCurso(curso);
    }

    @Transactional
    public void editarCurso(pg_curso curso) {
        cursoDao.editarCurso(curso);
    }

    @Transactional
    public void eliminarCurso(String codigo) {
        cursoDao.eliminarCurso(codigo);
    }

    @Transactional
    public pg_curso obtenerCurso(String codigo) {
        return cursoDao.obtenerCurso(codigo);
    }

    @Transactional
    public List obtenerTodosCurso() {
        return cursoDao.obtenerTodosCurso();
    }

}
