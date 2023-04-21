package clase1_threads;

public class ThreadTester {

	public static void main(String[] args) {
		HelloRunner r=new HelloRunner();
		Thread t= new Thread(r);
		t.start();
		

	}

}
