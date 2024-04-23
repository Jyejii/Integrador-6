package org.Informacion;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnalisisTest {
    private Analisis analisis;
    private List<Venta> ventas;

    @Before
    public void setUp() {
        ventas = Arrays.asList(new Venta("Venta1", 100.0), new Venta("Venta2", 200.0));
        analisis = new Analisis(ventas);
    }

    @Test
    public void testOrdenarVentasPorMonto() {
        analisis.ordenarVentasPorMonto();
        System.out.println("Primera venta:" + ventas.get(0).getMonto());
        System.out.println("Segunda venta: " + ventas.get(1).getMonto());
        assertEquals(100.0, ventas.get(0).getMonto(), 0.001);
        assertEquals(200.0, ventas.get(1).getMonto(), 0.001);
    }

    @Test
    public void testFiltrarVentasPorMonto() {
        List<Venta> filteredSales = analisis.filtrarVentasPorMonto(150.0);
        System.out.println("Tamaño de venta filtrada: " + filteredSales.size());
        System.out.println("Venta del monto filtrado: " + filteredSales.get(0).getMonto());
        assertEquals(1, filteredSales.size());
        assertEquals(200.0, filteredSales.get(0).getMonto(), 0.001);
    }

}