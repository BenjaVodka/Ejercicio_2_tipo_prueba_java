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
public class Cliente {
    
    
    private String rut;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    
    
    

    public Cliente() {
    }

    public Cliente(String rut, String nombre, int edad, LocalDate fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean comprobarEdad(int edad){
     if (edad >= 18 && edad < 100){
        return true;
    }else{
        System.out.println("Usted no cumple con la edad necesaria");
        return false;
    }
}

    
   public boolean comprobarNombre(String nombre){
    if(nombre == null || nombre.isBlank()){  // chequea null y vacío
        System.out.println("El nombre no debe estar vacío!");
        return false;
    }else{
        return true;
    }
}


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
