package Modelo;
import java.util.*;

/**
 * 
 */
public class Circulo {

	private int Radio;
    
   
    public  Circulo(int Radio) {
        this.Radio=15;
    }

    
   

    /**
     * Modifica base de la personas
     * @param base
     */
    public void SetRadio(int Radio) {
    	 this.Radio=Radio;
    }

    /**
     * devuelve la base de rectangulo
     * @return
     */
    public int GetRadio() {
        
        return this.Radio;
    }

    /**
     * base * altura
     * @return
     */
    public int  getarea() {
       
        return (int) (Radio*Math.PI);
    }

    /**
     * 2base*2altura
     * @return
     */
    public int getperimetro() {
        // TODO implement here
        return (int) (2*Math.PI*Radio);
    }

}