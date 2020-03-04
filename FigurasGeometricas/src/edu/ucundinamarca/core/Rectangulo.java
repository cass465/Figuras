/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Graphics;

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
     * @param coordenada1 coordenadas X y Y que componen el primer punto del
     * cuadrilatero
     * @param coordenada2 coordenadas X y Y que componen el segundo punto del
     * cuadrilatero
     * @param coordenada3 coordenadas X y Y que componen el tercer punto del
     * cuadrilatero
     * @param coordenada4 coordenadas X y Y que componen el cuarto punto del
     * cuadrilatero
     * @param color color que tomara la figura en el plano cartesiano,
     */
    public Rectangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, coordenada4, color);
    }

    
    /**
     * Establece el valor del lado2 del rectangulo a apartir de dos coordenadas
     *
     * @param coordenada2 ,coordenadas X y Y que componen el segundo punto del
     * rectangulo
     * @param coordenada3,coordenadas X y Y que componen el tercer punto del
     * rectangulo
     */
    public void calcularLado2(byte coordenada2[], byte coordenada3[]) {
        this.lado2 = ((coordenada3[1] - coordenada2[1]));

    }

    /**
     * Se sobreescribe el metodo para validar las coordenadas del rectangulo
     *
     * @return boolean true, coordenadas correctas ; false, coordenadas
     * incorrectas
     */
    @Override
    public boolean validarCoordenadas() {
        if ((super.getCoordenada1()[0] == super.getCoordenada2()[0] && super.getCoordenada1()[1] == super.getCoordenada2()[1])
                || (super.getCoordenada1()[0] == super.getCoordenada3()[0] && super.getCoordenada1()[1] == super.getCoordenada3()[1])
                || (super.getCoordenada1()[0] == super.getCoordenada4()[0] && super.getCoordenada1()[1] == super.getCoordenada4()[1])
                || (super.getCoordenada2()[0] == super.getCoordenada3()[0] && super.getCoordenada2()[1] == super.getCoordenada3()[1])
                || (super.getCoordenada2()[0] == super.getCoordenada4()[0] && super.getCoordenada2()[1] == super.getCoordenada4()[1])
                || (super.getCoordenada3()[0] == super.getCoordenada4()[0] && super.getCoordenada3()[1] == super.getCoordenada4()[1])) {
            return false;
        }
        if (super.getCoordenada1()[1] != super.getCoordenada2()[1] || super.getCoordenada1()[0] == super.getCoordenada2()[0]) {
            return false;
        } else if (super.getCoordenada2()[0] != super.getCoordenada3()[0]) {
            return false;
        } else if (super.getCoordenada3()[1] != super.getCoordenada4()[1]) {
            return false;
        } else if (super.getCoordenada1()[0] != super.getCoordenada4()[0]) {
            return false;
        } else if ((super.getCoordenada1()[0] + super.getCoordenada2()[0] == super.getCoordenada2()[1] + super.getCoordenada3()[1])) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void hallarArea() {
        super.setArea((super.getLado1() * this.lado2));
    }

    @Override
    public void hallarPerimetro() {
        System.out.println(super.getLado1() * 2);
        System.out.println(this.lado2 * 2);
        super.setPerimetro(((super.getLado1() * 2) + (this.lado2 * 2)));
    }
}
