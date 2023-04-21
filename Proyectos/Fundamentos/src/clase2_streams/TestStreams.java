package clase2_streams;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		// ejemplo1();
		// ejemplo2();
		 ejemplo3();
	}
	
	public static void ejemplo1() {
		Stream.iterate(0, n-> n + 10).limit(15).forEach(StreamEjemplo::imp);
		System.out.println("+++++++++++++++++");
		Stream<Integer> nros=Stream.iterate(0, n-> n + 10).limit(15);
		nros.forEach(StreamEjemplo::imp);
	}

	public static void ejemplo2() {
		// 1er caso
		List<Integer> li= Arrays.asList(5,6,10,25,74);
		int suma= li.stream()
				 .mapToInt(x -> x.intValue())
				 .sum();
		System.out.println("la suma es " + suma);
		// 2do caso
		long pares = li.stream()
				    .filter(x -> x % 2 == 0)
				    .count();
		
		System.out.println("los pares son " + pares);
		// 3er caso
		Object[] arrInt=Stream.of(5,6,10,25,74)
				        .filter(x -> x % 2 == 0)
				        .toArray();
		for(Object elemento: arrInt) {
			System.out.println("los nros pares son " + elemento);
		}
	}

	public static void ejemplo3() {
		List<Empleado> lista=new ArrayList<>();
		lista.add(new Empleado("Gerente","Juan", 10000));
		lista.add(new Empleado("Jefe","Francisca", 5000));
		lista.add(new Empleado("Secretario","Pedro", 3000));
		
		double rpta=calcularPromedio(lista);
		System.out.println(" el promedio de los salarios es " + rpta);
		
	}
	public static double calcularPromedio(List<Empleado> lista) {
		return lista.stream()
				.mapToInt(empleado -> empleado.getSalario())
				.average()
				.getAsDouble();
	}
}
