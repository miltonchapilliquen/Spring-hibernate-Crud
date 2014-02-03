/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milton.controller;

import com.milton.model.pg_curso;
import com.milton.service.CursoService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Milton Chapilliquén
 */
@Controller
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @RequestMapping("/index")
    public String formSetup(Map<String, Object> map) {
        pg_curso curso = new pg_curso();
        map.put("curso", curso);
        map.put("cursoLista", cursoService.obtenerTodosCurso());
        return "curso";
    }

    @RequestMapping(value = "/curso.do", method = RequestMethod.POST)
    public String doAction(@ModelAttribute pg_curso curso, BindingResult result, @RequestParam String action, Map<String, Object> map) {
        pg_curso cursoresult = new pg_curso();
        switch (action.toLowerCase()) {
            case "add":
                cursoService.agregarCurso(curso);
                cursoresult = curso;
                break;
            case "edit":
                cursoService.editarCurso(curso);
                cursoresult = curso;
                break;
            case "delete":
                cursoService.eliminarCurso(curso.getPg_codCurso());
                cursoresult = new pg_curso();
                break;
            case "search":
                pg_curso cursosearch = cursoService.obtenerCurso(curso.getPg_codCurso());
                cursoresult = cursosearch != null ? cursosearch : new pg_curso();
                break;
        }
        map.put("curso", cursoresult);
        map.put("cursoLista", cursoService.obtenerTodosCurso());
        return "curso";
    }
}
