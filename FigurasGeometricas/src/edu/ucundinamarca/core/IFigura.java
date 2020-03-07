/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 * Interface que contiene el comportamiento de las figuras en el programa
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public interface IFigura {
    
    /**
     * Metodo que valida si las coordenadas de la figura son coherentes
     *
     * @return boolean true si la validacion es correcta o false si no lo es
     */
    public boolean validarCoordenadas();

    /**
     * Metodo que calcula el area de la figura
     */
    public void hallarArea();

    /**
     * Metodo que calcula el perimetro de la figura
     */
    public void hallarPerimetro();
}
