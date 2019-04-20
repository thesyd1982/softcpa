/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Invoice;


import fr.sysdev.softcpa.entity.InvoiceStatusEnum;
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
public class InvoiceStatusCellRender  extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
           
            InvoiceStatusEnum status = (InvoiceStatusEnum)value;
            if(null == status)
            {
                setFont(getFont().deriveFont(Font.BOLD));
                setBackground(Color.red);
                setForeground(Color.white);
                
            }
            else switch (status) {
            case PAYED:
                setFont(getFont().deriveFont(Font.BOLD));
                setBackground(Color.green);
                setForeground(Color.white);
               
                break;
            case PENDING:
                setFont(getFont().deriveFont(Font.BOLD));
                setBackground(Color.red);
                setForeground(Color.white);
                
                break;
            default:
                setFont(getFont().deriveFont(Font.BOLD));
                setBackground(Color.red);
                setForeground(Color.white);
                break;
        }
            this.setHorizontalAlignment( JLabel.CENTER );
        return this;
    }
}