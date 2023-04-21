package clase1_threads;

public class TestSync {

	public static void main(String[] args) {
		SyncStack stack=new SyncStack();
		
		Producer p1=new Producer(stack);
		Thread prodT1=new Thread(p1);
		prodT1.setName("Ale");
		prodT1.start();
		
		Consumer c1=new Consumer(stack);
		Thread consT1=new Thread(c1);
		consT1.setName("Ivan");
		consT1.start();
		
		Producer p2=new Producer(stack);
		Thread prodT2=new Thread(p2);
		prodT2.setName("Javier");
		prodT2.start();	
		

		
		Consumer c2=new Consumer(stack);
		Thread consT2=new Thread(c2);
		consT2.setName("Manuel");
		consT2.start();

	}

}
