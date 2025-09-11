/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestion;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
        String producto;
        double precio;
        LocalDate fechaMaxima = LocalDate.parse("2025-09-05");
        LocalDate fechaIngreso = null;
        boolean fechaValida = false;
        
        
        //Cliente(String rut, String nombre, int edad, String fechaNacimiento)
        
        Cliente cliente1 = new Cliente();
        
        //Pedido(String registrarCliente, String registrarProducto, String registrarVendedor, int cantidadSolicitada, String fechaPedido)
        
        Pedido pedido1 = new Pedido();
        
        //Producto(String codigoUnico, String nombre, String tipo, double precioUnitario)
        
        Producto producto1 = new Producto();
        
        //Region(int nroUnico, String nombre, String ciudadprincipal)
        
        Region region1 = new Region(123,"Metropolitana","Pudahuel");
        
        //Vendedor(String rut, int nroVendedor, String nombre, String fechaIngreso, String regionTrabaja
        
        Vendedor vendedor1 = new Vendedor();
        //iafalsflkasfhklasfasklfasfafaf
        
        
        
        
        do{
            
            System.out.println("=== SISTEMA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE ===");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Vendedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Generar Pedido");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            
            switch (opcion){
                
                case 1:
                    System.out.println("-- INGRESO DE CLIENTE --");
                    System.out.println("Ingrese RUT del cliente: ");
                    lectura = leer.next();
                    cliente1.setRut(lectura);
              
                   
                    
                    do{
                        System.out.println("Ingrese nombre del cliente: ");
                        lectura = leer.next();
                        
                        if(cliente1.comprobarNombre(lectura)){
                            System.out.println("Error: el nombre no puede estar vacio");
                            
                        }else{
                            System.out.println("Nombre ingresado con exito!");
                            
                        }
                    }while (cliente1.comprobarNombre(lectura));
                    
                    cliente1.setNombre(lectura);
                    
                    System.out.println("Ingrese edad del cliente: ");
                    numero = leer.nextInt();
                    
                    if (cliente1.comprobarEdad(numero)){
                        
                    }else{
                        break;
                    }
                   
                    do {
                        
                    cliente1.setEdad(numero);    
                    System.out.println("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                    lectura = leer.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    try {
                        LocalDate fecha = LocalDate.parse(lectura, formatter);
                        cliente1.setFechaNacimiento(fecha);
                        System.out.println("Cliente registrado con éxito!");
                        fechaValida = true;
                        // ahora el setter recibe un LocalDate
                        } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
                        }
                    
                    
                    
                    }while (fechaValida != true);
                    break;
                    
                   
                case 2:
                    
                    System.out.println("-- INGRESO DE VENDEDOR --");
                    System.out.println("Ingrese RUT: ");
                    lectura = leer.next();
                    vendedor1.setRut(lectura);
                    
                    
                    System.out.println("Ingrese número de vendedor: ");
                    numero = leer.nextInt();
                    vendedor1.setNroVendedor(numero);
                    
                    
                    System.out.println("Ingrese nombre de vendedor: ");
                    lectura = leer.next();
                    
                    do{
                        if(vendedor1.comprobarNombre(lectura)){
                            System.out.println("El nombre no debe estar vacio!");
                            
                        }
                        
                    }while (vendedor1.comprobarNombre(lectura));
                    
                    vendedor1.setNombre(lectura);
                    
                  do {
                    System.out.println("Ingrese fecha de ingreso (AAAA-MM-DD): ");
                    lectura = leer.next();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    try {
                    fechaIngreso = LocalDate.parse(lectura, formatter);

                    if (fechaIngreso.isAfter(fechaMaxima)) {
                    System.out.println("Error: la fecha de ingreso no puede ser posterior a " + fechaMaxima);
                    } else {
                    fechaValida = true; // fecha correcta
                    }
                    } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
                    }

                    } while (!fechaValida);

                    vendedor1.setFechaIngreso(fechaIngreso);
                    System.out.println("Fecha de ingreso registrada correctamente: " + fechaIngreso);

                    
                    
                    System.out.println("Ingrese la region en la que trabaja: ");
                    lectura = leer.next();
                    vendedor1.setRegionTrabaja(lectura);
                    System.out.println("Vendedor ingresado con exito!");
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el codigo unico del producto: ");
                    lectura = leer.next();
                    producto1.setCodigoUnico(lectura);
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    lectura = leer.next();
                    producto1.setNombre(lectura);
                    
                    
                    do{
                        
                      System.out.println("Ingrese el tipo (Crema/Perfume): ");
                      producto = leer.next().toLowerCase().trim();
                      
                      if(producto1.productoValido(producto)){
                          break;
                          
                          
                          
                      }else{
                          
                      } System.out.println("Debes ingresar un producto crema o perfume");
                    }while(true);
                    
                    
                    System.out.println("Ingrese el precio unitario: ");
                    precio = leer.nextDouble();
                    producto1.setPrecioUnitario(precio);
                    
                    System.out.println("Ingrese la cantidad: ");
                    numero = leer.nextInt();
                    
                    pedido1.setCantidadSolicitada(numero);
                    pedido1.totalBruto(producto1);
                    
                    break;
                    
                    
                    
                case 4:
                    
                    System.out.println("==== PEDIDO =====");
                    System.out.println("Codigo producto: "+producto1.getCodigoUnico());
                    System.out.println("Tipo: "+producto1.getTipo());
                    System.out.println("Precio Unitario: "+producto1.getPrecioUnitario());
                    System.out.println("Vendedor: "+vendedor1.getNombre());
                    System.out.println("Cliente: "+cliente1.getNombre());
                    System.out.println("Edad: "+cliente1.getEdad());
                    System.out.println("Cantidad Solicitada: "+pedido1.getCantidadSolicitada());
                    System.out.println("Total Bruto: "+pedido1.totalBruto(producto1));
                    System.out.println("Pedido valido: "+pedido1.validarPedido(cliente1));
                    System.out.println("Descuento: "+pedido1.totalNeto(producto1));
                    System.out.println("Estado: "+pedido1.validarPedido(cliente1));
                    
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:   
                    System.out.println("Seleccione una opcion válida");     
                
            }
            
        }while(opcion != 5);
        leer.close();
        
        
        
    }
    
}
