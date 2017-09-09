/*
 * Alumno.java
 *
 *
 */
package com.eduit.clase3.entities;



/**
 *
 * @author Sebasti�n S. Sanga
 */
public class Alumno {

  
    private long id;
    private String nombre;
    private String apellido;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
   
}
