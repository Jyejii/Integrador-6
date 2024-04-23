 package org.Informacion;

import java.util.*;

public class Ordenacion {
    private TreeSet<Venta> ventas;

    public Ordenacion() {
        ventas = new TreeSet<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public Venta buscarVenta(String nombre) {
        for (Venta venta : ventas) {
            if (venta.getNombre().equals(nombre)) {
                return venta;
            }
        }
        return null;
    }

    public void ordenarVentasPorNombre() {
        TreeSet<Venta> ventasOrdenadas = new TreeSet<>(Comparator.comparing(Venta::getNombre));
        ventasOrdenadas.addAll(ventas);
        ventas = ventasOrdenadas;
    }

    public void imprimirVentas() {
        for (Venta venta : ventas) {
            System.out.println("Nombre: " + venta.getNombre() + ", Monto: " + venta.getMonto());
        }
    }
}