package Modelo;

import java.util.*;


public class Triangulo {

    
   
    

    private int base;

    private int  altura;
	
    public Triangulo () {
    	this.base =5;
    	this.altura=10;
    }
    public  Triangulo(int base, int altura) {
      this.base=base;
      this.altura=altura;
    }

   
    /**
     * Modifica base de la personas
     * @param base
     */
    public void Setbase(int base) {
        this.base=base;
    }

    /**
     * devuelve la base de rectangulo
     * @return
     */
    public int GetBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * Modifica Altura de la personas
     * @param Altura
     */
    public void SetAltura(int altura) {
      this.altura=altura;
    }

   
    public int GetAltura() {
        // TODO implement here
        return this.altura;
    }

    /**
     * base * altura
     * @return
     */
    public int  getarea() {
        
        return altura/2;
    }

    /**
     * 2base*2altura
     * @return
     */
    public int getperimetro() {
        // TODO implement here
        return altura+altura+altura;
    }

}