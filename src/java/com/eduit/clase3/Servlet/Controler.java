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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        response.sendRedirect("index.jsp");
  
  }
}
    

