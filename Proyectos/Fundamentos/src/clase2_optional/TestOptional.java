package clase2_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
	//	ejemplo1();
		ejemplo2();

	}
	
	public static void ejemplo1() {
		// problematica
		List<Nota> notas=new ArrayList<Nota>();
		notas.add(new Nota("matematicas",3));
		notas.add(new Nota("lengua",8));
		notas.add(new Nota("ingles",5));
		notas.add(new Nota("fisica",7));
		
		Nota nota=buscarNotaMaxima(notas);
		System.out.println(nota.getValor());
		System.out.println(nota.getAsignatura());
		
	}
	public static void ejemplo2() {
		// solucionado con Optional
		List<Nota> notas=new ArrayList<Nota>();
		notas.add(new Nota("matematicas",3));
		notas.add(new Nota("lengua",8));
		notas.add(new Nota("ingles",5));
		notas.add(new Nota("fisica",7));
		
		Optional<Nota> nota=buscarNotaMaxima1(notas);
		if(nota.isPresent()) {
			Nota not=nota.get();
			System.out.println(not.getValor());
			System.out.println(not.getAsignatura());
		} else {
			System.out.println("no hay un 10 en la clase");	
		}
		
	}
	
	public static Nota buscarNotaMaxima(List<Nota> notas) {
		Nota nota=null;
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>9) {
				nota=unaNota;
			}
		}
		return nota;
	}
	
	public static Optional<Nota> buscarNotaMaxima1(List<Nota> notas) {
		
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>9) {
				return Optional.of(unaNota);
			}
		}
		return Optional.empty();
	}
}
