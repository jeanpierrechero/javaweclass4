<%-- 
    Document   : index
    Created on : 09-sep-2017, 12:41:24
    Author     : educacionit
--%>

<%@page import="com.eduit.clase3.entities.Alumno"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="controler">
            nombre:<input type="text" name="nombre"/>
            apellido:<input type="text" name="apellido"/>
            <input type="hidden" name="exe" value="add"/>

            <br><br>
            <input type="submit" value="agregar"/>
        </form>
        <form method = "POST" action="controler"> 
            <input type="hidden" name="exe" value="list"/>
            <input type="submit" value="listar"/>
        </form>



        <table border="2">

            <tr>
                <td>id</td>
                <td>nombre</td>
                <td>apellido</td>
                <td>borrar</td>
            </tr>

            
            
            <c:forEach var="a" items="${sessionScope.alumnos}">

            <tr>
                <td>${a.id}</td>
                <td>${a.nombre}</td>
                <td>${a.apellido}</td>

                <td>
                    <form method="POST" action="controler">                
                        <input type="hidden" name="id" value="${a.id}"/>    
                        <input type="hidden" name="exe" value="delete"/>
                        <input type="submit" value="borrar"/>
                    </form>
                </td>
            </c:forEach>
                
            </tr>
            

        

        </table>
          
            
            <hr>
                <c:out value="1+1"/>
                <%= 1+1 %>
                
            <hr>
                <c:set var="num" value="${10}" scope="session"/>
                <c:out value="${sessionScope.num}"/>
                <c:if test="${num==10}">
                    diez
                </c:if>
                  
            <hr>
                <c:set var="num" value="${10}" scope="session"/>
                <c:choose>
                    <c:when test="${num==5}">
                        cinco
                    </c:when>
                    <c:when test="${num==10}">
                        10
                    </c:when> 
                    <c:otherwise>
                        ninguno
                    </c:otherwise>
                </c:choose>
            <hr>
            <c:forEach var="a" items="${sessionScope.alumnos}">
                <c:out value="${a.nombre}"/>
            </c:forEach>
    </body>
</html>
