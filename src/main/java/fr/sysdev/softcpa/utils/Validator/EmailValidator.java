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
public class EmailValidator  extends Validator<String> {

    @Override
    public Validator.Result validate(String arg) {
        
        if (!arg.matches( "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$")) {
           
             return new Validator.Result(null, Constants.Messages.ENTER_VALID_EMAIL);
             
        }
        return null;    
    }
}