/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundinamarca.core;

/**
 *
 * @author cass465
 */
public class Triangulo extends Figura{
    
    private float lado2;
    private float lado3;
    private float base;
    private float altura;
    private String tipo;

    public Triangulo(byte[] coordenada1, byte[] coordenada2, byte[] coordenada3, String color) {
        super(coordenada1, coordenada2, coordenada3, color);
    }
    
    public void definirTipo(byte coordenada1[], byte coordenada2[], byte coordenada3[]){
        float lado1Cateto1 = Math.abs(coordenada2[0]-coordenada1[0]);
        float lado1Cateto2 = Math.abs(coordenada2[1]-coordenada1[1]);
        this.setLado1((float) Math.sqrt((lado1Cateto1 * lado1Cateto1) + (lado1Cateto2 * lado1Cateto2)));
        
        float lado2Cateto1 = Math.abs(coordenada3[0]-coordenada2[0]);
        float lado2Cateto2 = Math.abs(coordenada3[1]-coordenada2[1]);
        this.lado2 = (float) Math.sqrt((lado2Cateto1 * lado2Cateto1) + (lado2Cateto2 * lado2Cateto2));
        
        float lado3Cateto1 = Math.abs(coordenada1[0]-coordenada3[0]);
        float lado3Cateto2 = Math.abs(coordenada1[1]-coordenada3[1]);
        this.lado3 = (float) Math.sqrt((lado3Cateto1 * lado3Cateto1) + (lado3Cateto2 * lado3Cateto2));
        
        if(this.getLado1() == lado2 && this.getLado1() == lado3 && lado2 == lado3){
            this.tipo = "EQUILATERO";
        }
        else if(this.getLado1() != lado2 && this.getLado1() != lado3 && lado2 != lado3){
            this.tipo = "ESCALENO";
        }
        else{
            this.tipo = "ISOSCELES";
        }
    }
    
    public void hallarBase(float lado1, float lado2, float lado3, String tipo){
        if(tipo.equals("EQUILATERO")){
            this.base = this.getLado1();
        }
        else if(tipo.equals("ESCALENO")){
            this.base = this.getLado1();
        }else{
            if(lado1 == lado2){
                this.base = this.lado3;
            }
            if(lado1 == lado3){
                this.base = this.lado2;
            }
            if(lado2 == lado3){
                this.base = this.getLado1();
            }
        }
    }
    
    public void hallarAltura(float lado1, float lado2, float lado3, String tipo){
        if(tipo.equals("EQUILATERO")){
            this.altura = (float) Math.sqrt((this.base * this.base)-((this.base/2)*(this.base/2)));
        }
        else if(tipo.equals("ESCALENO")){
            byte semiperimetro = (byte)((lado1 + lado2 + lado3)/2);
            this.altura = (byte) ((2/this.getLado1()) * (Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado1))));
        }else{
            float cateto = 0;
            
            if(lado1 == lado2){
                cateto = this.getLado1();
            }
            if(lado1 == lado3){
                cateto = this.getLado1();
            }
            if(lado2 == lado3){
                cateto = this.lado2;
            }
            this.altura = (float)(Math.sqrt((cateto * cateto)-((this.base/2)*(this.base/2))));
        }
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public String getTipo() {
        return tipo;
    }
}
