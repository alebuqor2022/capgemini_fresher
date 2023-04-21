package clase2_streams;

public class Empleado {
String titulo;
String nombre;
int salario;

public Empleado() {}

public Empleado(String titulo, String nombre, int salario) {
	super();
	this.titulo = titulo;
	this.nombre = nombre;
	this.salario = salario;
}

public String getDetalles() {
	return "Nombre: " + this.nombre + " su salario es " + this.getSalario();
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getSalario() {
	return salario;
}
public void setSalario(int salario) {
	this.salario = salario;
}

}
