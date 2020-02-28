/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 * Clase hija de cudrilatero, figura rectangulo
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class Rectangulo extends Cuadrilatero {

    /**
     * Lado 2 del rectangulo
     */
    private float lado2;

    /**
     * Constructor de la clase
     *
     * @param coordenada1 coordenadas X y Y que componen el primer punto del cuadrilatero
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del cuadrilatero
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del cuadrilatero
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del cuadrilatero
     * @param color color que tomara la figura en el plano cartesiano,
     */
    public Rectangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, coordenada4, color);
    }

    /**
     * Se sobreescribe el metodo para validar las coordenadas del rectangulo
     *
     * @param coordenada1 coordenadas X y Y que componen el primer punto del rectangulo
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del rectangulo
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del rectangulo
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del rectangulo
     * @return boolean true, coordenadas correctas ; false, coordenadas incorrectas
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
        } else if ((coordenada1[0] + coordenada2[0] == coordenada2[1] + coordenada3[1])) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * Metodo para hallar el area del rectangulo a partir de sus lados
     *
     * @return float (area)
     */
    @Override
    public float hallarArea() {

        return (super.getLado1() * this.lado2);

    }

    /**
     * Metodo para hallar el perimetro del rectangulo a partir de sus lados
     *
     * @return float (area)
     */
    @Override
    public float hallarPerimetro() {
        return ((super.getLado1() * 2) + (this.lado2 * 2));
    }

    /**
     * Establece el valor del lado2 del rectangulo a apartir de dos coordenadas
     *
     * @param coordenada2 ,coordenadas X y Y que componen el segundo punto del rectangulo
     * @param coordenada3,coordenadas X y Y que componen el tercer punto del rectangulo
     */
    public void calcularLado2(byte coordenada2[], byte coordenada3[]) {
        this.lado2 = ((coordenada3[1] - coordenada2[1]));

    }
}
