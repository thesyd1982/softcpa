/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Model;

/**
 *
 * @author sysdev
 */
public class Avoir {
    
    private Facture facture;
    private Double Montant;

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Double getMontant() {
        return Montant;
    }

    public void setMontant(Double Montant) {
        this.Montant = Montant;
    }
    
}
