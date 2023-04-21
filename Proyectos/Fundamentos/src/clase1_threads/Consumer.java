package clase1_threads;

public class Consumer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter=1;

		public Consumer(SyncStack theStack) {
		super();
		this.theStack = theStack;
		num=counter++;
	}
		@Override
		public void run() {
			char c;
			for(int i=0; i<200; i++) {	 
				 c=this.theStack.pop();
				 System.out.println("Consumer " + num + "-" + Thread.currentThread().getName()+ ": " + c);
				 
				 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
