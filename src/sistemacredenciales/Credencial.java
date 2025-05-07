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
    private int id;
    private String nombre;  
    private String apellido;
    private String cargo;
    private String rut;

    public Credencial() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.cargo = "";
        this.rut = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", rut=" + rut + '}';
    }

    @Override
    protected Credencial clone() {
        try {
            Credencial credencial = (Credencial) super.clone();
            return credencial;
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Credencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
     
}
