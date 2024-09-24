package com.ecommerce;

import com.ecommerce.pedidos.Producto;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private List<Producto> carritoCompras;

    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carritoCompras = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        carritoCompras.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        carritoCompras.remove(producto);
    }

    public double calcularTotal() {
        return carritoCompras.stream().mapToDouble(Producto::getPrecio).sum();
    }

    // Getters
    public List<Producto> getCarritoCompras() { return carritoCompras; }
    
    public String getNombre() { return nombre; }
}