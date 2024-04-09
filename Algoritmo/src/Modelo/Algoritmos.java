package Modelo;

public abstract class Algoritmos {
	/**
	 * Devuelve el sumatorio del numero especifico
	 * 
	 * @param numero  el numero del que queremos calcular el sumatorio
	 * @return		  el sumatoriio del numero especificado
	 */
	public static int sumatorio(int numero)
	{
		int numTotal = 0;
		for (int i = 0; i < numero; i++)
		{
			numTotal += (1 + i);
		}
		return numTotal;
	}
	/**
	 * Devuelve el factorial del numero especifico
	 * 
	 * @param numero  el numero del que queremos calcular el factorial
	 * @return		  el sumatoriio del numero especificado
	 */
	public static int Factorial(int numero)
	{
		 int factorio = 1;
		 for (int i = 1; i <= numero; i++) {
			 factorio *= i;
		 }
			 return factorio;
	}
	
}
