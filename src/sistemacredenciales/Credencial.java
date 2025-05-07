/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacredenciales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorda
 */
public class Credencial implements Cloneable{
    private String nombre;  
    private String apellido;
    private String cargo;
    private String rut;

    public Credencial() {
        this.nombre = "";
        this.apellido = "";
        this.cargo = "";
        this.rut = "";
    }
    public void modificarCampos(String nombre, String apellido, String cargo, String rut){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Credencial{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", rut=" + rut + '}';
    }
    
    @Override
    protected Credencial clone() {
        try {
            return (Credencial) super.clone(); 
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
    
     
}
