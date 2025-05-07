/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacredenciales;

import java.util.Scanner;

/**
 *
 * @author Jorda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public void menuInicio(){
        System.out.print(""
                + "+---------------------------+\n"
                + "|            MENU           |\n"
                + "+---------------------------+\n"
                + "| 1 | Agregar Credencial    |\n"
                + "| 2 | Ver Credenciales      |\n"
                + "| 0 | Salir                 |\n"
                + "+---------------------------+\n"
                + "-->");
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner input = new Scanner(System.in);
        Inventario inventario = Inventario.getInstancia();
        //ConfiguracionGloba configuracionGloba = ConfiguracionGloba.getInstancia();
        Credencial credencialBase = new Credencial();
        boolean con = true;
        System.out.println("Hola bienvenido al registro de credenciales");
        while(con){
            main.menuInicio();
            String eleccion = input.nextLine();
            switch (eleccion) {
                case "1":
                    System.out.println("eleccion 1");
                    Credencial credencial = credencialBase.clone();
                    System.out.println("Agrege el nombre :");
                    String nombre = input.nextLine();                    
                    System.out.println("Agrege el apellido :");
                    String apellido = input.nextLine();
                    System.out.println("Agrege el rut :");
                    String rut = input.nextLine();
                    System.out.println("Agrege el cargo :");
                    String cargo = input.nextLine();
                    inventario.agregarCredencial(credencial);
                    
                    credencial.modificarCampos(nombre, apellido, cargo, rut);
                    System.out.println("Credencial agregada con exito");
                    break;
                case "2":
                    inventario.verCredenciales();
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    con = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }   
        }
    }
}
    

