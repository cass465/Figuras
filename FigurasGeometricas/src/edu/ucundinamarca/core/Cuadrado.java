/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 * Clase hija de cudrilatero, figura cuadrado
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class Cuadrado extends Cuadrilatero {

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
     * @param color, color que tomara la figura en el plano cartesiano
     */
    public Cuadrado(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, byte[] coordenada4, String color) {
        super(coordenada1, coordenada2, coordenada3, coordenada4, color);

    }

    /**
     * Metodo que valida que las coordenadas del cuadrado sean coherentes
     *
     * @return boolean true, coordenadas correctas o false, coordenadas
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
        } else if ((super.getCoordenada1()[0] + super.getCoordenada2()[0] != super.getCoordenada2()[1] + super.getCoordenada3()[1])) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que calcula el area del cuadrado
     */
    @Override
    public void hallarArea() {
        super.setArea(super.getLado1() * super.getLado1());
    }

    /**
     * Metodo que clacula el perimetro del cuadrado
     */
    @Override
    public void hallarPerimetro() {
        super.setPerimetro(super.getLado1() * 4);
    }
}
