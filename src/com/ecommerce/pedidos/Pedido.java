package com.ecommerce.pedidos;

import com.ecommerce.Cliente;

import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Pedido(int idPedido, Cliente cliente, List<Producto> productos) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.productos = productos;
        
        // Calcular el total al crear el pedido
        this.total = cliente.calcularTotal(); 
    }

    // Método para mostrar resumen del pedido
    public void mostrarResumenPedido() {
        System.out.println("ID del Pedido: " + idPedido);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}