package app;

import Modelo.Triangulo;

public class TrianguloMain {

	public static void main(String[] args) {
		Triangulo T1 = new Triangulo();
		Triangulo T2 = new Triangulo(2,3);
			
		int area1 = T1.getarea();
		int permetro =T2.GetAltura();
		System.out.println("El area del Triangulo 1 es "+ area1);
		System.out.println("El perimetro del Triangulo 2 es " + permetro);
	}

}
