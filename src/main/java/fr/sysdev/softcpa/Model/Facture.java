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
public class Facture  extends AbstractFacture{
    private EtatFactureEnum etat;
    private ModeReglementEnum mode; 

    public EtatFactureEnum getEtat() {
        return etat;
    }

    public void setEtat(EtatFactureEnum etat) {
        this.etat = etat;
    }

    public ModeReglementEnum getMode() {
        return mode;
    }

    public void setMode(ModeReglementEnum mode) {
        this.mode = mode;
    }
}