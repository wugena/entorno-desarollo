package Modelo;


import java.util.*;

public class Rectangulo {

    
    private int base;
    private int  altura;

    public  Rectangulo() {
    	this.base = 1;
        this.altura = 1;
     
    }
    public Rectangulo(int base, int altura) {
    	this.base=base;
    	this.altura=altura;
    }
   

    /**
     * Modifica base de la personas
     * @param base
     */
    public void Setbase(int base) {
       this.base= base;
    }

    /**
     * devuelve la base de rectangulo
     * @return
     */
    public int GetBase() {
       
        return this.base;
    }

    /**
     * Modifica Altura de la personas
     * @param Altura
     */
    public void SetAltura(int altura) {
        this.altura=altura;
    }

    /**
     * devuelve la Altura de rectangulo
     * @return
     */
    public int GetAltura() {
        // TODO implement here
        return this.altura;
    }

    
    public int  getarea() {
        // TODO implement here
        return base * altura;
    }

    /**
     * 2base*2altura
     * @return
     */
    public int getperimetro() {
        
        return 2*base + 2*altura;
    }

}