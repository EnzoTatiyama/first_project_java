/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovacina;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author enzot
 */
public class Mundo {
    private Hospital oHospital = new Hospital();
    private ArrayList <PessoaSaudavel> pessoasSaudavel = new ArrayList <>();
    private ArrayList <PessoaDoente> pessoasDoentes = new ArrayList <>();
    private int[][] mapa = new int[][]{
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,3,3,3,1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,3,3,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,1,3,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    

    
    public void desenhaPrimeiroMundo(){
        desenhaPessoa();
    }
    
    public void desenhaMundo(){
        for (int i=0; i<mapa.length; i++){
            for (int j=0; j<mapa[i].length; j++){
                switch (mapa[i][j]){
                    case 0:
                        //espaço em branco
                        System.out.print(" ");
                        break;
                    case 1:
                        //cor = branco
                        System.out.print("\033[47m \033[0m");
                        break;
                    case 2:
                        //cor = azul
                        //pessoa saudavel sem vacina
                        System.out.print("\033[44m \033[0m");
                        break;
                    case 3:
                        //cor = vermelho
                        System.out.print("\033[41m \033[0m");
                        break;
                    case 4:
                        //cor = verde
                        //pessoa saudavel vacinada, sem virus
                        System.out.print("\033[42m \033[0m");
                        break;
                    case 5:
                        //cor = amarelo
                        //pessoa doente
                        System.out.print("\033[43m \033[0m");
                        break;
                    case 6:
                        //cor = ciano
                        //pessoa saudavel vacinada, com virus
                        System.out.print("\033[46m \033[0m");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
    public void atualizaMundo(){
        int hospital;
        verificarPessoaPerto();
        for (int i=0; i<mapa.length; i++){
            for (int j=0; j<mapa[i].length; j++){
                if (mapa[i][j] == 2){
                    hospital = oHospital.mapearHospital(i, j);
                    moverPessoaSaudavel(i, j, hospital);
                }
                else if (mapa[i][j] == 5){
                    hospital = oHospital.mapearHospital(i, j);
                    moverPessoaDoente(i, j, hospital);
                }
                else if (mapa[i][j] == 4){
                    hospital = oHospital.mapearHospital(i, j);
                    moverPessoaSaudavel(i, j, hospital);
                }
                else if (mapa[i][j] == 6){
                    hospital = oHospital.mapearHospital(i, j);
                    moverPessoaSaudavel(i, j, hospital);
                }
            }
        }
        atualizarMovimento();
        contadorVirusPessoaDoente();
        contadorVirusPessoaVacinada();
    }
    
    public void contadorVirusPessoaDoente(){
        int getX, getY;
        for (int t=0; t<pessoasDoentes.size(); t++){
            //faz a contagem do tempo
            pessoasDoentes.get(t).contador();
            //caso a contagem chegue em 30 segundos a pessoa doente morre
            if (pessoasDoentes.get(t).getCount() == 30.0){
                getX = pessoasDoentes.get(t).getX();
                getY = pessoasDoentes.get(t).getY();
                pessoasDoentes.remove(t);
                mapa[getY][getX] = 0;
            }
        }
    }
    
    public void contadorVirusPessoaVacinada(){
        for (int t=0; t<pessoasSaudavel.size(); t++){
            //caso a pessoa em questão seja vacinada com virus
            if (pessoasSaudavel.get(t).getCor() == 6){
                //faz a contagem do tempo
                pessoasSaudavel.get(t).contador();
                //caso a contagem chegue em 30 segundos a pessoa vacinada com vírus, fica sem o vírus
                if (pessoasSaudavel.get(t).getCount() == 30.0){
                    pessoasSaudavel.get(t).setCor(4);
                }
            }
        }
    }
    
    public void verificarPessoaPerto(){
        int hospital;
        int j=0, i=0;
        for (int t=0; t<pessoasSaudavel.size(); t++){
            j = pessoasSaudavel.get(t).getX();
            i = pessoasSaudavel.get(t).getY();
            hospital = oHospital.mapearHospital(i, j);
            //caso a pessoa doente esteja em um quadrado adjacente
            
            if ((hospital != 1) && (hospital != 3)){
                if (
                        (mapa[i+1][j] == 5) || (mapa[i-1][j] == 5) || (mapa[i][j+1] == 5)
                        || (mapa[i][j-1] == 5) 
                        || (mapa[i+1][j] == 6) || (mapa[i-1][j] == 6) || (mapa[i][j+1] == 6)
                        || (mapa[i][j-1] == 6)
                    ){ 
                    if (mapa[i][j] == 2){
                        //pessoa saudavel é removido do ArrayList
                        pessoasSaudavel.remove(t);
                        //no lugar fica uma pessoa doente
                        pessoasDoentes.add(new PessoaDoente(j, i, 5));
                    } else if (mapa[i][j] == 4){
                        //se já estiver vacinada a pessoa muda a cor para pessoa vacinada com vírus
                        pessoasSaudavel.get(t).setCor(6);
                    }
                }
            }
        }
    }
    
    public void moverPessoaDoente(int i, int j, int hospital){
        int getX, getY;
        int aux;
        
        for (int t=0; t<pessoasDoentes.size(); t++){
            getX = pessoasDoentes.get(t).getX();
            getY = pessoasDoentes.get(t).getY();
            if ((getY == i) && (getX == j)){
                pessoasDoentes.get(t).mover(mapa);
                //pega as coordenadas após o movimento
                if (hospital == 1){
                    //pinta branco
                    mapa[i][j] = 1;
                } else if(hospital == 3){
                    //pinta vermelho
                    mapa[i][j] = 3;
                } else{
                    //pinta "vazio"
                    mapa[i][j] = 0;
                }
                getX = pessoasDoentes.get(t).getX();
                getY = pessoasDoentes.get(t).getY();
                aux = oHospital.mapearHospital(getY, getX);
                //caso a pessoa esteja no hospital
                if (aux == 1){
                    //é removido do ArrayList de pessoas doentes
                    pessoasDoentes.remove(t);
                    //no lugar da pessoa doente fica uma pessoa saudavel, virando uma pessoa saudavel
                    pessoasSaudavel.add(new PessoaSaudavel(getX, getY, 2, false));
                } 
            }
        }
    }
    
    public void atualizarMovimento(){
        int getX, getY;
        for (int t=0; t<pessoasSaudavel.size(); t++){
            getX = pessoasSaudavel.get(t).getX();
            getY = pessoasSaudavel.get(t).getY();
            mapa[getY][getX] = pessoasSaudavel.get(t).getCor();
        }
        for (int t=0; t<pessoasDoentes.size(); t++){
            getX = pessoasDoentes.get(t).getX();
            getY = pessoasDoentes.get(t).getY();
            mapa[getY][getX] = pessoasDoentes.get(t).getCor();
        }
    }
    
    public void moverPessoaSaudavel(int i, int j, int hospital){
        int getX, getY;
        int aux;
        for (int t=0; t<pessoasSaudavel.size(); t++){
            getX = pessoasSaudavel.get(t).getX();
            getY = pessoasSaudavel.get(t).getY();
            if ((getY == i) && (getX == j)){
                //condição para que o lugar onde a pessoa estava estaja da cor certa
                if (hospital == 1){
                    //pinta branco
                    mapa[i][j] = 1;
                } else if(hospital == 3){
                    //pinta vermelho
                    mapa[i][j] = 3;
                } else{
                    //pinta "vazio"
                    mapa[i][j] = 0;
                }
                //move a pessoa
                pessoasSaudavel.get(t).mover(mapa);
                getY = pessoasSaudavel.get(t).getY();
                getX = pessoasSaudavel.get(t).getX();
                //se a pessoa já estava no hospital
                if ((hospital != 1) && (hospital != 3)){
                    //se ainda não entrou, verifica se entrou
                    aux = oHospital.mapearHospital(getY, getX);
                    //caso a pessoa entrou no hospital pela primeira vez
                    if (aux == 1){
                        //caso a pessoa já esteja vacinada
                        if ((pessoasSaudavel.get(t).getCor() == 2)){
                            //fica vacinado
                            pessoasSaudavel.get(t).setCor(4);
                        }
                    }
                }
            }
        }
    }
    
    public void contadorPessoas(){
        int countPessoaSaudavel=0;
        int countPessoaSaudavelVacinada=0;
        int countPessoaSaudavelVacinadaVirus=0;
        int countPessoaDoente=0;
        int countPessoas=0;
        int countPessoasMortas=0;

        for (int i=0; i<pessoasSaudavel.size(); i++){
            if (pessoasSaudavel.get(i).getCor() == 2){
                countPessoaSaudavel+=1;
            } else if (pessoasSaudavel.get(i).getCor() == 4){
                countPessoaSaudavelVacinada+=1;
            } else if (pessoasSaudavel.get(i).getCor() == 6){
                countPessoaSaudavelVacinadaVirus+=1;
            }
            countPessoas+=1;
        }
        for (int i=0; i<pessoasDoentes.size(); i++){
            countPessoaDoente+=1;
            countPessoas+=1;
        }
        
        countPessoasMortas = 102 - countPessoas;
        System.out.print("\033[44m \033[0m" + " Saudáveis: " + countPessoaSaudavel
        + "     \033[43m \033[0m" + " Doentes: " + countPessoaDoente 
        + "     \033[42m \033[0m" + " Saudáveis vacinados: " + countPessoaSaudavelVacinada + ""
                + "\n");
        System.out.print("\033[46m \033[0m" + " Saudáveis vacinados com vírus: " + countPessoaSaudavelVacinadaVirus);
        System.out.println();
        System.out.print("Total de pessoas: " + countPessoas + "        Total de pessoas mortas: " + countPessoasMortas);
    }
    
    public void desenhaPessoa(){
        Random gerador = new Random();
        int i, j;

        for (int t=0; t<100;){
            i = gerador.nextInt(30);
            j = gerador.nextInt(60);
            //condição para a pessoa não nascer no limite
            if ((i != 0) && (i < 29) && (j != 0) && (j < 59)){
                //condição para a pessoa não nascer dentro do hospital
                if (((i < 4) || (i > 8) && (j < 26) || (j > 30)) &&
                        ((i < 16) || (i > 20) && (j < 43) || (j > 47)) &&
                        ((i < 22) || (i > 26) && (j < 10) || (j > 14)) &&
                        (mapa[i][j] != 2)){
                    pessoasSaudavel.add(new PessoaSaudavel(j, i, 2, false));
                    mapa[i][j] = 2;
                    t++;
                }
            }
        }
        for (int t=0; t<2;){
            i = gerador.nextInt(30);
            j = gerador.nextInt(60);
            if ((i != 0) && (i < 29) && (j != 0) && (j < 59)){
                //condição para a pessoa não nascer dentro do hospital
                if (((i < 4) || (i > 8) && (j < 26) || (j > 30)) &&
                        ((i < 16) || (i > 20) && (j < 43) || (j > 47)) &&
                        ((i < 22) || (i > 26) && (j < 10) || (j > 14)) &&
                        (mapa[i][j] != 2) && (mapa[i][j] != 5)){
                    pessoasDoentes.add(new PessoaDoente(j, i, 5));
                    mapa[i][j] = 5;
                    t++;
                }
            }
        }
        
    }
}
