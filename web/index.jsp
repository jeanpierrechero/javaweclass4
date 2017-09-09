<%-- 
    Document   : index
    Created on : 09-sep-2017, 12:41:24
    Author     : educacionit
--%>

<%@page import="com.eduit.clase3.entities.Alumno"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="add">
            nombre:<input type="text" name="nombre"/>
            apellido:<input type="text" name="apellido"/>
            <br><br>
            <input type="submit" value="agregar"/>
            </<form>
               
        <%List<Alumno> alumnos = (List<Alumno>)session.getAttribute("alumnos");%>
        
        <table border="2">
            
            <tr>
                <td>id</td>
                <td>nombre</td>
                <td>apellido</td>
            </tr>
            <%if(alumnos != null){%>
            <%for(Alumno a: alumnos){%>
            <tr>
                <td><%=a.getId()%></td>
                <td><%=a.getNombre()%></td>
                <td><%=a.getApellido()%></td>
            </tr>
            <%}%>
            <%}%>         

        </table>
    </body>
</html>
