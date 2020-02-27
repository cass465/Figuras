/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 *
 * @author YEISON
 */
public class Rectangulo extends Figura{
    
    private byte[] coordenada4;
            
     public Rectangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3,byte[] coordenada4, String color) {
        this.coordenada4=coordenada4;
        super(coordenada1, coordenada2, coordenada3, color);
     }
}
