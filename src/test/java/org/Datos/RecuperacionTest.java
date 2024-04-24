package org.Datos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RecuperacionTest {
    private Recuperacion recuperacion;

    @Before
    public void setUp() {
        recuperacion = new Recuperacion();
    }

    @Test
    public void testAgregarYRecuperarInformacion() {
        recuperacion.agregarInformacion("clave 1", "valor 1");
        String valor = recuperacion.recuperarInformacion("clave 1");
        System.out.println("Agregar y Recuperar Informacion:");
        System.out.println("Valor:" + valor);
    }
}