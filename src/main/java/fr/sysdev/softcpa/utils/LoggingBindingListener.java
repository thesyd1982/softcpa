/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils;

import javax.swing.JLabel;
import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.Binding;

/**
 *
 * @author f
 */
public class LoggingBindingListener extends AbstractBindingListener {
    /** Label used to display warnings. */
    private JLabel outputLabel;

    public LoggingBindingListener(JLabel outputLabel) {
        if (outputLabel == null) throw new IllegalArgumentException();
        this.outputLabel = outputLabel;
    }

    @Override
    public void syncFailed(Binding binding, Binding.SyncFailure fail) {
        String description;
        if ((fail != null) && (fail.getType() == Binding.SyncFailureType.VALIDATION_FAILED)) {
            description = fail.getValidationResult().getDescription();
        } else {
            description = "Sync failed!";
        }
        String msg = "[" + binding.getName() + "] " + description;
        System.out.println(msg);
        outputLabel.setText(msg);
    }

    @Override
    public void synced(Binding binding) {
        String bindName = binding.getName();
        String msg = "[" + bindName + "] Synced";
        System.out.println(msg);        
        outputLabel.setText("");
    }

}
