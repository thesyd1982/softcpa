/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.Converter;

import fr.sysdev.softcpa.constants.Constants;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author f
 */
public class ClientStatusConverter extends Converter<Integer, String>{
     @Override
    public String convertForward(Integer arg) {
        String value ="" ;
        switch (arg) {
            case 1: value=Constants.Labels.CLIENT_STATUS_PRO; 
                    break;
            case 0: value=Constants.Labels.CLIENT_STATUS_INDIVIDUAL; 
                    break;
           
            default:
                break;
        }
        return value;
    }

    @Override
    public Integer convertReverse(String arg) {
        int value = 0;
        if (null != arg) switch (arg) {
            case Constants.Labels.CLIENT_STATUS_PRO :
                value = 1;
                break;
            case Constants.Labels.CLIENT_STATUS_INDIVIDUAL:
                value = 0;
                break;

            default:
                break;
        }
        return value;
}
}