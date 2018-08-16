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
public enum ModeReglementEnum {
    ESPECES("Espèces"),
    CB("Carte Bancaire"),
    CHEQUE("Chéque");

    public String getMode() {
        return mode;
    }
    
    private String  mode ="";

    private ModeReglementEnum(String mode) {
        this.mode = mode;
    }

    
}
