package org.Datos;

import java.util.HashMap;
import java.util.Map;

public class Recuperacion {
    private Map<String, String> datos;

    public Recuperacion() {
        datos = new HashMap<>();
    }

    public void agregarInformacion(String clave, String valor) {
        datos.put(clave, valor);
    }

    public String recuperarInformacion(String clave) {
        return datos.get(clave);
    }
}
