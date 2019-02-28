/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;

import fr.sysdev.softcpa.constants.Constants;

/**
 *
 * @author f
 */
public enum InvoiceStatusEnum { 
    UNPAID(Constants.Labels.UNPAID),PAYED(Constants.Labels.PAYED),PENDING(Constants.Labels.PENDING);
    
    private final String name;

    private InvoiceStatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 
}
