/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que crea los triangulos que se van a graficar
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Triangulo extends Figura {

    /**
     * Segundo lado del triangulo
     */
    private float lado2;

    /**
     * Tercer lado del triangulo
     */
    private float lado3;

    /**
     * Base del triangulo
     */
    private float base;

    /**
     * Altura del triangulo
     */
    private float altura;

    /**
     * Tipo del triangulo segun sus caracteristicas
     */
    private String tipo;

    /**
     * Constructor de la clase
     *
     * @param coordenada1 primera coordenada x,y de la figura
     * @param coordenada2 segunda coordenada x,y de la figura
     * @param coordenada3 tercera coordenada x,y de la figura
     * @param color Color de la figura seleccionado por el usuario
     */
    public Triangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, String color) {
        super(coordenada1, coordenada2, coordenada3, color);
    }

    /**
     * Metodo que define cual es el tipo del triangulo especificado por medio de
     * coordenadas x,y
     *
     * @param coordenada1 primera coordenada x,y de la figura
     * @param coordenada2 segunda coordenada x,y de la figura
     * @param coordenada3 tercera coordenada x,y de la figura
     */
    public void definirTipo(byte coordenada1[], byte coordenada2[], byte coordenada3[]) {
        float lado1Cateto1 = Math.abs(coordenada2[0] - coordenada1[0]);
        float lado1Cateto2 = Math.abs(coordenada2[1] - coordenada1[1]);
        this.setLado1((float) Math.sqrt((lado1Cateto1 * lado1Cateto1) + (lado1Cateto2 * lado1Cateto2)));

        float lado2Cateto1 = Math.abs(coordenada3[0] - coordenada2[0]);
        float lado2Cateto2 = Math.abs(coordenada3[1] - coordenada2[1]);
        this.lado2 = (float) Math.sqrt((lado2Cateto1 * lado2Cateto1) + (lado2Cateto2 * lado2Cateto2));

        float lado3Cateto1 = Math.abs(coordenada1[0] - coordenada3[0]);
        float lado3Cateto2 = Math.abs(coordenada1[1] - coordenada3[1]);
        this.lado3 = (float) Math.sqrt((lado3Cateto1 * lado3Cateto1) + (lado3Cateto2 * lado3Cateto2));

        if (this.getLado1() == lado2 && this.getLado1() == lado3 && lado2 == lado3) {
            this.tipo = "EQUILATERO";
        } else if (this.getLado1() != lado2 && this.getLado1() != lado3 && lado2 != lado3) {
            this.tipo = "ESCALENO";
        } else {
            this.tipo = "ISOSCELES";
        }
    }

    /**
     * Metodo que calcula la base del triangulo segun su tipo
     *
     * @param lado1 Primer lado del triangulo
     * @param lado2 Segundo lado del triangulo
     * @param lado3 Tercer lado del triangulo
     * @param tipo Tipo del triangulo especificado
     */
    public void hallarBase(float lado1, float lado2, float lado3, String tipo) {
        if (tipo.equals("EQUILATERO")) {
            this.base = super.getLado1();
        } else if (tipo.equals("ESCALENO")) {
            this.base = super.getLado1();
        } else {
            if (lado1 == lado2) {
                this.base = this.lado3;
            }
            if (lado1 == lado3) {
                this.base = this.lado2;
            }
            if (lado2 == lado3) {
                this.base = this.getLado1();
            }
        }
    }

    /**
     * Metodo que calcula la altura del triangulo segun su tipo
     *
     * @param lado1 Primer lado del triangulo
     * @param lado2 Segundo lado del triangulo
     * @param lado3 Tercer lado del triangulo
     * @param tipo Tipo del triangulo especificado
     */
    public void hallarAltura(float lado1, float lado2, float lado3, String tipo) {
        if (tipo.equals("EQUILATERO")) {
            this.altura = (float) Math.sqrt((this.base * this.base) - ((this.base / 2) * (this.base / 2)));
        } else if (tipo.equals("ESCALENO")) {
            float semiperimetro = ((lado1 + lado2 + lado3) / 2);
            this.altura = (float) ((2 / this.getLado1()) * (Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3))));
        } else {
            float cateto = 0;

            if (lado1 == lado2) {
                cateto = this.getLado1();
            }
            if (lado1 == lado3) {
                cateto = this.getLado1();
            }
            if (lado2 == lado3) {
                cateto = this.lado2;
            }
            this.altura = (float) (Math.sqrt((cateto * cateto) - ((this.base / 2) * (this.base / 2))));
        }
    }

    /**
     * Obtiene el segundo lado del triangulo
     *
     * @return Devuelve el segundo lado del triangulo
     */
    public float getLado2() {
        return lado2;
    }

    /**
     * Obtiene el tercer lado del triangulo
     *
     * @return Devuelve el tercer lado del triangulo
     */
    public float getLado3() {
        return lado3;
    }

    /**
     * Obtiene la base del triangulo
     *
     * @return Devuelve la base del triangulo
     */
    public float getBase() {
        return base;
    }

    /**
     * Obtiene la altura del triangulo
     *
     * @return Devuelve la altura del triangulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Obtiene el tipo del triangulo
     *
     * @return Devuelve el tipo del triangulo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que grafica el triangulo en el plano cartesiano
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

        int[] xCoordenadas = {super.getCoordenada1()[0] * 50 + 10, super.getCoordenada2()[0] * 50 + 10, super.getCoordenada3()[0] * 50 + 10};
        int[] yCoordenadas = {510 - super.getCoordenada1()[1] * 50, 510 - super.getCoordenada2()[1] * 50, 510 - super.getCoordenada3()[1] * 50};
        graficador.fillPolygon(xCoordenadas, yCoordenadas, 3);
    }

    /**
     * Metodo que valida que las coordenadas del triangulo sean coherentes
     *
     * @return boolean true, coordenadas correctas o false, coordenadas
     * incorrectas
     */
    @Override
    public boolean validarCoordenadas() {
        float lado1CatetoX = super.getCoordenada2()[0] - super.getCoordenada1()[0];
        float lado1CatetoY = super.getCoordenada2()[1] - super.getCoordenada1()[1];

        float pendiente1 = 0;
        if (lado1CatetoX != 0 && lado1CatetoY != 0) {
            pendiente1 = lado1CatetoY / lado1CatetoX;
        }

        float lado2CatetoX = super.getCoordenada3()[0] - super.getCoordenada1()[0];
        float lado2CatetoY = super.getCoordenada3()[1] - super.getCoordenada1()[1];

        float pendiente2 = 0;
        if (lado2CatetoX != 0 && lado2CatetoY != 0) {
            pendiente2 = lado2CatetoY / lado2CatetoX;
        }

        if (pendiente1 == pendiente2) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Metodo que calcula el area del triangulo
     */
    @Override
    public void hallarArea() {
        super.setArea((this.base * this.altura) / 2);
    }

    /**
     * Metodo que calcula el perimetro del triangulo
     */
    @Override
    public void hallarPerimetro() {
        super.setPerimetro(super.getLado1() + this.lado2 + this.lado3);
    }
}
