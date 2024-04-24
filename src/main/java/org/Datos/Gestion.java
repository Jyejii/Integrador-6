package org.Datos;
import java.util.HashMap;
import java.util.Map;

public class Gestion {
    private Map<Integer, String> relaciones;

    public Gestion() {
        relaciones = new HashMap<>();
    }

    public void asociarNumeroALetra(int numero, String letra) {
        relaciones.put(numero, letra);
    }

    public String obtenerLetraAsociada(int numero) {
        return relaciones.get(numero);
    }
}