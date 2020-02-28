/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 *
 * @author YEISON
 * @see Clase hija de cudrilatero, figura cuadrado
 * @version 1.0.0
 */
public class Cuadrado extends Cuadrilatero {

    /**
     * @author YEISON
     *
     * @param coordenada1 ,coordenadas X y Y que componen el primer punto del
     * cuadrilatero
     * @param coordenada2 ,coordenadas X y Y que componen el segundo punto del
     * cuadrilatero
     * @param coordenada3 ,coordenadas X y Y que componen el tercer punto del
     * cuadrilatero
     * @param coordenada4 ,coordenadas X y Y que componen el cuarto punto del
     * cuadrilatero
     * @param color, color que tomara la figura en el plano cartesiano
     * @see Metodo constructor de la clase cuadrado
     */
    public Cuadrado(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, coordenada4, color);

    }

}
