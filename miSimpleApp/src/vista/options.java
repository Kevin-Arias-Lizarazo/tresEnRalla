/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.configuracion;

public class options extends JPanel {
    private JButton save;
    private JButton Nsave;
    private JTextField numerJugadores;
    private JTextField tamaño;
    private JTextField cantidadGanar;
    private ActionListener escuchadorlocal;
    public options() {

    }   
    
    public options(ActionListener escuchadorB,ActionListener escuchadorT,String size,String num,String win) {

        this.setSize(500, 500);
        setLayout(null);
        
        numerJugadores = new JTextField();
        tamaño = new JTextField();
        cantidadGanar = new JTextField();
        
        numerJugadores.setName("players");
        tamaño.setName("size");
        cantidadGanar.setName("win");

        numerJugadores.setBounds(250,25,40,30);
        tamaño.setBounds(250,100,40,30);
        cantidadGanar.setBounds(250,175,40,30);

        numerJugadores.setText(num);
        tamaño.setText(size);
        cantidadGanar.setText(win);
        
        numerJugadores.addActionListener(escuchadorT);
        tamaño.addActionListener(escuchadorT);
        cantidadGanar.addActionListener(escuchadorT);
        
        add(numerJugadores);
        add(tamaño);
        add(cantidadGanar);
        
        save = new JButton("Guardar");
        Nsave = new JButton("Menu");

        save.setBounds(350, 400, 100, 40);
        Nsave.setBounds(50, 400, 100, 40);

        save.addActionListener(escuchadorB);
        
        Nsave.addActionListener(escuchadorB);

        save.setBackground(Color.white);
        Nsave.setBackground(Color.white);

        add(save);
        add(Nsave);
        
        save.setVisible(true);
        Nsave.setVisible(true);
        numerJugadores.setVisible(true);
        cantidadGanar.setVisible(true);
        tamaño.setVisible(true);
        this.setVisible(true);
    }
    
}
