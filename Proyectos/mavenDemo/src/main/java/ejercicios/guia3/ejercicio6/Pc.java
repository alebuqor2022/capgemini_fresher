package ejercicios.guia3.ejercicio6;

public class Pc extends ItemInventario implements BarcodeReadable{
	
	// Solo se usa si es una PC
	public int nroSerie;
	public boolean esNotebook;
	
	// Constructores para PC
	public Pc(TipoItem tipo) {
		super(tipo);	
	}

	public Pc(TipoItem tipo, int nroSerie, boolean esNotebook) {
		super(tipo);
		this.nroSerie = nroSerie;
		this.esNotebook = esNotebook;
	}
	
	public int getId() {
		return nroSerie;
	}

	@Override
	public int getBarCode() {
		return nroSerie;
	}
	
}
