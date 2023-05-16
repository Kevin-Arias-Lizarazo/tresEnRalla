/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author DANNNA
 */
public class almacen extends ArrayList {

    private static configuracion preferencias;

    public almacen() {

    }

    //devuele el jugador del indice dado
    public jugador buscarIn(int i) {
        return (jugador) this.get(i);
    }

    public void mostrarconsola() {

        for (int i = 0; i < this.size(); i++) {
            jugador player = new jugador((jugador) this.get(i));
            System.out.println(player.toString());
        }
    }

    //retorna un boton con la informacion del jugador segun el indice de la arraylist
    

    public JButton jugadorIn(int indice) {
        JButton boton = new JButton();
        
        boton.setSize(150, 200);
        
        jugador player = (jugador) this.get(indice);
        
        JLabel texto = new JLabel();
        
        texto.setText("Name: "+player.getName());
        texto.setBounds(25, 25, 100, 50);
        
        boton.add(texto);
        texto = new JLabel();
        
        texto.setText("Id: "+player.getId());
        texto.setBounds(25, 100, 100, 50);
        
        boton.add(texto);
        texto = new JLabel();
        
        texto.setText("Points: "+player.getPoints());
        texto.setBounds(25, 100, 100, 50);
        
        boton.add(texto);
        return boton;
    }
}
