/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.controlador;

import com.ccalle.modelo.Empleado;
import com.ccalle.vista.EditarDatos;
import com.ccalle.vista.Login;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Coordinador {
    Login login = new Login(this);
    
    EditarDatos editarDatos = new EditarDatos(this);
    
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
        System.out.println("Empleado agregado");
        
    }
}
