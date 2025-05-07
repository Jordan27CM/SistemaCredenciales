/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacredenciales;

/**
 *
 * @author Jorda
 */
public class ConfiguracionGloba {
    private static ConfiguracionGloba instancia;
    private String fecha;
    private String lugar;

    private ConfiguracionGloba() {
        this.fecha = "01/01/2026";
        this.lugar = "Santiago de Chile";
    }
    
    public static ConfiguracionGloba getInstancia(){
        if (instancia == null){
            instancia = new ConfiguracionGloba();
        }
        return instancia;
    }
    public void personalizar(String fecha, String lugar){
        this.fecha = fecha;
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "ConfiguracionGloba{" + "fecha=" + fecha + ", lugar=" + lugar + '}';
    }
}
