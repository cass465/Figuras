/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Graphics;

/**
 *
 * @author cass465
 */
public interface IOperaciones {
    
    public void trazarFigura(Graphics graficador);
    public boolean validarCoordenadas();
    public void hallarArea();
    public void hallarPerimetro();
}
