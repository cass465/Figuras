/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Graphics;

/**
 * Interface que contiene el comportamiento grafico de las figuras en el programa
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public interface IDibujar {
    /**
     * Metodo que graficara la figura
     *
     * @param graficador Variable que permite dar caracteristicas de graficacion
     */
    public void trazarFigura(Graphics graficador);
}
