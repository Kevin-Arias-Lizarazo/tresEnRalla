/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class jugador {
    private String name;
    private static int id=0;
    private int points;
    public jugador(){
        
    }
    public jugador(int id,String name,int points){
        this.id=id;
        this.name=name;
        this.points=points;
    }
    public jugador(jugador gamer){
        jugador player=gamer;
        this.id=player.getId();
        this.name=player.getName();
        this.points=player.getPoints();
    }
    public void crear(){
        id++;
        name="Jugador"+id;
        points=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    @Override
    public String toString() {
        return "jugador{" + "name=" + name + ", points=" + points + '}';
    }
    
}
