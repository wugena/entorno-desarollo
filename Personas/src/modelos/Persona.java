package modelos;

public class Persona {//definir el varriable
	private String nombre;
	private String apellidos;
	private int edad ;
	
	public Persona (String nombre , String apellidos, int edad) {//constructor y la exception apra controlarlo
		if(edad<0 || edad > 130) {
			throw new IllegalArgumentException ("la edad debe estar entre 0 y 130 ");//la exception
		}
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
		
	}
	public void Setnombre(String nombre) {
		this.nombre = nombre;
	    }
	
	    public String  Getnombre() {
	       
	        return this.nombre;
	    }
	    
	    public void setapellidos (String apellidos) {
	    	this.apellidos = apellidos;
	    }
	    public String Getapellidos() {
	    	return this.apellidos;
	    }
	    
	    public void setedad (int edad) {
	    	this.edad = edad;
	    }
	    public int Getedad () {
	    	return edad;
	    }
	    /**
	     * 
	     * @return para comprobar la eda d
	     */
	    
	    public String mostrarEdad () {
	    	if(edad<18 ) {
	    		return "menor de edad";
	    	}else if(edad<65 && edad>=18) {
	    		return"mayor de edad";
	    	}else {
	    		return"Estan jubilado";
	    		
	    	}
			
	    	
	    }
	    }

