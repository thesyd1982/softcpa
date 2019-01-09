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
public class PhoneNumberValidator  extends Validator<String> {

    @Override
    public Validator.Result validate(String arg) {
        if ((arg == null) || (arg.length() == 0)) {
            //return new Validator.Result(null, "Numéro de téléphone requis");
        }
        else {if(!arg.matches("^0[1-9]([-. ]?[0-9]{2}){4}$"))
               return new Validator.Result(null, "Ce Numéro de téléphone n'est pas valide");
            }
        return null;
    }
    
}

