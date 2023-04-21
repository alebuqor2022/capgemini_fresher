package clase1_threads;

public class Producer implements Runnable {
private SyncStack theStack;
private int num;
private static int counter=1;

	public Producer(SyncStack theStack) {
	super();
	this.theStack = theStack;
	num=counter++;
}
	@Override
	public void run() {
		char c;
		for(int i=0; i<200; i++) {	 
			 c=(char)(Math.random() * 26 + 'A'); // nro aleatorio, casteado a char
			 this.theStack.push(c);
			 System.out.println("Producer " + num + "-"+ Thread.currentThread().getName() + ": " + c);
			 
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
