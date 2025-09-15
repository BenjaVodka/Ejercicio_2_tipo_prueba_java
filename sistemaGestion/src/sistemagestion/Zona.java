/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author benjamin
 */
public class Zona {
    
    
    private int nroUnico;
    private String nombre;
    private String ciudadPrincipal;

    public Zona() {
    }
    
    
 

    public Zona(int nroUnico, String nombre, String ciudadPrincipal) {
        this.nroUnico = nroUnico;
        this.nombre = nombre;
        this.ciudadPrincipal = ciudadPrincipal;
    }

    public int getNroUnico() {
        return nroUnico;
    }

    public void setNroUnico(int nroUnico) {
        this.nroUnico = nroUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadPrincipal() {
        return ciudadPrincipal;
    }

    public void setCiudadPrincipal(String ciudadPrincipal) {
        this.ciudadPrincipal = ciudadPrincipal;
    }
    
    
    
}
