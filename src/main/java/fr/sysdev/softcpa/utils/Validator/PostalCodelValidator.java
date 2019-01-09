/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.Validator;

import fr.sysdev.softcpa.constants.Constants;
import org.jdesktop.beansbinding.Validator;

/**
 *
 * @author f
 */
public class PostalCodelValidator  extends Validator<String> {

    @Override
    public Validator.Result validate(String arg) {
        
        if (!arg.matches( "^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$")) {
           
             return new Validator.Result(null, Constants.Messages.ENTER_VALID_POSTAL_CODE);
             
        }
        return null;    
    }
}