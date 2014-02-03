/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milton.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Milton Chapilliquén
 */
@Entity
public class pg_curso {

    @Id
    @Column
    private String pg_codCurso;
    @Column
    private String pg_claveCurso;
    @Column
    private String pg_nombreCurso;
    @Column
    private int pg_creditos;

    public pg_curso() {
    }

    public pg_curso(String pg_codCurso, String pg_claveCurso, String pg_nombreCurso, int pg_creditos) {
        this.pg_codCurso = pg_codCurso;
        this.pg_claveCurso = pg_claveCurso;
        this.pg_nombreCurso = pg_nombreCurso;
        this.pg_creditos = pg_creditos;
    }

    public String getPg_codCurso() {
        return pg_codCurso;
    }

    public void setPg_codCurso(String pg_codCurso) {
        this.pg_codCurso = pg_codCurso;
    }

    public String getPg_claveCurso() {
        return pg_claveCurso;
    }

    public void setPg_claveCurso(String pg_claveCurso) {
        this.pg_claveCurso = pg_claveCurso;
    }

    public String getPg_nombreCurso() {
        return pg_nombreCurso;
    }

    public void setPg_nombreCurso(String pg_nombreCurso) {
        this.pg_nombreCurso = pg_nombreCurso;
    }

    public int getPg_creditos() {
        return pg_creditos;
    }

    public void setPg_creditos(int pg_creditos) {
        this.pg_creditos = pg_creditos;
    }

}
