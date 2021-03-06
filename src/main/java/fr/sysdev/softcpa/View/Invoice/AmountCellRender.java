/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Invoice;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author f
 */
public class AmountCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        Double amount = (Double)value;
            
            if(isSelected){
                setFont(getFont().deriveFont(Font.BOLD));
                setForeground(Color.white);
                
            }
            else {
                setFont(getFont().deriveFont(Font.BOLD));
                setForeground(Color.BLACK);
            }
             setText(amount+" €");
             this.setHorizontalAlignment( JLabel.CENTER );
        
        return this;
    }
    
}
