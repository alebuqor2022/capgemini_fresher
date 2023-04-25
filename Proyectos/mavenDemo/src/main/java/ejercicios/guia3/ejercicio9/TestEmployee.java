package ejercicios.guia3.ejercicio9;

import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {

		Employee empleado1 = new Employee("Sebastian",70000, LocalDate.now());
		Employee empleado2 = new Employee("Esteban",75000, LocalDate.now());
		Employee empleado3 = new Employee("sebastian",90000, LocalDate.now());
		Employee empleado4 = new Employee("Sebastian",70000, LocalDate.now());
		
		
		testEquals(empleado1,empleado2); // False
		testEquals(empleado1,empleado3); // False
		testEquals(empleado1, empleado4);// True

		testHashCode(empleado1,empleado2);// False
		testHashCode(empleado1,empleado3);// False
		testHashCode(empleado1,empleado4);// False
	}
	
	public static void testEquals(Employee a,Employee b) {
		
		if(a.equals(b)) {
			System.out.println("Son objetos iguales");
		}else {
			System.out.println("Son objetos distindos.");			
		}
	}
	
	public static void testHashCode(Employee a,Employee b) {
		if(a.hashCode() == b.hashCode()) {
			System.out.println("Son objetos iguales");
		}else {
			System.out.println("Son objetos distindos.");			
		}
	}

}
