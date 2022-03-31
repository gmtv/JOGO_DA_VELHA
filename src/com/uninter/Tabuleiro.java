package com.uninter;

public class Tabuleiro {
	public int mat[][] = new int[3][3];
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espaço vazio
	public int situacao() {
		//criar logica de verificar quem venceu ou se empatou ou se o jogo continua
		return 0;
	}
	
	public void visualizar() {
		
		for (int i = 0; i < mat.length; i++) {//linhas
			for (int j = 0; j < mat.length; j++) {//colunas
				if(mat[i][j]==1) {
					System.out.print("X ");
				}
				else if(mat[i][j]==-1) {
					System.out.print("O ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
	}
	
	

}
