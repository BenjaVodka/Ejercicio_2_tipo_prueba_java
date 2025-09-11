/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

import java.time.LocalDate;

/**
 *
 * @author benjamin
 */
public class Vendedor {
    
    private String rut;
    private int nroVendedor;
    private String nombre;
    private LocalDate fechaIngreso;
    private String regionTrabaja;

    public Vendedor() {
    }

    public Vendedor(String rut, int nroVendedor, String nombre, LocalDate fechaIngreso, String regionTrabaja) {
        this.rut = rut;
        this.nroVendedor = nroVendedor;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.regionTrabaja = regionTrabaja;
    }
    
    
      public boolean comprobarNombre(String nombre){
        
        if(nombre.isEmpty()){
            System.out.println("El nombre no debe estar vacio!");
            
        }else{
            
        }return false;
            
            
       
        
        
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRegionTrabaja() {
        return regionTrabaja;
    }

    public void setRegionTrabaja(String regionTrabaja) {
        this.regionTrabaja = regionTrabaja;
    }
    
    
    
    
}
