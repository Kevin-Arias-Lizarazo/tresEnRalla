/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author DANNNA**/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;
public class controlador implements ActionListener{
    almacen guarda;
    public controlador(){
        guarda = new almacen();
        while(guarda.size()<2){
            jugador generico = new jugador();
            guarda.add(generico);
        }
        
    }
    public void menu(){
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
