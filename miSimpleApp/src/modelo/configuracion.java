/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

public class configuracion {

    private int numPlayers;
    private int tamaño;
    private int victoria;

    public configuracion() {
        this.numPlayers = 2;
        this.tamaño = 3;
        this.victoria = 3;
    }

    public configuracion(int numPlayers, int tamaño, int victoria) {
        this.numPlayers = numPlayers;
        this.tamaño = tamaño;
        this.victoria = victoria;
    }

    public configuracion(configuracion setings) {
        this.numPlayers = setings.getNumPlayers();
        this.tamaño = setings.getTamaño();
        this.victoria = setings.getVictoria();
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getVictoria() {
        return victoria;
    }

    public String getSPlayers() {
        return ""+numPlayers;
    }

    public String getSTamaño() {
        return ""+tamaño;
    }

    public String getSVictoria() {
        return ""+victoria;
    }
    
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }

    public String getnumPlayers(String a) {
        return "" + numPlayers;
    }

    public String getTamaño(String a) {
        return "" + tamaño;
    }

    public String getVictoria(String a) {
        return String.valueOf(victoria);
    }

    private static int validarNumPlayers(String cadena, int tamaño) {
        //si el tamaño es muy corto o largo
        if(cadena.length() != 2 && cadena.length() != 1){
            return 2;
        }
        //eror por letras
        if (cadena.matches("[0-9]+") == false) {
            return 1;
        }
        //demasiados jugadores o muy pocos
        int numero = Integer.parseInt(cadena);
        if (numero < 2 || 9 < numero) {
            return 2;
        }
        //mas jugadores imposible ganar
        if (numero > tamaño) {
            return 3;
        }

        return 0;
    }

    public String setNumPlayers(String cadena) {
        int error = 0;
        int size = tamaño;
        String[] errores = {"La cantidad de jugadores no puede tener caracteres\nEscriba el valor nuevamente", "La cantidad de jugadores debe ser mayor a 1 y menor a 10\nEscriba un valor menor a 10 y mayor a 1", "Hay mas Jugadores que espacio.\nEscriba un valor menor o igual a " + size};
        error = validarNumPlayers(cadena, size);
        while (error != 0) {
            cadena = JOptionPane.showInputDialog(errores[error - 1]);
            error = validarNumPlayers(cadena, size);
        }
        this.numPlayers = Integer.parseInt(cadena);
        return cadena;
    }

    private static int validarTamaño(String cadena) {
        //si el tamaño es muy corto o largo
        if(cadena.length() != 2 && cadena.length() != 1){
            return 2;
        }
        //eror por letras
        if (cadena.matches("[0-9]+") == false) {
            return 1;
        }
        //demasiados espacios o muy pocos
        int numero = Integer.parseInt(cadena);
        if (numero < 3 || numero > 20  ) {
            return 2;
        }

        return 0;
    }

    public String setTamaño(String cadena) {
        int error = 0;
        String[] errores = {"El tamaño no puede tener caracteres\nEscriba el valor nuevamente", "El tamaño debe ser mayor a 2 y menor a 21\nEscriba un valor menor a 21 y mayor a 1"};
        error = validarTamaño(cadena);
        while (error != 0) {
            cadena = JOptionPane.showInputDialog(errores[error - 1]);
            error = validarTamaño(cadena);
        }
        this.tamaño = Integer.parseInt(cadena);
        return cadena;
    }

    private static int validarVictoria(String cadena, int tamaño) {
        //si el tamaño es muy corto o largo
        if(cadena.length() != 2 && cadena.length() != 1){
            return 2;
        }
        //eror por letras
        if (cadena.matches("[0-9]+") == false) {
            return 1;
        }
        //demasiadas jugadores o muy pocos
        int numero = Integer.parseInt(cadena);
        //mas necesarios que espacio imposible ganar
        if (numero > tamaño) {
            return 2;
        }

        return 0;
    }

    public String setVictoria(String cadena) {
        int error = 0;
        int size = tamaño;
        String[] errores = {"El valor no puede tener caracteres\nEscriba el valor nuevamente", "La cantidad requerida debe ser un valor mayor a 2 y menor o igual a " + size + "\nEscriba el valor nuevamente"};
        error = validarVictoria(cadena, size);
        while (error != 0) {
            cadena = JOptionPane.showInputDialog(errores[error - 1]);
            error = validarVictoria(cadena, size);
        }
        this.victoria = Integer.parseInt(cadena);
        return cadena;
    }
}
