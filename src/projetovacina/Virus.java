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
public class Virus {
    public boolean verifica;

    public Virus(boolean verifica) {
        this.verifica = true;
    }

    public boolean getVerifica(){
        return verifica;
    }
    
    public void setVerifica(boolean verifica){
        this.verifica = verifica;
    }
}
