package clase1_exceptions;

public class Test {

	public static void main(String[] args) {
		String[] mjes ; // reserva el espacio predeterminado para el tipo String en memmoria en la declaracion
		String mjes1[] = null; // usa la memoria en la 1era carga de datos
		mjes1[0]="hola";
		
		String mjes2[]= {"hola","chau"};
		
		// prueba de exceptions del API
		System.out.println("testeando"); // syso ctrl+space
		try {
			for(int i=0;i<3;i++) {
				System.out.println(args[i]);
				int a = Integer.parseInt(args[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("argumentos vacios");
			e.printStackTrace();
		}catch (NumberFormatException e1) {
			System.out.println(e1.getMessage());
			System.out.println("argumento no numerico");
			//System.exit(0);
		}catch (Exception e2) {
			System.out.println(e2.getMessage());
		}finally{
			System.out.println("estoy pasando por Finally");
			System.exit(0);
		}
		
		System.out.println("estoy fuera del try/catch");

	}

}
