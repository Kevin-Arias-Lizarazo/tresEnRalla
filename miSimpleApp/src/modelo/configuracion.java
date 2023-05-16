/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author DANNNA
 */
public class configuracion {
    private int numPlayers;
    private int tamaño;
    private int victoria;
    public configuracion() {
        this.numPlayers=2;
        this.tamaño=3;
        this.victoria=3;
    }
    public configuracion(int numPlayers,int tamaño,int victoria){
        this.numPlayers=numPlayers;
        this.tamaño=tamaño;
        this.victoria=victoria;
    }
    public configuracion(configuracion setings){
        configuracion configurar=setings;
        this.numPlayers=configurar.getNumPlayers();
        this.tamaño=configurar.getTamaño();
        this.victoria=configurar.getVictoria();
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }
    
}
