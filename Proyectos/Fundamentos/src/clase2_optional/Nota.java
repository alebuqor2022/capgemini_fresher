package clase2_optional;

public class Nota {
private String asignatura;
private double valor;

public Nota(String asignatura, double valor) {
	super();
	this.asignatura = asignatura;
	this.valor = valor;
}
public String getAsignatura() {
	return asignatura;
}
public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}

}
