/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacredenciales;

import java.util.ArrayList;

/**
 *
 * @author Jorda
 */
public class Inventario {
    private static Inventario instancia;
    private ArrayList<Credencial> credenciales= new ArrayList<Credencial>();

    private Inventario() {
    }
    public static Inventario getInstancia(){
        if(instancia== null){
            instancia = new Inventario();
        }
        return instancia;
    }
    public void agregarCredencial(Credencial credencial){
        credenciales.add(credencial);
    }
    
    public void verCredenciales(){
        for (Credencial credencial : credenciales) {
            System.out.println(credencial+ ConfiguracionGloba.getInstancia().toString());
        }
    }
}
