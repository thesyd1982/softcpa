/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Model;

/**
 *
 * @author f
 */
public enum EtatFactureEnum {
    PAYEE("Payée"),
    EN_COURS("En cours"),
    PARTIELLE("Partielle");

    public String getEtat() {
        return etat;
    }
    
    private String  etat ="";

    private EtatFactureEnum(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "EtatFactureEnum{" + "etat=" + etat + '}';
    }
  
    
}
