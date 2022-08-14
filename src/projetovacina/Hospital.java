/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetovacina;

/**
 *
 * @author enzot
 */
public class Hospital {
    private int[][] hospVermelho = new int[][]{
        {5,28},{6,28},{7,28},{6,27},{6,29},
        {17,45},{18,45},{19,45},{18,44},{18,46},
        {23,12},{24,12},{25,12},{24,11},{24,13}
    };
    private int[][] hospBranco = new int[][]{
        {4,26},{5,26},{6,26},{7,26},{8,26},{4,27},{5,27},{7,27},{8,27},{4,28},{8,28},
        {4,29},{5,29},{7,29},{8,29},{4,30},{5,30},{6,30},{7,30},{8,30},
        {16,43},{17,43},{18,43},{19,43},{20,43},{16,44},{17,44},{19,44},{20,44},{16,45},
        {20,45},{16,46},{17,46},{19,46},{20,46},{16,47},{17,47},{18,47},{19,47},{20,47},
        {22,10},{23,10},{24,10},{25,10},{26,10},{22,11},{23,11},{25,11},{26,11},{22,12},
        {26,12},{22,13},{23,13},{25,13},{26,13},{22,14},{23,14},{24,14},{25,14},{26,14}
    };
    
    public int mapearHospital(int num1, int num2){
        int aux=0;
        for (int i=0; i<hospBranco.length; i++){
            aux=0;
            if (hospBranco[i][0] == num1)
                aux+=1;
            if (hospBranco[i][1] == num2)
                aux+=1;
            if (aux == 2)
                return 1;
        }   
        for (int i=0; i<hospVermelho.length; i++){
            aux=0;
            if (hospVermelho[i][0] == num1)
                aux+=1;
            if (hospVermelho[i][1] == num2)
                aux+=1;
            if (aux == 2)
                return 3;
        }
        return 0;
    }
}
