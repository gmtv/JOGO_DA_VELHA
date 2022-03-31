package com.uninter;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Tabuleiro tab =new Tabuleiro();
		Jogador jogador = new Jogador();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha");
		System.out.println("Escolha a dificuldade 1,2 ou 3:");
		int opcao = teclado.nextInt();
		Computador comp;
		if(opcao==1) {
			comp= new ComputadorA();
		}
		//definir comportamento para as outras opções
		int vez=1;
		tab.visualizar();
		
		while(tab.situacao()==0) {
			
			if(vez==1) { //Jogador Humano
				jogadador.jogar(tab);
				vez=2;
			}
			else if(vez==2) {
				System.out.println("Jogada Computador");
				comp.jogar(tab);
				vez=1;
			}
			
			tab.visualizar();
			
		}
		
		//Verificar a situacao e imprimir mensagem adequada informando quem venceu ou se empatou
		
		
		

	}

}
