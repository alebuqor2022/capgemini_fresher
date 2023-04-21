package clase1_exceptions;
// 2do paso --> crear un metodo que arroje la exception fabricada
public class Conexion {

	public Conexion() {} // no hace falta escribirlo, si el unico constructor
	
	public void conectar(String nombreServer) throws ServerTimeOutException{
		boolean exito=true;
		int puertoAconectar=80;
		exito=abrir();
		if(!exito) {
			throw new ServerTimeOutException("no me puedo conectar ",puertoAconectar);
		}
	}
	
	public boolean abrir() {
		return false;
	}
}
