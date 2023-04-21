package clase1_exceptions;
// 3er paso -> uso try/catch
public class TestException {

	public static void main(String[] args) {
		Conexion c=new Conexion();
		
		try {
			c.conectar("Capgemini");
		} catch (ServerTimeOutException e) {
			System.out.println(e.getMessage()+ " al puerto " + e.getPuerto());
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		} finally {
			System.out.println("fin");
		}
	}

}
