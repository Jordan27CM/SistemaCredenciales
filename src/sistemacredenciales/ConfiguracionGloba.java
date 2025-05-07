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
    private String nombreEvento;
    private int duracionEstandar;
    private String idioma;
    

    private ConfiguracionGloba() {
        this.nombreEvento = "Festival De Musica";
        this.duracionEstandar = 3;
        this.idioma = "Español";
    }
    
    public static ConfiguracionGloba getInstancia(){
        if (instancia == null){
            instancia = new ConfiguracionGloba();
        }
        return instancia;
    }
    public void personalizar(String nombreEvento, int duracionEvento, String idioma){
        this.nombreEvento = nombreEvento;
        this.duracionEstandar = duracionEvento;
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "ConfiguracionGloba{" + "nombreEvento=" + nombreEvento + ", duracionEstandar=" + duracionEstandar + ", idioma=" + idioma + '}';
    }
}
