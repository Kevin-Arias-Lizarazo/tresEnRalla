/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author DANNNA**/
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.*;
import vista.*;
public class controlador{
    
    JFrame vm = new JFrame();
    almacen guarda;
    principal vista;
    configuracion configura;
    public controlador(){
        guarda = new almacen();
        while(guarda.size()<2){
            jugador generico = new jugador();
            generico.crear();
            guarda.add(generico);
        }
        vista = new principal();
        configura = new configuracion();
        menu();
    }
    public void jugar(){
        
    }
    public void configurar(){
        ActionListener escuchador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton=(JButton) e.getSource();
                switch(boton.getText()){
                    case "Perfiles":
                        vista.setVisible(false);
                        
                        
                        break;
                    case "Menu":
                        vista.setVisible(false);
                        vm.setVisible(true);
                        break;
                    default:
                        break;
                }
            }
        };
        options setings = new options(configura,escuchador);
        vista.cambiar(setings);
    }
    public void menu(){
        ActionListener escuchador = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton boton=(JButton) e.getSource();
                switch(boton.getText()){
                    case "Jugar":
                        vm.setVisible(false);
                        jugar();
                        break;
                    case "Configuracion":
                        vm.setVisible(false);
                        configurar();
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
        vm.setLocale(null);
        vm.setSize(option.getSize());
        vm.add(option);
        vm.setVisible(true);
//        vista.cambiar(option);
//        vista.setTitle("Menu");
    }
    
}
