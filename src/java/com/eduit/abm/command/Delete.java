/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit.abm.command;

import com.eduit.clase3.dao.AlumnoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacionit
 */
public class Delete implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String sid = request.getParameter("id");
        long id = Long.parseLong(sid);
        AlumnoDAO.delete(id);
        GetAll list = new GetAll();
        list.execute(request, response);
        return "index.jsp";
    }

}
