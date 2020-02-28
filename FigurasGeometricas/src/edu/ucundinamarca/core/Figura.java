/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que crea las figuras que se van a graficar
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Figura {

    /**
     * @see Primera coordenada x,y de la figura
     */
    private byte[] coordenada1;

    /**
     * @see Segunda coordenada x,y de la figura
     */
    private byte[] coordenada2;

    /**
     * @see Tercera coordenada x,y de la figura
     */
    private byte[] coordenada3;

    /**
     * @see Lado que comparten todas las figuras
     */
    private float lado1;

    /**
     * @see Area de la figura
     */
    private float area;

    /**
     * @see Perimetro de la figura
     */
    private float perimetro;

    /**
     * @see Color de la figura
     */
    private String color;

    /**
     * Constructor de la clase
     *
     * @param coordenada1 primera coordenada x,y de la figura
     * @param coordenada2 segunda coordenada x,y de la figura
     * @param coordenada3 tercera coordenada x,y de la figura
     * @param color guarda el color de la figura
     */
    public Figura(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, String color) {
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.coordenada3 = coordenada3;
        this.color = color;
    }

    /**
     * Metodo que valida si las coordenadas de la figura son coherentes
     *
     * @param coordenada1 primera coordenada x,y de la figura
     * @param coordenada2 segunda coordenada x,y de la figura
     * @param coordenada3 tercera coordenada x,y de la figura
     * @return indica si las coordenadas son coherentes o no
     */
    public boolean validarCoordenadas(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3) {
        float lado1CatetoX = coordenada2[0] - coordenada1[0];
        float lado1CatetoY = coordenada2[1] - coordenada1[1];

        float pendiente1 = 0;
        if (lado1CatetoX != 0 && lado1CatetoY != 0) {
            pendiente1 = lado1CatetoY / lado1CatetoX;
        }

        float lado2CatetoX = coordenada3[0] - coordenada1[0];
        float lado2CatetoY = coordenada3[1] - coordenada1[1];

        float pendiente2 = 0;
        if (lado2CatetoX != 0 && lado2CatetoY != 0) {
            pendiente2 = lado2CatetoY / lado2CatetoX;
        }

        if (pendiente1 == pendiente2) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que grafica la figura en el plano cartesiano con las coordenadas
     * especificadas
     *
     * @param graficador Objeto de la clase Graphics que contiene los metodos de
     * graficacion
     * @param coordenada1 primera coordenada x,y de la figura
     * @param coordenada2 segunda coordenada x,y de la figura
     * @param coordenada3 tercera coordenada x,y de la figura
     */
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

        int[] xCoordenadas = {coordenada1[0] * 50 + 10, coordenada2[0] * 50 + 10, coordenada3[0] * 50 + 10};
        int[] yCoordenadas = {510 - coordenada1[1] * 50, 510 - coordenada2[1] * 50, 510 - coordenada3[1] * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }

    /**
     * Metodo que calcula el area de la figura
     *
     * @param base En caso del triangulo recibe la base
     * @param altura En caso del triangulo recibe la altura
     */
    public void hallarArea(float base, float altura) {
        this.area = (base * altura) / 2;
    }

    /**
     * Metodo que calcula el perimetro de la figura
     *
     * @param lado1 En caso del tiangulo recibe el primer lado
     * @param lado2 En caso del tiangulo recibe el segundo lado
     * @param lado3 En caso del tiangulo recibe el tercer lado
     */
    public void hallarPerimetro(float lado1, float lado2, float lado3) {
        this.perimetro = lado1 + lado2 + lado3;
    }

    /**
     * Metodo que establece el primer lado
     *
     * @param lado1 lado que se va a establecer
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    /**
     * Metodo que obtiene el primer lado
     *
     * @return Devuelve el primer lado
     */
    public float getLado1() {
        return lado1;
    }

    /**
     * Metodo que obtiene el area de la figura
     *
     * @return Devuelve el area de la figura
     */
    public float getArea() {
        return area;
    }

    /**
     * Metodo que obtiene el perimetro de la figura
     *
     * @return Devuelve el perimetro de la figura
     */
    public float getPerimetro() {
        return perimetro;
    }

    /**
     * Metodo que obtiene el color de la figura
     *
     * @return Devuelve el color de la figura
     */
    public String getColor() {
        return color;
    }

}
