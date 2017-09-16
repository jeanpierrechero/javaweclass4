/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.clase3.Servlet;

import com.eduit.clase3.dao.AlumnoDAO;
import com.eduit.clase3.entities.Alumno;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacionit
 */
@WebServlet(name = "pss", urlPatterns = "/controler")

public class Controler extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String exe = request.getParameter("exe");
        String redirect = "";

        if (exe.equals("add")) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");

            Alumno alumno = new Alumno(nombre, apellido);
            AlumnoDAO.save(alumno);
            redirect = "index.jsp";
        } else if (exe.equals("delete")) {
            String sid = request.getParameter("id");
            long id = Long.parseLong(sid);
            AlumnoDAO.delete(id);
            redirect = "index.jsp";
        }
        List<Alumno> alumnos = AlumnoDAO.getAll();
        request.getSession().setAttribute("alumnos", alumnos);
        response.sendRedirect("index.jsp");

    }
}
