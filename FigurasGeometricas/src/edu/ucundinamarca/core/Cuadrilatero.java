/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase padre de cuadrado y rectangulo, clase hija de Figura
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class Cuadrilatero extends Figura {

    /**
     * @see Atributo que obtiene la cordenada 4 del cuadrilatero
     */
    private byte[] coordenada4;

    /**
     * Constructor de la clase Cuadrilatero
     *
     * @param coordenada1 coordenadas X y Y que componen el primer punto del cuadrilatero
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del cuadrilatero
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del cuadrilatero
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del cuadrilatero
     * @param color color que tomara la figura en el plano cartesiano
     */
    public Cuadrilatero(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, color);
        this.coordenada4 = coordenada4;
    }

    /**
     * Metodo para validar que las coordenadas ingresadas sean correctas
     *
     * @param coordenada1 coordenadas X y Y que componen el primer punto del cuadrilatero 
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del cuadrilatero 
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del cuadrilatero 
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del cuadrilatero
     * @return bool true para coodenadas correctas, false para coordenas incorrectas
     */
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
        } else if ((coordenada1[0] + coordenada2[0] != coordenada2[1] + coordenada3[1])) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * Metodo utilizado para graficar la figura en el plano cartesiano segun las
     * coordenadas enviadas
     *
     * @param graficador  permite graficar
     * @param coordenada1 coordenadas X y Y que componen el primer punto del cuadrilatero 
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del cuadrilatero 
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del cuadrilatero 
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del cuadrilatero
     */
    public void trazarFigura(Graphics graficador, byte coordenada1[], byte coordenada2[], byte coordenada3[], byte coordenada4[]) {
        switch (super.getColor()) {
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
        int[] xCoordenadas = {coordenada1[0] * 50 + 10, coordenada2[0] * 50 + 10, coordenada3[0] * 50 + 10, coordenada4[0] * 50 + 10};
        int[] yCoordenadas = {510 - coordenada1[1] * 50, 510 - coordenada2[1] * 50, 510 - coordenada3[1] * 50, 510 - coordenada4[1] * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 4);
    }

    /**
     * Metodo para hallar el area del cuadrilatero formado a partir de su lado
     *
     * @return float (area)
     */
    public float hallarArea() {

        return (super.getLado1() * super.getLado1());

    }

    /**
     * Metodo para hallar el perimetro del cuadrilatero a partir de su lado
     *
     * @return float (perimetro)
     */
    public float hallarPerimetro() {
        return (super.getLado1() * 4);
    }

    /**
     * Establece el valor del lado1 del cuadrilatero a partir de dos coordenadas
     *
     * @param coordenada1,coordenadas X y Y que componen el primer punto del cuadrilatero
     * @param coordenada2,coordenadas X y Y que componen el segundo punto del cuadrilatero
     */
    public void calcularLado1(byte coordenada1[], byte coordenada2[]) {
        super.setLado1((coordenada2[0] - coordenada1[0]));

    }

}
