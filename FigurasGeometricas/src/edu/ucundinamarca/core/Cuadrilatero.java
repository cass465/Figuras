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
public abstract class Cuadrilatero extends Figura {

    /**
     * Atributo que obtiene la cordenada 4 del cuadrilatero
     */
    private byte[] coordenada4;

    /**
     * Constructor de la clase Cuadrilatero
     *
     * @param coordenada1 coordenadas X y Y que componen el primer punto del
     * cuadrilatero
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del
     * cuadrilatero
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del
     * cuadrilatero
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del
     * cuadrilatero
     * @param color color que tomara la figura en el plano cartesiano
     */
    public Cuadrilatero(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, color);
        this.coordenada4 = coordenada4;
    }

    /**
     * Metodo que grafica el cuadrilatero en el plano cartesiano
     *
     * @param graficador Variable que permite dar caracteristicas de graficacion
     */
    @Override
    public void trazarFigura(Graphics graficador) {
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

        int[] xCoordenadas = {super.getCoordenada1()[0] * 50 + 10, super.getCoordenada2()[0] * 50 + 10, super.getCoordenada3()[0] * 50 + 10, this.coordenada4[0] * 50 + 10};
        int[] yCoordenadas = {510 - super.getCoordenada1()[1] * 50, 510 - super.getCoordenada2()[1] * 50, 510 - super.getCoordenada3()[1] * 50, 510 - this.coordenada4[1] * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 4);
    }

    /**
     * Establece el valor del lado1 del cuadrilatero a partir de dos coordenadas
     *
     * @param coordenada1,coordenadas X y Y que componen el primer punto del
     * cuadrilatero
     * @param coordenada2,coordenadas X y Y que componen el segundo punto del
     * cuadrilatero
     */
    public void calcularLado1(byte coordenada1[], byte coordenada2[]) {
        super.setLado1((coordenada2[0] - coordenada1[0]));

    }

    /**
     * Metodo que obtiene la cuarta coordenada x,y del cuadrilatero
     *
     * @return Devuelve la cuarta coordenada x,y del cuadrilatero
     */
    public byte[] getCoordenada4() {
        return coordenada4;
    }
}
