package ejercicios.guia3.ejercicio9;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String nombre;
	private double salario;
	private LocalDate fechaDeIngreso;

	public Employee(String nombre, double salario, LocalDate fechaDeIngreso) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaDeIngreso, nombre, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(fechaDeIngreso, other.fechaDeIngreso) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public String toString() {
		return "Employee [ nombre=" + nombre + ", salario=" + salario + ", fechaDeIngreso=" + fechaDeIngreso + " ]";
	}
	
	

}
