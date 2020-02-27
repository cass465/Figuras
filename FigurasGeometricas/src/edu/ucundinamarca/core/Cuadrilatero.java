/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author YEISON
 */
public class Cuadrilatero extends Figura {
    
    private byte[] coordenada4;

    public Cuadrilatero(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, color);
        this.coordenada4=coordenada4;
    }
    
    
     public void trazarFigura(Graphics graficador, byte coordenada1[], byte coordenada2[], byte coordenada3[], byte coordenada4[]){
        switch(super.getColor()){
            case "ROJO":
                graficador.setColor(Color.RED);
                break;
            case "VERDE":
                graficador.setColor(Color.GREEN);
                break;
            case "AZUL":
                graficador.setColor(Color.BLUE);
                break;
            case "AMARILLO":
                graficador.setColor(Color.YELLOW);
                break;
            case "NEGRO":
                graficador.setColor(Color.BLACK);
                break;
            case "NARANJA":
                graficador.setColor(Color.ORANGE);
                break;
        }
        
        /*graficador.drawLine(coordenada1[0]*50+10, 500-(coordenada1[1]*50), coordenada2[0]*50+10, 500-coordenada2[1]*50);
        graficador.drawLine(coordenada2[0]*50+10, 500-coordenada2[1]*50, coordenada3[0]*50+10, 500-coordenada3[1]*50);
        graficador.drawLine(coordenada3[0]*50+10, 500-coordenada3[1]*50, coordenada1[0]*50+10, 500-coordenada1[1]*50);*/
        
        int[] xCoordenadas = {coordenada1[0]*50+10, coordenada2[0]*50+10, coordenada3[0]*50+10, coordenada4[0]*50+10};
        int[] yCoordenadas = {510-coordenada1[1]*50, 510-coordenada2[1]*50, 510-coordenada3[1]*50, 510-coordenada4[1]*50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 4);
    }
}
