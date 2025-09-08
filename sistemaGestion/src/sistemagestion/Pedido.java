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
public class Pedido {
    
    private String registrarCliente;
    private String registrarProducto;
    private String registrarVendedor;
    private int cantidadSolicitada;
    private Date fechaPedido;

    public Pedido() {
    }

    public Pedido(String registrarCliente, String registrarProducto, String registrarVendedor, int cantidadSolicitada, Date fechaPedido) {
        this.registrarCliente = registrarCliente;
        this.registrarProducto = registrarProducto;
        this.registrarVendedor = registrarVendedor;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fechaPedido = fechaPedido;
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

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
    
    
}
