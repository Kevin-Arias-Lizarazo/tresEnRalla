/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JPanel;
import modelo.jugador;

/**
 *
 * @author DANNNA
 */
public class play extends JPanel{
    jugador player1;
    jugador player2;
    public play(){
        player1 = new jugador();
        player2 = new jugador();
        
    }
    public play(jugador player1,jugador player2){
        this.player1=player1;
        this.player2=player2;
    }
}
