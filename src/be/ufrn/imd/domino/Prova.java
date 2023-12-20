package be.ufrn.imd.domino;

public class Prova {
	private double parte1;
	private double parte2;
	
	public Prova(double parte1, double parte2) {
		this.parte1 = parte1;
		this.parte2 = parte2;
	}
	
	
	public double calcularNotaTotal() {
		return (parte1 + parte2)/2;
	}

}
