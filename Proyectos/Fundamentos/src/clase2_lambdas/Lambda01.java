package clase2_lambdas;

@FunctionalInterface
interface Calc{
	Integer op(Integer a, Integer b);
}

public class Lambda01 {

	public static void main(String[] args) {
		System.out.println("operando con lambdas");
		Calc suma=(Integer x, Integer y)->{return x+y;};
		Calc resta=(Integer x, Integer y)->{return x-y;};
		Calc mult=(Integer x, Integer y)->{return x*y;};
		
		System.out.println("suma: " + suma.op(6, 4));
		System.out.println("resta: " + resta.op(6, 4));
		System.out.println("multiplico: " + mult.op(6, 4));
	}

}
