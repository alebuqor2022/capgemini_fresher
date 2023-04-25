package ejercicios.guia3.ejercicio6;

public class Silla extends ItemInventario{
	// Solo se usa si es una silla
		public boolean conRueditas;
		public int lote;
		public int numeroDentroDeLote;

		// Constructor para SILLA
		public Silla(TipoItem tipo) {
			super(tipo);
		}

		public Silla(TipoItem tipo, boolean conRueditas, int lote, int numeroDentroDeLote) {
			super(tipo);
			this.conRueditas = conRueditas;
			this.lote = lote;
			this.numeroDentroDeLote = numeroDentroDeLote;
		}
		
		public int getId() {
			return lote + 1000 + numeroDentroDeLote;
		}
}
