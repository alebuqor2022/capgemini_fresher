package clase1_threads;
import java.util.ArrayList;
import java.util.List;
// CTRL+SHIFT+O
public class SyncStack {

	// una coleccion generica <tipoElemento>
	// List es una interfaz, ArrayList es una clase concreta
	// usamos polimorfismo
private List<Character> buffer=new ArrayList<Character>(400);

// lo invoca el productor
public synchronized void push(char c) {
	this.buffer.add(c);
}

// lo invoca el consumidor
public synchronized char pop() { // pick on pile --> LIFO: last in first out 
	char c;
	while(this.buffer.size()==0) {
		try {
			this.wait();
		}catch(InterruptedException e) {
			// ignorar
		}
	}
	c=buffer.remove(buffer.size()-1);
	return c;
}
}
