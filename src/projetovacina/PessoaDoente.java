/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovacina;

import java.util.Random;

/**
 *
 * @author enzot
 */
public class PessoaDoente extends Pessoa implements IMovable {
    protected Virus oVirus;
    protected double count=0.0;

    public PessoaDoente(int x, int y, int cor) {
        super(x, y, cor);
    }

    public double getCount() {
        return count;
    }
    
    public void contador(){
        count += 0.5;
    }
    
    @Override
    public void mover(int [][] mapa) {
        Random gerador = new Random();
        boolean aux = false;
        int num;
        
        while (aux == false){
            num = gerador.nextInt(4);
            //move +x | move direita
            if (num == 0){
                //caso para a pessoa não mover pro lugar que já tem alguém
                if ((mapa[y][x+1] == 2) || (mapa[y][x+1] == 5) 
                        || (mapa[y][x+1] == 4) || (mapa[y][x+1] == 6)){
                    continue;
                } else {
                    //se não estiver na borda mova normal
                    if (x != 58){ 
                        x = x + 1;
                        aux = true;
                    } else{
                        //mesmo caso para que não mova no lugar que já tem alguém
                        if ((mapa[y][1] != 2) && (mapa[y][1] != 5) 
                                && (mapa[y][1] != 4) && (mapa[y][1] != 6)){
                            x = 1;
                            aux = true;
                        } 
                    }
                }
            }
            //move +y | move pra cima 
            else if (num == 1){
                //caso para a pessoa não mover pro lugar que já tem alguém
                if ((mapa[y+1][x] == 2) || (mapa[y+1][x] == 5) 
                        || (mapa[y+1][x] == 4) || (mapa[y+1][x] == 6)){
                    continue;
                } else{
                    //se não estiver na borda mova normal
                    if (y != 28){
                        y = y + 1;
                        aux = true;
                    } else{
                        //mesmo caso para que não mova no lugar que já tem alguém
                        if ((mapa[1][x] != 2) && (mapa[1][x] != 5)
                                && (mapa[1][x] != 4) && (mapa[1][x] != 6)){
                            y = 1;
                            aux = true;
                        }
                    }
                }
            }
            //move -x | move esquerda
            else if (num == 2){
                //caso para a pessoa não mover pro lugar que já tem alguém
                if ((mapa[y][x-1] == 2) || (mapa[y][x-1] == 5) 
                        || (mapa[y][x-1] == 4) || (mapa[y][x-1] == 6)){
                    continue;
                } else{
                    //se não estiver na borda mova normal
                    if (x != 1){
                        x = x - 1;
                        aux = true;
                    } else{
                        //mesmo caso para que não mova no lugar que já tem alguém
                        if ((mapa[y][58] != 2) && (mapa[y][58] != 5)
                               && (mapa[y][58] != 4) && (mapa[y][58] != 6)){
                            x = 58;
                            aux = true;
                        }
                    }
                }
            }
            //move -y | move pra baixo
            else if (num == 3){
                //caso para a pessoa não mover pro lugar que já tem alguém
                if ((mapa[y-1][x] == 2) || (mapa[y-1][x] == 5) 
                        || (mapa[y-1][x] == 4) || (mapa[y-1][x] == 6)){
                    continue;
                } else{
                    //se não estiver na borda mova normal
                    if (y != 1){
                        y = y - 1;
                        aux = true;
                    } else{
                        //mesmo caso para que não mova no lugar que já tem alguém
                        if ((mapa[28][x] != 2) && (mapa[28][x] != 5)
                                && (mapa[28][x] != 4) && (mapa[28][x] != 6)){
                            y = 28;
                            aux = true;
                        }
                    }
                }
            }            
        }
    }
}
    

