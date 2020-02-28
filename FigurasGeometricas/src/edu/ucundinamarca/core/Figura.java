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
    private float lado1;
    private float area;
    private float perimetro;
    private String color;

    public Figura(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, String color) {
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;
    }

    public boolean validarCoordenadas(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3) {
        float lado1CatetoX = coordenada2[0]-coordenada1[0];
        float lado1CatetoY = coordenada2[1]-coordenada1[1];
        
        float pendiente1 = 0;
        if(lado1CatetoX != 0 && lado1CatetoY != 0){
            pendiente1 = lado1CatetoY/lado1CatetoX;
        }
        
        float lado2CatetoX = coordenada3[0]-coordenada1[0];
        float lado2CatetoY = coordenada3[1]-coordenada1[1];
        
        float pendiente2 = 0;
        if(lado2CatetoX != 0 && lado2CatetoY != 0){
            pendiente2 = lado2CatetoY/lado2CatetoX;
        }
        
        if(pendiente1 == pendiente2){
            return false;
        }
        else{
            return true;
        }
    }

    public void trazarFigura(Graphics graficador, byte coordenada1[], byte coordenada2[], byte coordenada3[]) {
        switch (this.color) {
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
        int[] xCoordenadas = {coordenada1[0] * 50 + 10, coordenada2[0] * 50 + 10, coordenada3[0] * 50 + 10};
        int[] yCoordenadas = {510 - coordenada1[1] * 50, 510 - coordenada2[1] * 50, 510 - coordenada3[1] * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }

    public void hallarArea(float base, float altura){
        this.area = (base * altura)/2;
    }

    public void hallarPerimetro(float lado1, float lado2, float lado3){
        this.perimetro = lado1 + lado2 + lado3;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado1() {
        return lado1;
    }
    
    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    public String getColor() {
        return color;
    }

}
