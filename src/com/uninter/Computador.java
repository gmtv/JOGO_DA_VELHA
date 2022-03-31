
package jogo_da_velha;

public class Computador extends Jogador{
  
     
    public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");   
    }

    
    @Override
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
        
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
         
        
    }
}