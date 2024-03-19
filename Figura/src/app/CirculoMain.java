package app;
import Modelo.Circulo;
public class CirculoMain {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(0);
		Circulo c2 = new Circulo(0);
		
		int area1 = c1.getarea();
		int permetro =c2.getperimetro();
		
		System.out.println("El area del rectangulo 1 es "+ area1);
		System.out.println("El perimetro del rectangulo 2 es " + permetro);

	}

}
