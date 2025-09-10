/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author benjamin
 */
public class Cliente {
    
    
    private String rut;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    
    
    

    public Cliente() {
    }

    public Cliente(String rut, String nombre, int edad, String fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean comprobarEdad(int edad){
        
        if (edad >= 18 && edad < 100){
            System.out.println("");
            return true;
        }else{
            System.out.println("Usted no cumple con la edad necesaria");
            return false;
        }
    }
    
    public boolean comprobarNombre(String nombre){
        
        if(nombre.isEmpty()){
            System.out.println("El nombre no debe estar vacio!");
        }else{
            System.out.println("Nombre ingresado con exito");
            
        }
        return false;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
