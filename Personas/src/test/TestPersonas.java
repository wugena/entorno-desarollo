package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import modelos.Persona;

class TestPersonas {

	@Test
	void MostraEdadnegativo() {
		Exception excepcion =    assertThrows(IllegalArgumentException.class, () -> new Persona ("","",-1));
		String esperado = "la edad debe estar entre 0 y 130 ";
		String obtenida = excepcion.getMessage();
		assertEquals(esperado,obtenida);
				
	}
	@Test
	void MostraEdad0() {
		Persona p1= new Persona("","",0);
		String edadEspera= "menor de edad";
		String edadobtiene = p1.mostrarEdad();
		assertEquals(edadEspera,edadobtiene);
	}
	@Test
	void MostraEdad17() {
		Persona p1= new Persona("","",17);
		String edadEspera= "menor de edad";
		String edadobtiene = p1.mostrarEdad();
		assertEquals(edadEspera,edadobtiene);
	}
	@Test
	void MostraEdad18() {
		Persona p1= new Persona("","",18);
		String edadEspera= "mayor de edad";
		String edadobtiene = p1.mostrarEdad();
		assertEquals(edadEspera,edadobtiene);
	}
	@Test
	void MostraEdad65() {
		Persona p1= new Persona("","",65);
		String edadEspera= "Estan jubilado";
		String edadobtiene = p1.mostrarEdad();
		assertEquals(edadEspera,edadobtiene);
	}
	@Test
	void MostraEdad66() {
		Persona p1= new Persona("","",66);
		String edadEspera= "Estan jubilado";
		String edadobtiene = p1.mostrarEdad();
		assertEquals(edadEspera,edadobtiene);
	}
		@Test
		void MostraEdad130() {
			Exception excepcion =    assertThrows(IllegalArgumentException.class, () -> new Persona ("","",130));
			String esperado = "la edad debe estar entre 0 y 130 ";
			String obtenida = excepcion.getMessage();
			assertEquals(esperado,obtenida);
			
			
					
		}
	@Test
	void MostraEdad131() {
		Exception excepcion =    assertThrows(IllegalArgumentException.class, () -> new Persona ("","",131));
		String esperado = "la edad debe estar entre 0 y 130 ";
		String obtenida = excepcion.getMessage();
		assertEquals(esperado,obtenida);
				
	}
}
