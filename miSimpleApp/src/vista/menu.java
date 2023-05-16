/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author DANNNA
 */
public class menu extends JPanel {

    private JButton play;
    private JButton setings;
    private JButton exit;

    public menu() {
        setLayout(new GridLayout(3, 1));
        play = new JButton("Jugar");
        setings = new JButton("Configuracion");
        exit = new JButton("Salir");
        add(play);
        add(setings);
        add(exit);
    }
}
