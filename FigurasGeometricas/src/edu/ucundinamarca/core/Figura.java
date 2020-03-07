/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 * Clase que crea las figuras que se van a graficar
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public abstract class Figura implements IFigura, IDibujar {

    /**
     * Primera coordenada x,y de la figura
     */
    private byte[] coordenada1;

    /**
     * Segunda coordenada x,y de la figura
     */
    private byte[] coordenada2;

    /**
     * Tercera coordenada x,y de la figura
     */
    private byte[] coordenada3;

    /**
     * Lado que comparten todas las figuras
     */
    private float lado1;

    /**
     * Area de la figura
     */
    private float area;

    /**
     * Perimetro de la figura
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

    /**
     * Metodo que establece el area
     *
     * @param area Valor de area que se va a asignar
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Metodo que establece el perimetro
     *
     * @param perimetro Valor de perimetro que se va a asignar
     */
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

    /**
     * Metodo que obtiene la primera coordenada x,y de la figura
     *
     * @return Devuelve la primera coordenada x,y de la figura
     */
    public byte[] getCoordenada1() {
        return coordenada1;
    }

    /**
     * Metodo que obtiene la segunda coordenada x,y de la figura
     *
     * @return Devuelve la segunda coordenada x,y de la figura
     */
    public byte[] getCoordenada2() {
        return coordenada2;
    }

    /**
     * Metodo que obtiene la tercera coordenada x,y de la figura
     *
     * @return Devuelve la tercera coordenada x,y de la figura
     */
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
