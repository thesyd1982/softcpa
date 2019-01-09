/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Part;

import fr.sysdev.softcpa.entity.Provider;
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
public class ProviderCellRender  extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
           this.setHorizontalAlignment( JLabel.CENTER );
            Provider provider = (Provider)value;
            
             if(provider.getName().equals("")){setBackground(Color.LIGHT_GRAY);
             setText("");}
             else{
             setBackground(Color.green);
             setFont(getFont().deriveFont(Font.BOLD));
             setForeground(Color.white);
             setText(provider.getName());
             }
             
            
            
        return this;
    }
}