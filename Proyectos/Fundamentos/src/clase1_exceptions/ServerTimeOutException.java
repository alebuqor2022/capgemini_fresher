package clase1_exceptions;
// 1er paso --> crear la exception personalizada

public class ServerTimeOutException extends Exception {
private int puerto;

// overriding del metodo constructor de Exception

public ServerTimeOutException(String mensaje, int puerto) {
	super(mensaje);
	this.puerto=puerto; // atributo=argumento
}

public int getPuerto() {
	return puerto;
}

}
