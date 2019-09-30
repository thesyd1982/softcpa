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


public class IdConvertor   extends Converter<Integer, Long> {

    @Override
    public Long convertForward(Integer arg) {
        return new Long(arg);
    }

    @Override
    public Integer convertReverse(Long arg) {
        int value;
        try {
            value = (arg == null) ? 0 : arg.intValue();
        } catch (NumberFormatException ex) {
            value = 0;
        }
        return value;
    }

}