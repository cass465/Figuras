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
public class Rectangulo extends Cuadrilatero {
    
    private float lado2;
   
    public Rectangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3,coordenada4, color);        
    }
    
    public boolean validarCoordenadas(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4) {

        if ((coordenada1[0] == coordenada2[0] && coordenada1[1] == coordenada2[1])
                || (coordenada1[0] == coordenada3[0] && coordenada1[1] == coordenada3[1])
                || (coordenada1[0] == coordenada4[0] && coordenada1[1] == coordenada4[1])
                || (coordenada2[0] == coordenada3[0] && coordenada2[1] == coordenada3[1])
                || (coordenada2[0] == coordenada4[0] && coordenada2[1] == coordenada4[1])
                || (coordenada3[0] == coordenada4[0] && coordenada3[1] == coordenada4[1])) {
            return false;
        }
        if (coordenada1[1] != coordenada2[1] || coordenada1[0] == coordenada2[0]) {
            return false;
        } else if (coordenada2[0] != coordenada3[0]) {
            return false;
        } else if (coordenada3[1] != coordenada4[1]) {
            return false;
        } else if (coordenada1[0] != coordenada4[0]) {
            return false;
        } else if((coordenada1[0]+coordenada2[0]==coordenada2[1]+coordenada3[1])) {
            return false;
        }else {
            return true;
        }

    }
    
    @Override 
     public float hallarArea() {

        return (super.getLado1() * this.lado2);

    }
     @Override 
     public float hallarPerimetro() {
        return ((super.getLado1() *2)+ (this.lado2*2));
    }
     
     public void calcularLado2(byte coordenada2[], byte coordenada3[]) {
        this.lado2=((coordenada3[1] - coordenada2[1]));

    }
}