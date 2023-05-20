/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class menu extends JPanel{

    private JButton play;
    private JButton setings;
    private JButton perfil;
    private JButton exit;

    public menu() {
        this.setSize(300, 500);
        setLayout(null);
        play = new JButton("Jugar");
        setings = new JButton("Configuracion");
        perfil = new JButton("Perfiles");
        exit = new JButton("Salir");
        
        play.setBounds(75, 50, 150, 50);
        setings.setBounds(75, 110, 150, 50);
        perfil.setBounds(75, 170, 150, 50);
        exit.setBounds(75, 230, 150, 50);
        
        play.setBackground(Color.white);
        setings.setBackground(Color.white);
        perfil.setBackground(Color.white);
        exit.setBackground(Color.white);
        
        add(play);
        add(setings);
        add(perfil);
        add(exit);
    }
    public menu(ActionListener escuchador) {
        this.setSize(300, 350);
        setLayout(null);
        
        play = new JButton("Jugar");
        setings = new JButton("Configuracion");
        perfil = new JButton("Perfiles");
        exit = new JButton("Salir");
        
        play.setBounds(75, 50, 150, 50);
        setings.setBounds(75, 110, 150, 50);
        perfil.setBounds(75, 170, 150, 50);
        exit.setBounds(75, 230, 150, 50);
        
        play.addActionListener(escuchador);
        setings.addActionListener(escuchador);
        perfil.addActionListener(escuchador);
        exit.addActionListener(escuchador);
        
        play.setBackground(Color.white);
        setings.setBackground(Color.white);
        perfil.setBackground(Color.white);
        exit.setBackground(Color.white);
        
        add(play);
        add(setings);
        add(exit);
        add(perfil);
                
        play.setVisible(true);
        setings.setVisible(true);
        exit.setVisible(true);
        this.setVisible(true);
    }
    public void setActionListener(ActionListener escuchador){
        play.addActionListener(escuchador);
        setings.addActionListener(escuchador);
        exit.addActionListener(escuchador);
    }
}