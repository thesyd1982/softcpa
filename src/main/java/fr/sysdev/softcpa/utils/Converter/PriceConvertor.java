/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.Converter;
import org.jdesktop.beansbinding.Converter;
/**
 *
 * @author thesyd
 */


public class PriceConvertor   extends Converter<String, Double> {

    @Override
    public Double convertForward(String arg) {
        //return new Double(arg);
        
        Double value;
        try {
            value = (arg == "") ? 0.0 : new Double(arg);
        } catch (NumberFormatException ex) {
            value = 0.0;
        }
        return value;
        
    }

    @Override
    public String convertReverse(Double arg) {
        String value;
        try {
            value = (arg == null) ? "-1" : arg.toString();
        } catch (NumberFormatException ex) {
            value = "-1";
        }
        return value;
    }

}