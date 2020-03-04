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
public abstract class Figura implements IOperaciones{

    /**
     * Primera coordenada x,y de la figura
     */
    private byte[] coordenada1;

    /**
     * Segunda coordenada x,y de la figura
     */
    private byte[] coordenada2;

    /**
     * ercera coordenada x,y de la figura
     */
    private byte[] coordenada3;

    /**
     * ado que comparten todas las figuras
     */
    private float lado1;

    /**
     * rea de la figura
     */
    private float area;

    /**
     * erimetro de la figura
     */
    private float perimetro;

    /**
     * Color de la figura
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
     * Metodo que establece el primer lado
     *
     * @param lado1 lado que se va a establecer
     */
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    /**
     * Metodo que obtiene el primer lado
     *
     * @return Devuelve el primer lado
     */
    public float getLado1() {
        return lado1;
    }

    public byte[] getCoordenada1() {
        return coordenada1;
    }

    public byte[] getCoordenada2() {
        return coordenada2;
    }

    public byte[] getCoordenada3() {
        return coordenada3;
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
