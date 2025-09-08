/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.util.Date;

/**
 *
 * @author benjamin
 */
public class Vendedor {
    
    
    private String rut;
    private int nroVendedor;
    private String nombre;
    private Date fechaIngreso;
    private String region;

    public Vendedor() {
    }

    public Vendedor(String rut, int nroVendedor, String nombre, Date fechaIngreso, String region) {
        this.rut = rut;
        this.nroVendedor = nroVendedor;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.region = region;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNroVendedor() {
        return nroVendedor;
    }

    public void setNroVendedor(int nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    
    
    
}
