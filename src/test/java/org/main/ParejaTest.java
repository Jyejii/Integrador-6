package org.main;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class ParejaTest{
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Pareja
        Pareja pareja1 = new Pareja(1, 2);
        Pareja pareja2 = new Pareja(3, 4);

        // Lista de parejas
        List<Pareja> listaParejas = new ArrayList<>();

        // Agregar parejas a la lista
        listaParejas.add(pareja1);
        listaParejas.add(pareja2);

        // Acceder a los datos de las parejas en la lista
        for (Pareja pareja : listaParejas) {
            System.out.println("Primero: " + pareja.primero + ", Segundo: " + pareja.segundo);
        }
    }
}
