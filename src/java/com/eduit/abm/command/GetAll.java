/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.abm.command;

import com.eduit.clase3.dao.AlumnoDAO;
import com.eduit.clase3.entities.Alumno;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacionit
 */
public class GetAll implements Command{
    
    public String execute(HttpServletRequest request, HttpServletResponse response){
        
        List<Alumno> alumnos = AlumnoDAO.getAll();
        request.getSession().setAttribute("alumnos", alumnos);
        return"index.jsp";
    }
    
}
