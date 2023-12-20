package be.ufrn.imd.domino;

import java.util.ArrayList;


public class Aluno {
	private ArrayList<Prova> provas = new ArrayList<Prova>();
	
	
	public Aluno(double nota1_p1, double nota1_p2, double nota2_p1, double nota2_p2) {
		Prova prova1 = new Prova(nota1_p1, nota1_p2);
		Prova prova2 = new Prova(nota2_p1, nota2_p2);
		
		this.provas.add(prova1);
		this.provas.add(prova2);
	}
	
	public double calcularMedia() {
		double soma = 0;
		for (Prova prova : provas) {
			soma = soma + prova.calcularNotaTotal();
		}
		return (soma/provas.size());
	}
	


}
