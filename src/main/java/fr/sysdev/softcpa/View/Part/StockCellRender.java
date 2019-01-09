/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Part;

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
public class StockCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        int stock = (int)value;
            
             if(stock == 0 ){setBackground(Color.LIGHT_GRAY);}
             else if (stock > 0 ){
             setBackground(Color.green);
             setFont(getFont().deriveFont(Font.BOLD));
             setForeground(Color.white);
             setText(stock+"");
             }
             else{
             setBackground(Color.red);
             setFont(getFont().deriveFont(Font.BOLD));
             setForeground(Color.white);
             setText(stock+"");
             }
             this.setHorizontalAlignment( JLabel.CENTER );
        
        return this;
    }
    
}
