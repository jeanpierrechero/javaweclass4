/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.abm.command;

import com.eduit.clase3.dao.AlumnoDAO;
import com.eduit.clase3.entities.Alumno;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacionit
 */
public class Save implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        Alumno alumno = new Alumno(nombre, apellido);
        AlumnoDAO.save(alumno);
        GetAll list = new GetAll();
        list.execute(request, response);
        return "index.jsp";
    }

}
