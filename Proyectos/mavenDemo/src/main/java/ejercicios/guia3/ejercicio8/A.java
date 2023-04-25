package ejercicios.guia3.ejercicio8;

import java.io.IOException;

public class A {
	
	
	public void a() throws Exception {
		
		double b = 1.0;
		
		excepcionA(b);
	}
	
	//Checked
		public double excepcionA(double b) throws Exception {
			
		if (b == 0) {
			
			throw new Exception("Este es un ejemplo de una checked exception");
			}
			 
			        return b;
			    }
		


	//Unchecked
	public void b() {
		excepcionB();
		}
			
		

	public void excepcionB() {
		
		   new RuntimeException("este es un ejemplo de una excepcion unchecked!!!!!!!!!!!!!!!!!!!!!");

		}
	}
	
