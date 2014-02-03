/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milton.dao.impl;

import com.milton.dao.CursoDao;
import com.milton.model.pg_curso;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milton Chapilliquén
 */
@Repository
public class CursoDaoImpl implements CursoDao {

    @Autowired
    private SessionFactory session;

    @Override
    public void agregarCurso(pg_curso curso) {
        session.getCurrentSession().save(curso);
    }

    @Override
    public void editarCurso(pg_curso curso) {
        session.getCurrentSession().update(curso);
    }

    @Override
    public void eliminarCurso(String codigo) {
        session.getCurrentSession().delete(obtenerCurso(codigo));
    }

    @Override
    public pg_curso obtenerCurso(String codigo) {
        return (pg_curso) session.getCurrentSession().get(pg_curso.class, codigo);
    }

    @Override
    public List obtenerTodosCurso() {
        return session.getCurrentSession().createQuery("from pg_curso").list();
    }

}
