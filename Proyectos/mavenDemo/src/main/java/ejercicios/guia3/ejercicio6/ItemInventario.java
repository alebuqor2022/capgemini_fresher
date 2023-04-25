package ejercicios.guia3.ejercicio6;


public abstract class ItemInventario {

	final TipoItem tipo;
	
	public ItemInventario(TipoItem tipo) {
	this.tipo=tipo;
	}

	public abstract int getId();

}
