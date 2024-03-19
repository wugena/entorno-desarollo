package app;
import Modelo.Rectangulo;
public class Figuramain {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3);
		
		int area1 = r1.getarea();
		int permetro =r2.GetAltura();
		
		System.out.println("El area del rectangulo 1 es "+ area1);
		System.out.println("El perimetro del rectangulo 2 es " + permetro);
		
	}

}
