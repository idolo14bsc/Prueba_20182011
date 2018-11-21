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
public class Empleado extends Persona {
    private double salario;
    private String area;

    public Empleado() {
    }

    public Empleado(double salario, String area, String nombre, String apellido, String cedula, String direccion, String fecha_naciemiento) {
        super(nombre, apellido, cedula, direccion, fecha_naciemiento);
        this.salario = salario;
        this.area = area;
    }
    
    

   /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"
                +"\nSalario:" +getSalario() 
                +"\nArea:"+getArea(); 
    }
    
    
    
}
