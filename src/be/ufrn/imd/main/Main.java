package be.ufrn.imd.main;

import be.ufrn.imd.domino.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		/*
		 * 
		 * Crio as turmas com alguns alunos e suas notas
		 */
		Turma turma1 = new Turma();
		Aluno jose = new Aluno(10 , 5.5, 7, 5);
		Aluno severo = new Aluno(10 , 10, 7, 9);
		Aluno arthur = new Aluno(6 , 4.5, 7, 6);
		Aluno ademir = new Aluno(10 , 10, 4, 5);
		Aluno miguel = new Aluno(5 , 7.5, 7.5, 6.5);
		turma1.inserirAluno(jose);
		turma1.inserirAluno(severo);
		turma1.inserirAluno(arthur);
		turma1.inserirAluno(ademir);
		turma1.inserirAluno(miguel);

		
		Turma turma2 = new Turma();
		Aluno luisa = new Aluno(7 , 7, 7, 5);
		Aluno tyfany = new Aluno(10 , 10, 4.5, 6.5);
		Aluno mateus = new Aluno(8 , 10, 7, 2.5);
		Aluno lopes = new Aluno(5 , 10, 7, 6);
		Aluno kadu = new Aluno(10 , 4.5, 7, 6.5);
		turma2.inserirAluno(luisa);
		turma2.inserirAluno(tyfany);
		turma2.inserirAluno(mateus);
		turma2.inserirAluno(lopes);
		turma2.inserirAluno(kadu);
		
		/*
		 * inicio um console para usar das funções
		 */
		
		Scanner sc = new Scanner(System.in);
		double opcao ;
		int acao;
		try {
			while(true) {
				System.out.println("1 - Inserir aluno.\n2 - Ver nota da turma.\n3 - finalizar.");
				acao = Integer.parseInt(sc.nextLine());
				switch(acao){
				case 1:
					double nota1;
					double nota2;
					double nota3;
					double nota4;

					System.out.println("qual a turma do aluno?\nTurmaA-1\nTurmaB-2\n");
					opcao = Double.parseDouble(sc.nextLine());
					/*
					 * No caso 1: Faço a pergunta da turma e notas do aluno para inserir na 
					 * classe turma.
					 * 
					 * No caso 2: Chama a Função calcularMedia da classe turma.
					 * 
					 * No caso 3: Termino o console.
					 */
					if(opcao == 1) {
						System.out.println("quais as notas das provas?\n");
						opcao = Double.parseDouble(sc.nextLine());
						nota1 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota2 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota3 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota4 = opcao;
						Aluno a = new Aluno(nota1, nota2, nota3, nota4);
						turma1.inserirAluno(a);
					}else {
						System.out.println("quais as notas das provas?\n");
						opcao = Double.parseDouble(sc.nextLine());
						nota1 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota2 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota3 = opcao;
						opcao = Double.parseDouble(sc.nextLine());
						nota4 = opcao;
						Aluno a = new Aluno(nota1, nota2, nota3, nota4);
						turma2.inserirAluno(a);
					}
					break;
				case 2:
					System.out.println("qual turma que ver a média?\nTurmaA-1\nTurmaB-2\n");
					opcao = Double.parseDouble(sc.nextLine());

					if(opcao ==1){
						System.out.println(turma1.calcularMedia() + "\n");
					}else {
						System.out.println(turma2.calcularMedia() + "\n");

					}
					break;
				case 3:
					System.exit(0);
				}
			}
		}finally {
			sc.close();
		}
		

	}
}
