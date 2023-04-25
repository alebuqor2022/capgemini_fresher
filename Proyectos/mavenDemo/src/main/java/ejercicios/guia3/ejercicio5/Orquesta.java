package ejercicios.guia3.ejercicio5;

import java.util.*;


public class Orquesta {
	private ArrayList instrumentos = new ArrayList();
	
	public void agregarInstrumento(Instrumento instrumento) {
		instrumentos.add(instrumento);
	}
	
	public void sonar() {
		Iterator<Instrumento> it = instrumentos.iterator();
		while(it.hasNext()) {
			it.next().sonar();
		}
		
	}
}
