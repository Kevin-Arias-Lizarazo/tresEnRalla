/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import modelo.*;
import vista.*;

public class controlador {

    private almacen perfils;
    principal vista;
    private configuracion configura;

    public controlador() {
        perfils = new almacen();
        vista = new principal();
        configura = new configuracion();
        menu();
    }

    public void jugar() {

    }

    public void configurar() {
        configuracion preferencias = new configuracion(configura.getNumPlayers(), configura.getTamaño(), configura.getVictoria());
        ActionListener escuchadorB = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton = (JButton) e.getSource();
                switch (boton.getText()) {
                    case "Guardar":
                        vista.setVisible(false);
                        configura.setNumPlayers(preferencias.getNumPlayers());
                        configura.setTamaño(preferencias.getTamaño());
                        configura.setVictoria(preferencias.getVictoria());
                        menu();
                        break;
                    case "No guardar":
                        vista.setVisible(false);
                        menu();
                        break;
                    default:
                        break;
                }
            }
        };
        ActionListener escuchadorT = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField jTextField = (JTextField) e.getSource();
                switch (jTextField.getName()) {
                    case "players":
                        jTextField.setText(preferencias.setNumPlayers(jTextField.getText()));
                        break;
                    case "size":
                        jTextField.setText(preferencias.setTamaño(jTextField.getText()));
                        break;
                    case "win":
                        jTextField.setText(preferencias.setVictoria(jTextField.getText()));
                        break;
                }
            }
        };
        options setings = new options(escuchadorB, escuchadorT,preferencias.getSTamaño(),preferencias.getSPlayers(),preferencias.getSVictoria());
        vista.cambiar(setings);
    }

    public void menu() {
        ActionListener escuchador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton = (JButton) e.getSource();
                switch (boton.getText()) {
                    case "Jugar":
                        vista.setVisible(false);
                        jugar();
                        break;
                    case "Configuracion":
                        vista.setVisible(false);
                        configurar();
                        break;
                    case "Perfiles":
                        vista.setVisible(false);
                        System.out.println("3");
                        break;
                    case "Salir":
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        };
        menu option = new menu(escuchador);
        vista.cambiar(option);
        vista.setTitle("Menu");
    }

}
