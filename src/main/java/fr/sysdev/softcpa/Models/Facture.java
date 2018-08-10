/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Models;

import java.util.List;

/**
 *
 * @author sysdev
 */
public class Facture {
    
    private Client client;
    private String Immatriculation;
    private List<LigneFacture>lignesFacture;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getImmatriculation() {
        return Immatriculation;
    }

    public void setImmatriculation(String Immatriculation) {
        this.Immatriculation = Immatriculation;
    }

    public List<LigneFacture> getLignesFacture() {
        return lignesFacture;
    }

    public void setLignesFacture(List<LigneFacture> lignesFacture) {
        this.lignesFacture = lignesFacture;
    }
}
