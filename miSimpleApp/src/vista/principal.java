/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DANNNA
 */
public class principal extends JFrame{

    public principal() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
    public principal(JPanel panel) {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("");
        this.setSize(300,300);
        this.setLocale(null);
        setResizable(false);
        this.add(panel);
        this.revalidate();
        this.repaint();
    }
    public void cambiar(JPanel panel){
        this.setVisible(false);
        Container contentPane = getContentPane();
        contentPane.removeAll();
        
        JPanel panelc = panel;
        this.setSize(panelc.getSize());
        this.setLocale(null);
        this.add(panel);
        
        this.revalidate();
        this.repaint();
        this.setVisible(true);
    }
    public void agregar(JPanel panel){
        this.add(panel);
        this.setVisible(true);
        this.revalidate();
        this.repaint();
    }
}
