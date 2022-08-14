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
public class ProjetoVacina {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double count=0;
        Mundo m = new Mundo();
        
        m.desenhaPrimeiroMundo();
        while (true){
            System.out.println("=================================================================");
            System.out.println("Tempo de simulação: " + count + "[s]");
            count+=0.5;
            System.out.println();
            m.contadorPessoas();
            System.out.println();
            System.out.println();
            m.desenhaMundo();
            m.atualizaMundo();
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
