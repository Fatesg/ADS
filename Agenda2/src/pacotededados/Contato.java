/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotededados;

/**
 *
 * @author diego.cardoso
 */
public class Contato {
    
    private String NomeCompleto;
    private String CPF;
    private String RG;
    private String email;

    /**
     * @return the NomeCompleto
     */
    public String getNomeCompleto() {
        return NomeCompleto;
    }

    /**
     * @param NomeCompleto the NomeCompleto to set
     */
    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
