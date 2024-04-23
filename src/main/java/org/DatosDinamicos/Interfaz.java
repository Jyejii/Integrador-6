package org.DatosDinamicos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JTextField inputField;

    public Interfaz() {
        setTitle("Interfaz de Usuario Interactiva");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        panel.add(inputField, BorderLayout.CENTER);

        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(inputField.getText());
                inputField.setText("");
            }
        });
        panel.add(addButton, BorderLayout.EAST);

        add(panel, BorderLayout.SOUTH);
    }
}

