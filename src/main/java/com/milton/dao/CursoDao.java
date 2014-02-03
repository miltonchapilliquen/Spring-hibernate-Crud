/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milton.dao;

import com.milton.model.pg_curso;
import java.util.List;

/**
 *
 * @author Milton Chapilliquén
 */
public interface CursoDao {

    public void agregarCurso(pg_curso curso);

    public void editarCurso(pg_curso curso);

    public void eliminarCurso(String codigo);

    public pg_curso obtenerCurso(String codigo);

    public List obtenerTodosCurso();
}
