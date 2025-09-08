/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class SistemaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String lectura;
        int numero;
        int opcion;
        
        //Objeto Cliente
        
        Cliente cliente1 = new Cliente();
        
        
        do{
            System.out.println("=== SISTEMA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE ====");
            System.out.println("1.- ingresar cliente");
            System.out.println("2.- Ingresar Vendedor");
            System.out.println("3.- Ingresar Producto");
            System.out.println("4.- Generar Pedido");
            System.out.println("5.- Salir");
            System.out.println("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("-- INGRESAR CLIENTE --");
                    System.out.println("Ingrese RUT del cliente: ");
                    lectura = leer.next();
                    cliente1.setRut(lectura);
                    
                    System.out.println("Ingrese nombre del cliente: ");
                    lectura = leer.next();
                    cliente1.setNombre(lectura);
                    
                    System.out.println("Ingrese edad del cliente: ");
                    numero = leer.nextInt();
                    cliente1.setEdad(numero);
                    
                    System.out.println("Ingrese fecha de nacimiento: ");
                    
                    System.out.println("Cliente registrado con éxito!");
                    
                case 2:
                    System.out.println("-- INGRESAR VENDEDOR --");
                    System.out.println("Ingrese RUT de vendedor: ");
                    System.out.println("Ingrese numero de vendedor: ");
                    System.out.println("Ingrese nombre de vendedor: ");
                    System.out.println("Ingrese la fecha de ingreso del vendedor: ");
                    System.out.println("Ingrese la region en la que trabaja el vendedor:");
                    
                case 3:
                    
                    System.out.println("-- INGRESAR REGION --");
                    System.out.println("Ingrese el numero unico de la region: ");
                    System.out.println("Ingrese su nombre: ");
                    System.out.println("Ingrese la ciudad principal: ");
                   
                    
                case 4:
                    System.out.println("-- INGRESAR PRODUCTO --");
                    System.out.println("1.- Ingrese el codigo unico: ");
                    System.out.println("2.- Ingrese el nombre: ");
                    System.out.println("3.- Ingrese el tipo de producto: ");
                    System.out.println("4.- Ingrese precio unitario: ");
                    
                case 5:
                    
                    System.out.println("-- GENERANDO INFORMACION PEDIDO --");
                    System.out.println("Cliente: ");
                    System.out.println("Producto: ");
                    System.out.println("Vendedor: ");
                    System.out.println("Cantidad solicitada: ");
                    System.out.println("Fecha de pedido: ");
                    
            }
            
            
        }while(opcion != 5);
        
        
        
    }
    
}
