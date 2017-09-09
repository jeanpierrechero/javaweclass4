/*
 * Alumno.java
 *
 *
 */
package com.eduit.clase3.dao;


import com.eduit.clase3.entities.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AlumnoDAO {

    public static ArrayList getAll() {

        ArrayList<Alumno> alumnos = new ArrayList<>();
        Statement stmtConsulta = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            String laConsulta = "SELECT * FROM alumnos";
            stmtConsulta = conn.createStatement();
            rs = stmtConsulta.executeQuery(laConsulta);

            while (rs.next()) {
                // Arma el objeto Alumno
                Alumno alumno = new Alumno();
                alumno.setId(rs.getInt("alumno_id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumnos.add(alumno);
            }
        } catch (Exception ex) {
            throw new RuntimeException("eror en base de datos", ex);
        } finally {
            try {
                stmtConsulta.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException("eror en base de datos", ex);
            }
        }
        return alumnos;
    }

    public static void save(Alumno alumno) {
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {
            conn = ConnectionManager.getConnection();
            preparedStatement = conn.prepareStatement("INSERT INTO alumnos (nombre, apellido) VALUES (?,?)");
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("eror en base de datos", ex);
        } finally {
            try {
                preparedStatement.close();
                conn.close();
            } catch (SQLException ex) {
               throw new RuntimeException("eror en base de datos", ex);
            }
        }
    }

    public static void delete(long id) {
        PreparedStatement preparedStatement = null;
        Connection conn = null;
        try {
            conn = ConnectionManager.getConnection();
            preparedStatement = conn.prepareStatement("DELETE FROM alumnos WHERE alumno_id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("eror en base de datos", ex);
        } finally {
            try {
                preparedStatement.close();
                conn.close();
            } catch (SQLException ex) {
                 throw new RuntimeException("eror en base de datos", ex);
            }
        }
    }

}
