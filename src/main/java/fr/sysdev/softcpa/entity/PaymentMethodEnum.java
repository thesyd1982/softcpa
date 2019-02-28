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
public enum PaymentMethodEnum {
    BANKCARD(Constants.Labels.BANKCARD),CHEQUE(Constants.Labels.CHEQUE),CASH(Constants.Labels.CASH);
    
    private final String name;

    private PaymentMethodEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 
}
