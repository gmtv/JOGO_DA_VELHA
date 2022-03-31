
package jogo_da_velha;


public class Tabuleiro {
    //Criando a Matriz do jogo
    private int[][] tabuleiro= new int[3][3];
    
    //Recebe o valor do inicio igual a zero
    public Tabuleiro(){
        zerarTabuleiro();
    }
    
    public void zerarTabuleiro(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                tabuleiro[linha][coluna]=0;
    }
    
    //Exibe a Matriz na tela
    public void exibeTabuleiro(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(tabuleiro[linha][coluna]==-1){
                    System.out.print(" X ");
                }
                if(tabuleiro[linha][coluna]==1){
                    System.out.print(" O ");
                }
                                
                if(tabuleiro[linha][coluna]==0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

    
    public int getPosicao(int[] tentativa){
        //Retorno, tentativa[0] é a coluna e a tentativa[2] é a coluna
        return tabuleiro[tentativa[0]][tentativa[1]];
    }
    
    public void setPosicao(int[] tentativa, int jogador){
        if(jogador == 1)
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        else
            tabuleiro[tentativa[0]][tentativa[1]] = 1;
        
        exibeTabuleiro();
    }

    //Validam todas as linha e colunas
    public int checkLinhas(){
        for(int linha=0 ; linha<3 ; linha++){

            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
                return -1;
            if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checkColunas(){
        for(int coluna=0 ; coluna<3 ; coluna++){

            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
                return -1;
            if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
                return 1;
        }
        
        return 0;
                
    }
    
    public int checkDiagonais(){
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
            return -1;
        if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
            return 1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
            return -1;
        if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
            return 1;
        
        return 0;
    }

    //Retorno da matriz se esta completa ou não
    public boolean tabuleiroCompleto(){
        for(int linha=0 ; linha<3 ; linha++)
            for(int coluna=0 ; coluna<3 ; coluna++)
                if( tabuleiro[linha][coluna]==0 )
                    return false;
        return true;
    }
}

