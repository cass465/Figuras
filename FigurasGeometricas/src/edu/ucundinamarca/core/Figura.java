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
 * @author cass465
 */
public class Figura {
    private byte[] coordenada1;
    private byte[] coordenada2;
    private byte[] coordenada3;
    private byte area;
    private byte perimetro;
    private String color;

    public Figura(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, String color) {
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;
    }

    public boolean validarCoordenadas(float[] coordenada1, float[] coordenada2, float[] coordenada3) {
        return false;
    }
    
    public void trazarFigura(Graphics graficador, byte coordenada1[], byte coordenada2[], byte coordenada3[]){
        switch(this.color){
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
        
        int[] xCoordenadas = {coordenada1[0]*50+10, coordenada2[0]*50+10, coordenada3[1]*50+10};
        int[] yCoordenadas = {500-coordenada1[1]*50, 500-coordenada2[1]*50, 500-coordenada3[1]*50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }
}
