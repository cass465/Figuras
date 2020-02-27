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
    private float[] coordenada1;
    private float[] coordenada2;
    private float[] coordenada3;
    private float area;
    private float perimetro;
    private String color;

    public Figura(float[] coordenada1, float[] coordenada2, float[] coordenada3, String color) {
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;
    }

    public boolean validarCoordenadas(float[] coordenada1, float[] coordenada2, float[] coordenada3) {
        return false;
    }
    
    public void trazarFigura(Graphics graficador, float coordenada1[], float coordenada2[], float coordenada3[]){
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
            default:
                graficador.setColor(Color.RED);
                break;
        }
        
        graficador.drawLine((int)coordenada1[0]*50+10, 500-(int)coordenada1[1]*50, (int)coordenada2[0]*50+10, 500-(int)coordenada2[1]*50);
        graficador.drawLine((int)coordenada2[0]*50+10, 500-(int)coordenada2[1]*50, (int)coordenada3[0]*50+10, 500-(int)coordenada3[1]*50);
        graficador.drawLine((int)coordenada3[0]*50+10, 500-(int)coordenada3[1]*50, (int)coordenada1[0]*50+10, 500-(int)coordenada1[1]*50);
    }
}
