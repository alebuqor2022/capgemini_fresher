package ejercicios.guia3.ejercicio5;

public class testOrquesta {
	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();
		
		Guitarra guitarra = new Guitarra();
		Piano piano = new Piano();
		
		orquesta.agregarInstrumento(guitarra);
		orquesta.agregarInstrumento(piano);
		orquesta.agregarInstrumento(guitarra);
		orquesta.sonar();
	}
}
