/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;

import fr.sysdev.softcpa.constants.FR.*;

/**
 *
 * @author f
 */
public enum ClientStatusEnum {
    
  INDIVIDUAL(Constants.Labels.INDIVIDUAL),PROFESSIONAL(Constants.Labels.PROFESSIONAL);
    
    private final String name;

    private ClientStatusEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override 
        public String toString(){ 
            return name; 
        } 
}