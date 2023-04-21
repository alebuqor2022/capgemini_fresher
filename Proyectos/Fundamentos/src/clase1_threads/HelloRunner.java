package clase1_threads;

public class HelloRunner implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(2000);
				System.out.println("hola " + i++);
				if (i==10) break;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
