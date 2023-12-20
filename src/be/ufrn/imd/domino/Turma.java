package be.ufrn.imd.domino;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Turma() {
		
	}
	/*
	 * função de inserir alunos
	 */
	
	public void inserirAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	/*
	 * Função de caucular a maedia aritimetica de todos os alunos
	 */
	public double calcularMedia() {
		double soma = 0;
		for (Aluno aluno : alunos) {
			soma =soma + aluno.calcularMedia();
		}
		return (soma/(alunos.size()));
	}
}
