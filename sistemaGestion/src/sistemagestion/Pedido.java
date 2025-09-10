/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;

/**
 *
 * @author benjamin
 */
public class Pedido {
    
    private String registrarCliente;
    private String registrarProducto;
    private String registrarVendedor;
    private int cantidadSolicitada;
    private String fechaPedido;

    public Pedido() {
    }

    public Pedido(String registrarCliente, String registrarProducto, String registrarVendedor, int cantidadSolicitada, String fechaPedido) {
        this.registrarCliente = registrarCliente;
        this.registrarProducto = registrarProducto;
        this.registrarVendedor = registrarVendedor;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fechaPedido = fechaPedido;
    }
    
        public double totalBruto(Producto precio){
        
        
        double total = 0;
        
        
        total = cantidadSolicitada * precio.getPrecioUnitario();
        System.out.println("Total bruto: "+total);
        return 0;
        
        
    }
    
    public double totalNeto(Producto producto){
        
       double totalBruto = totalBruto(producto);
       double descuento = 0;
       
        if (totalBruto > 50000) {
            descuento = 0.10; // 10%
        } else if (totalBruto > 100000) {
            descuento = 0.20; // 20%
        }

        double totalConDescuento = totalBruto - (totalBruto * descuento);
        System.out.println("Total neto (con descuento): " + totalConDescuento);
        return totalConDescuento;
       
        
        
        
  
       
    }
    
    public boolean validarPedido(Cliente cliente){
        
        if (cliente.comprobarEdad(cliente.getEdad())){
            System.out.println("!");
            
        }else{
            System.out.println("");
        }
        
        return false;
        
        
    }
    
    public String getRegistrarCliente() {
        return registrarCliente;
    }

    public void setRegistrarCliente(String registrarCliente) {
        this.registrarCliente = registrarCliente;
    }

    public String getRegistrarProducto() {
        return registrarProducto;
    }

    public void setRegistrarProducto(String registrarProducto) {
        this.registrarProducto = registrarProducto;
    }

    public String getRegistrarVendedor() {
        return registrarVendedor;
    }

    public void setRegistrarVendedor(String registrarVendedor) {
        this.registrarVendedor = registrarVendedor;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
    
    
}
