/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.modelo;

/**
 *
 * @author Admin
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String fecha_naciemiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String direccion, String fecha_naciemiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecha_naciemiento = fecha_naciemiento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the fecha_naciemiento
     */
    public String getFecha_naciemiento() {
        return fecha_naciemiento;
    }

    /**
     * @param fecha_naciemiento the fecha_naciemiento to set
     */
    public void setFecha_naciemiento(String fecha_naciemiento) {
        this.fecha_naciemiento = fecha_naciemiento;
    }

    @Override
    public String toString() {
        return "Nombre:"+getNombre() +" "+getApellido()
                +"\nDireccion:"+getDireccion()
                +"\nCedula:"+getCedula()
                +"\nFecha de Nacimiento:"+getFecha_naciemiento();
    }
    
    
    
}
