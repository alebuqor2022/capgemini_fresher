package ejercicios.guia3.ejercicio2;


import java.util.Scanner;

public class Respuestas {

	public static void main(String[] args) {

	//	tabla_multiplicar();
		resultado_examen();
		
	}

	public static int tabla_multiplicar() {
        int number = 1;
        while (number < 11) {
        System.out.println("Tabla" + number);
	        for(int i = 0; i < 11; i++) {
	            int resultado = number * i;
	            System.out.println(resultado);
	        }
        System.out.println('\n');
        number++;
        }
        
        return 0;
    }
    
    public static int resultado_examen() {
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        int resultado = sc.nextInt();
        
        if (resultado > 0 && resultado <= 50) {
            System.out.println("Suspenso");        
        }
        else if(resultado <76 ) {
            System.out.println("Recuperar");
        }
        else if (resultado < 91) {
            System.out.println("Aprobado");
        }
        else if (resultado < 100) {
            System.out.println("Aprobado con merito");
        }
        
        else {
            System.out.println("Valor no valido");
        }
        
        return 0;
    }

}