/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import agenda.Principal;

import javax.swing.JComboBox;

/**
 *
 * @author diego.cardoso
 */
public enum ContatoEnum {
    
    RESIDENCIAL("RESIDENCIAL"),
    COMERCIAL("COMERCIAL"),
    PESSOAL("PESSOAL");
    
    private String Contato ;
    private ContatoEnum(String Contato){
     this.Contato = Contato ;
    
    }
     /**
     * @return the Contato
     */
       
    public String getContato() {
        return this.Contato;
    }
    
}


