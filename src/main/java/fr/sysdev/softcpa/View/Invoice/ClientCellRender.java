/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Invoice;

import fr.sysdev.softcpa.View.Client.*;
import fr.sysdev.softcpa.constants.Constants;
import fr.sysdev.softcpa.entity.Client;
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
public class ClientCellRender  extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
           Client client = (Client)value;
            int status = client.getStatus();
            if(status ==1 )
            {
             
             setFont(getFont().deriveFont(Font.BOLD));
             setBackground(Color.green);
             setForeground(Color.white);

            }
            else{
                setFont(getFont().deriveFont(Font.BOLD));
             setBackground(Color.red);
             setForeground(Color.white);
            
            
            }
            setText(client.getName()+" "+client.getSurname());
            this.setHorizontalAlignment( JLabel.CENTER );
        return this;
    }
}