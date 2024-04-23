package org.Informacion;

import java.util.*;

public class Analisis {
    private List<Venta> ventas;

    public Analisis(List<Venta> ventas) {
        this.ventas = new ArrayList<>(ventas);
    }

    public void ordenarVentasPorMonto() {
        ventas.sort(Comparator.comparing(Venta::getMonto));
    }

    public List<Venta> filtrarVentasPorMonto(double montoMinimo) {
        List<Venta> ventasFiltradas = new ArrayList<>();
        for (Venta venta : ventas) {
            if (venta.getMonto() >= montoMinimo) {
                ventasFiltradas.add(venta);
            }
        }
        return ventasFiltradas;
    }

    public void imprimirVentas() {
        for (Venta venta : ventas) {
            System.out.println("Nombre: " + venta.getNombre() + ", Monto: " + venta.getMonto());
        }
    }
}