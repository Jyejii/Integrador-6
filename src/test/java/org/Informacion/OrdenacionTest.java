package org.Informacion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacionTest {
    private Ordenacion ordenacion;

    @Before
    public void setUp() {
        ordenacion = new Ordenacion();
        ordenacion.agregarVenta(new Venta("Venta1", 100.0));
        ordenacion.agregarVenta(new Venta("Venta2", 200.0));
    }

    @Test
    public void testBuscarVenta() {
        Venta venta = ordenacion.buscarVenta("Venta1");
        System.out.println("Venta encontrada: " + venta.getNombre() + ", Monto: " + venta.getMonto());
        assertNotNull(venta);
        assertEquals("Venta1", venta.getNombre());
        assertEquals(100.0, venta.getMonto(), 0.01);
    }

    @Test
    public void testOrdenarVentasPorNombre() {
        ordenacion.ordenarVentasPorNombre();
        Venta primeraVenta = ordenacion.buscarVenta("Venta1");
        Venta segundaVenta = ordenacion.buscarVenta("Venta2");
        System.out.println("Primera venta: " + primeraVenta.getNombre() + ", Monto: " + primeraVenta.getMonto());
        System.out.println("Segunda venta: " + segundaVenta.getNombre() + ", Monto: " + segundaVenta.getMonto());
        assertTrue(primeraVenta.getNombre().compareTo(segundaVenta.getNombre()) < 0);
    }
}