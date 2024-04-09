package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class Test_algoritmo {

	@Test
	void sumatorio() {
		int SumaEsperada = 10;
		int SumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(SumaEsperada, SumaObtenida);
	}
	@Test
	void factorial() {
		int FactorialEsperada = 24;
		int FactorialObtenida = Algoritmos.Factorial(4);
		assertEquals(FactorialEsperada, FactorialObtenida);
	}
}
