/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelo.configuracion;

/**
 *
 * @author DANNNA
 */
public class options extends JPanel{
    private JButton perfil;
    private JTextField numerJugadores;
    private JTextField tamaño;
    private JTextField cantidadGanar;
    public options(){
        
    }
    public options(configuracion config,ActionListener escuchador){
        configuracion setings = config;
        
        this.setSize(500, 500);
        setLayout(null);
        
        
        perfil = new JButton("Perfiles");
        
        
        perfil.setBounds(400, 400, 100, 50);
        
        
        perfil.addActionListener(escuchador);
        
        
        perfil.setBackground(Color.white);
        
        
        add(perfil);
        
        
        perfil.setVisible(true);
        this.setVisible(true);
    }
    
}
