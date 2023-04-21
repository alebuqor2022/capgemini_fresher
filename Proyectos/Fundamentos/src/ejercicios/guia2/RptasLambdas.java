package ejercicios.guia2;

import java.util.Arrays;
import java.util.List;

interface ILambda1{
	double promedio(int[] arreglo);
}
interface ILambda2{
	double factorial(int n);
}
interface ILambda3{
	boolean esPar(int n);
}
interface ILambda4{
	int mayor(int[] arreglo);
}
interface ILambda5{
	int menor(int[] arreglo);
}
interface ILambda6{
	int masRepetido(int[] arreglo);
}
interface ILambda7{
	int mayor(int a, int b, int c);
	// int mayor (int.. a); 
}
interface ILambda8{
	String multiplicar(String s, int n);
}
public class RptasLambdas {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
	}
	
	public static void ejercicio1() {
		//1.	Crear una función anónima que nos permita 
		//calcular el promedio de un arreglo de números enteros.
		ILambda1 lambda=(array)->{
			double promedio=0;
			for (int e: array) {
				promedio+= (e*1.0)/array.length;
			}
			return promedio;
		};
		int arreglo[]= {1,2,3,4,5,6};
		System.out.println(lambda.promedio(arreglo));
		
	}
	
	public static void ejercicio2() {
		//2. Crear una función anónima que calcule el
		// factorial dado un número entero. 
		ILambda2 lambda=(n)->{
			double factorial=1;
			for (int i=1;i<=n;i++) {
				factorial*=i;
			}
			return factorial;
		};
		System.out.println(lambda.factorial(5));
	}

	public static void ejercicio3() {
		//3. Crear una función anónima que permita
		// conocer si un número es par. 
		ILambda3 lambda=n->n%2==0;
		if(lambda.esPar(6)) {
			System.out.println("es par");
			}else {
				System.out.println("NO es par");
			}
	}
	
	public static void ejercicio4() {
		//4. Dado un arreglo de números enteros, crear una
		// función anónima que retorne el número mayor. 
		ILambda4 lambda=(array)->{
			int mayor=0;
			for (int i=1;i<array.length;i++) {
				if(array[i]>mayor) {
					mayor=array[i];
				}
			}
			return mayor;
		};
		int arreglo[]= {1,2,3,4,5,6};
		System.out.println("el mayor es " + lambda.mayor(arreglo));
	}
	
	public static void ejercicio5() {
		//5. Dado un arreglo de números
		// enteros, crear una función anónima que retorne el número menor. 
		ILambda5 lambda=(array)->{
			int menor=array[0];
			for (int i=1;i<array.length;i++) {
				if(array[i]<menor) {
					menor=array[i];
				}
			}
			return menor;
		};
		int arreglo[]= {1,2,3,4,5,6};
		System.out.println("el menor es " + lambda.menor(arreglo));
	}
	
	public static void ejercicio6() {
	/* 6. Dado un arreglo de números enteros, 
	 * crear una función anónima que retorne el número
	 * que más se repite. 
	*/
		ILambda6 lambda=(array)->{
			int nRepeticiones=0;
			int masRepetido=0;
			for (int i=1;i<array.length;i++) {
				int rep=0;
				for (int j=1;j<array.length;j++) {
					if(array[i]==array[j]) {
						rep++;
					}
				}
				if(rep>nRepeticiones) {
					nRepeticiones=rep;
					masRepetido=array[i];
				}
			}
			return masRepetido;
		};
		int arreglo[]= {1,2,3,4,5,6,1,2,7,8,8,8,4,3,2,3,2,5,2};
		System.out.println("el mas repetido es " + lambda.masRepetido(arreglo));

	}
	
	public static void ejercicio7() {
	/* 7. Crear una función anónima que reciba como parámetro 3
	 * numeros enteros. La función retorna el número mayor. */
		ILambda7 lambda=(a,b,c)->{
			int mayor=c;
			if(a>b && a >c) {
				mayor=a;
			}else if(b>a && b >c) {
				mayor=b;
			}
			return mayor;
		};
		
		System.out.println("el mayor es " + lambda.mayor(53,12,40));
		System.out.println("el mayor es " + lambda.mayor(53,120,40));
		System.out.println("el mayor es " + lambda.mayor(53,12,140));
	}
	
	public static void ejercicio8() {
		/* 8. Crear una función anónima que reciba dos parámetros, 
		 * un string y un numero entero. 
		 * La función retorna un string el cual será 
		 * el resultado de multiplicar ambos parámetros.*/	
		ILambda8 lambda=(s,n)->{
			String resultado="";
			for (int i=1;i<=n;i++) {
				resultado += s;
			}
			return resultado;
		};
		
		System.out.println("el resultado es " + lambda.multiplicar("Alejandra",4));
	}
}
