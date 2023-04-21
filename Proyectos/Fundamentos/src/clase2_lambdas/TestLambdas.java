package clase2_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdas {

	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		//ejemplo3();
		ejemplo4();
	}
	
	public static void ejemplo1() {
		Pais p1=new Pais("España");
		Pais p2=new Pais("Argentina");
		Pais p3=new Pais("Italia");
		Pais p4=new Pais("Brasil");
		
		List<Pais> paises= new ArrayList<Pais>();
		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		paises.add(p4);
		
		paises.forEach((p)->{System.out.println(p.nombre);});
		System.out.println("***************************");
//		comparadorAnonimo(paises);
//		paises.forEach((p)->{System.out.println(p.nombre);});
		
		comparadorLambda(paises);
		paises.forEach((p)->{System.out.println(p.nombre);});
	}
	
	public static void comparadorAnonimo(List<Pais> lista) {
		// voy a ordenar por alfabeto la coleccion en forma clasica
		Collections.sort(lista, new Comparator<Pais>() {

			@Override
			public int compare(Pais o1, Pais o2) {
				return o1.nombre.compareTo(o2.nombre);
			}
			
		});
	}
	
	public static void comparadorLambda(List<Pais> lista) {
		Collections.sort(lista, (o1,o2)->{
			return o1.nombre.compareTo(o2.nombre);
		});
	}

	public static void  ejemplo2() {
		// usamos la interfaz java.util.function.Consumer
		// para almacenar una expresion lambda en una variable
		
		ArrayList<Integer> nros= new ArrayList<Integer>();
		nros.add(5);
		nros.add(9);
		nros.add(8);
		nros.add(1);
		
		Consumer<Integer> metodo=(n)->{System.out.println(n);};
		nros.forEach(metodo);
	}

	public static void ejemplo3() {
		// uso clasico
		for(Integer nro: Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
			System.out.println(nro + " ");
		}
		System.out.println("******************");
		// uso lambdas
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
				n->System.out.println(n + " ")
				);
		System.out.println("******************");
		// uso de lambdas implicito
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
				System.out::println
				);
	}
	
	public static void ejemplo4() {
		StringFunction exclamar=(s)->s+ "!";
		StringFunction preguntar=(s)->s+ "?";
		printFormatted("hola ", exclamar);
		printFormatted("chau ", preguntar);
	}
	
	public static void printFormatted(String str, StringFunction format) {
		// recibimos como argumento una extresion lambda
		System.out.println(format.run(str));
		
	}
}
