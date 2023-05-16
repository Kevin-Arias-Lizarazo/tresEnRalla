/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

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
        this.setLocale(null);
        setResizable(false);
    }
    public void actualizar(){
        this.revalidate();
        this.repaint();
    }
    public void limpiar(){
        this.removeAll();
    }
    public void cambiar(JPanel panel){
        this.setVisible(false);
        limpiar();
        agregar(panel);
    }
    public void agregar(JPanel panel){
        this.add(panel);
        this.setVisible(true);
        actualizar();
    }
}
