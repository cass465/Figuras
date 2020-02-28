/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.principal;

/**
 * Clase Main que ejecuta el programa
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Main {

    /**
     * Metodo principal que arranca el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFigura().setVisible(true);

            }
        });

    }

}
