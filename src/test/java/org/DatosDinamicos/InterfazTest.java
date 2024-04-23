package org.DatosDinamicos;

import javax.swing.*;

public class InterfazTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz ui = new Interfaz();
            ui.setVisible(true);
        });
    }
}