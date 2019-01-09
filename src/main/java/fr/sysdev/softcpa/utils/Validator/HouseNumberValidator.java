/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.Validator;

import org.jdesktop.beansbinding.Validator;

/**
 *
 * @author f
 */
public class HouseNumberValidator  extends Validator<String> {

    @Override
    public Validator.Result validate(String arg) {
        if ((arg == null) || (arg.length() == 0)) {
            //return new Validator.Result(null, "Numéro de téléphone requis");
        }
        else {if(!arg.matches("^\\d+[a-zA-Z]*$"))
               return new Validator.Result(null, "Ce Numéro de téléphone n'est pas valide");
            }
        return null;
    }
    
}

