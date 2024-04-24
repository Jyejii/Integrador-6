package org.Datos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GestionTest {
    private Gestion gestion;

    @Before
    public void setUp() {
        gestion = new Gestion();
    }

    @Test
    public void testAsociarNumeroALetra() {
        gestion.asociarNumeroALetra(1, "a");
        String letra = gestion.obtenerLetraAsociada(1);
        System.out.println("Asociar Numero a Letra:");
        System.out.println("Numero 1 es la letra: " + letra);
    }

    @Test
    public void testObtenerLetraAsociada() {
        gestion.asociarNumeroALetra(2, "b");
        String letra = gestion.obtenerLetraAsociada(2);
        System.out.println("Obtener Letra Asociada:");
        System.out.println("Numero 2 es la letra: " + letra);
    }
}