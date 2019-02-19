/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Invoice;

import fr.sysdev.softcpa.constants.Constants;
import fr.sysdev.softcpa.entity.Invoice;
import fr.sysdev.softcpa.entity.InvoiceLine;
import fr.sysdev.softcpa.entity.Payment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import org.springframework.stereotype.Component;

/**
 *
 * @author f
 */
@Component
public class InvoiceDetailsView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InvoiceDetailsView
     */
    private Invoice invoice;
    private List<InvoiceLine>invoiceLines;
    
    public InvoiceDetailsView() {
        initComponents();
    }
    
     public InvoiceDetailsView(Invoice invoice) {
       
        initComponents();
         this.invoice = invoice;
         this.invoiceLines = invoice.getInvocesLines();
         prepareForm();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientStatusConverter1 = new fr.sysdev.softcpa.utils.Converter.ClientStatusConverter();
        jPanel_Client = new javax.swing.JPanel();
        jLabel_Client_Name = new javax.swing.JLabel();
        jLabel_Client_Name_Value = new javax.swing.JLabel();
        jLabel_Client_Surname = new javax.swing.JLabel();
        jLabel_Client_Surname_Value = new javax.swing.JLabel();
        jLabel_Phone_Number_Value = new javax.swing.JLabel();
        jLabel_Phone_Number = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Email_Value = new javax.swing.JLabel();
        jLabel_Client_Company_Name = new javax.swing.JLabel();
        jLabel_Client_Company_Name_Value = new javax.swing.JLabel();
        jLabel_Client_Status_Value = new javax.swing.JLabel();
        jLabel_Client_Status = new javax.swing.JLabel();
        jLabel_CLient_Address = new javax.swing.JLabel();
        jPanel_Address = new javax.swing.JPanel();
        jLabel_Client_Address_Street = new javax.swing.JLabel();
        jLabel_Client_Address_Street_Value = new javax.swing.JLabel();
        jLabel_Client_Address_House_Number_Value = new javax.swing.JLabel();
        jLabel_Client_Address_House_Number = new javax.swing.JLabel();
        jLabel_Client_Address_City = new javax.swing.JLabel();
        jLabel_Client_Address_City_Value = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Plate_Number_Value = new javax.swing.JLabel();
        jLabel_Plate_Number = new javax.swing.JLabel();
        jLabel_Vehicle_Type_Value = new javax.swing.JLabel();
        jLabel_Vehicle_Type = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Invoice_Number_Value = new javax.swing.JLabel();
        jLabel_Invoice_Number = new javax.swing.JLabel();
        jLabel_Invoice_Status_Value = new javax.swing.JLabel();
        jLabel_Invoice_Status = new javax.swing.JLabel();
        jLabel_Invoice_Date = new javax.swing.JLabel();
        jLabel_Invoice_Date_Value = new javax.swing.JLabel();
        jPanel_Invoice_Payment = new javax.swing.JPanel();
        jLabel_Invoice_PaymentDate_Value = new javax.swing.JLabel();
        jLabel_Invoice_Payment_Amount_Value = new javax.swing.JLabel();
        jLabel_Invoice_PaymentDate = new javax.swing.JLabel();
        jLabel_Invoice_Payment_Amount = new javax.swing.JLabel();
        jLabel_Invoice_Payment_Method = new javax.swing.JLabel();
        jLabel_Invoice_Payment_Method_Value = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_InvoiceLines = new javax.swing.JPanel();
        jPanel_InvoiceLines1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel_Client.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Client_Name.setText("jLabel1");

        jLabel_Client_Name_Value.setText("jLabel1");

        jLabel_Client_Surname.setText("jLabel1");

        jLabel_Client_Surname_Value.setText("jLabel1");

        jLabel_Phone_Number_Value.setText("jLabel1");

        jLabel_Phone_Number.setText("jLabel1");

        jLabel_Email.setText("jLabel1");

        jLabel_Email_Value.setText("jLabel1");

        jLabel_Client_Company_Name.setText("jLabel1");

        jLabel_Client_Company_Name_Value.setText("jLabel1");

        jLabel_Client_Status_Value.setText("jLabel1");

        jLabel_Client_Status.setText("jLabel1");

        jLabel_CLient_Address.setText("jLabel1");

        jPanel_Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Client_Address_Street.setText("jLabel1");

        jLabel_Client_Address_Street_Value.setText("jLabel1");

        jLabel_Client_Address_House_Number_Value.setText("jLabel1");

        jLabel_Client_Address_House_Number.setText("jLabel1");

        jLabel_Client_Address_City.setText("jLabel1");

        jLabel_Client_Address_City_Value.setText("jLabel1");

        javax.swing.GroupLayout jPanel_AddressLayout = new javax.swing.GroupLayout(jPanel_Address);
        jPanel_Address.setLayout(jPanel_AddressLayout);
        jPanel_AddressLayout.setHorizontalGroup(
            jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AddressLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Address_Street)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Address_Street_Value))
                    .addGroup(jPanel_AddressLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Address_House_Number)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Address_House_Number_Value))
                    .addGroup(jPanel_AddressLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Address_City)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Address_City_Value)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel_AddressLayout.setVerticalGroup(
            jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AddressLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AddressLayout.createSequentialGroup()
                        .addGroup(jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Address_Street)
                            .addComponent(jLabel_Client_Address_Street_Value))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AddressLayout.createSequentialGroup()
                        .addGroup(jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Address_House_Number)
                            .addComponent(jLabel_Client_Address_House_Number_Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_AddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Address_City)
                            .addComponent(jLabel_Client_Address_City_Value))))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel_ClientLayout = new javax.swing.GroupLayout(jPanel_Client);
        jPanel_Client.setLayout(jPanel_ClientLayout);
        jPanel_ClientLayout.setHorizontalGroup(
            jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Status)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Status_Value))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Company_Name)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Company_Name_Value))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Phone_Number)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone_Number_Value))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email_Value))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Surname)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Surname_Value))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(jLabel_Client_Name)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Client_Name_Value)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CLient_Address))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ClientLayout.setVerticalGroup(
            jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Client_Name)
                    .addComponent(jLabel_Client_Name_Value)
                    .addComponent(jLabel_CLient_Address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Surname)
                            .addComponent(jLabel_Client_Surname_Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Phone_Number)
                            .addComponent(jLabel_Phone_Number_Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Email)
                            .addComponent(jLabel_Email_Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Status)
                            .addComponent(jLabel_Client_Status_Value))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Client_Company_Name)
                            .addComponent(jLabel_Client_Company_Name_Value)))
                    .addComponent(jPanel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Plate_Number_Value.setText("jLabel1");

        jLabel_Plate_Number.setText("jLabel1");

        jLabel_Vehicle_Type_Value.setText("jLabel1");

        jLabel_Vehicle_Type.setText("jLabel1");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Invoice_Number_Value.setText("jLabel1");

        jLabel_Invoice_Number.setText("jLabel1");

        jLabel_Invoice_Status_Value.setText("jLabel1");

        jLabel_Invoice_Status.setText("jLabel1");

        jLabel_Invoice_Date.setText("jLabel1");

        jLabel_Invoice_Date_Value.setText("jLabel1");

        jPanel_Invoice_Payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_Invoice_PaymentDate_Value.setText("jLabel1");

        jLabel_Invoice_Payment_Amount_Value.setText("jLabel1");

        jLabel_Invoice_PaymentDate.setText("jLabel1");

        jLabel_Invoice_Payment_Amount.setText("jLabel1");

        jLabel_Invoice_Payment_Method.setText("jLabel1");

        jLabel_Invoice_Payment_Method_Value.setText("jLabel1");

        javax.swing.GroupLayout jPanel_Invoice_PaymentLayout = new javax.swing.GroupLayout(jPanel_Invoice_Payment);
        jPanel_Invoice_Payment.setLayout(jPanel_Invoice_PaymentLayout);
        jPanel_Invoice_PaymentLayout.setHorizontalGroup(
            jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Invoice_PaymentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_Invoice_PaymentLayout.createSequentialGroup()
                            .addComponent(jLabel_Invoice_PaymentDate)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_Invoice_PaymentDate_Value))
                        .addGroup(jPanel_Invoice_PaymentLayout.createSequentialGroup()
                            .addComponent(jLabel_Invoice_Payment_Amount)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel_Invoice_Payment_Amount_Value)))
                    .addGroup(jPanel_Invoice_PaymentLayout.createSequentialGroup()
                        .addComponent(jLabel_Invoice_Payment_Method)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Invoice_Payment_Method_Value)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel_Invoice_PaymentLayout.setVerticalGroup(
            jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Invoice_PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Invoice_PaymentDate_Value)
                    .addComponent(jLabel_Invoice_PaymentDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Invoice_Payment_Amount_Value)
                    .addComponent(jLabel_Invoice_Payment_Amount))
                .addGap(18, 18, 18)
                .addGroup(jPanel_Invoice_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Invoice_Payment_Method_Value)
                    .addComponent(jLabel_Invoice_Payment_Method))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_Invoice_Date)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Invoice_Date_Value))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Invoice_Status)
                            .addComponent(jLabel_Invoice_Number))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Invoice_Number_Value)
                            .addComponent(jLabel_Invoice_Status_Value))))
                .addGap(110, 110, 110)
                .addComponent(jPanel_Invoice_Payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Invoice_Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Invoice_Date_Value)
                            .addComponent(jLabel_Invoice_Date))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Invoice_Status_Value)
                            .addComponent(jLabel_Invoice_Status))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Invoice_Number_Value)
                            .addComponent(jLabel_Invoice_Number))))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Vehicle_Type)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Vehicle_Type_Value))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_Plate_Number)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Plate_Number_Value)))
                .addGap(53, 53, 53)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Plate_Number)
                    .addComponent(jLabel_Plate_Number_Value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Vehicle_Type)
                    .addComponent(jLabel_Vehicle_Type_Value))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_InvoiceLines.setLayout(new java.awt.GridLayout(50, 0));

        jPanel_InvoiceLines1.setLayout(new java.awt.GridLayout(50, 0));
        jPanel_InvoiceLines.add(jPanel_InvoiceLines1);

        jScrollPane1.setViewportView(jPanel_InvoiceLines);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fr.sysdev.softcpa.utils.Converter.ClientStatusConverter clientStatusConverter1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_CLient_Address;
    private javax.swing.JLabel jLabel_Client_Address_City;
    private javax.swing.JLabel jLabel_Client_Address_City_Value;
    private javax.swing.JLabel jLabel_Client_Address_House_Number;
    private javax.swing.JLabel jLabel_Client_Address_House_Number_Value;
    private javax.swing.JLabel jLabel_Client_Address_Street;
    private javax.swing.JLabel jLabel_Client_Address_Street_Value;
    private javax.swing.JLabel jLabel_Client_Company_Name;
    private javax.swing.JLabel jLabel_Client_Company_Name_Value;
    private javax.swing.JLabel jLabel_Client_Name;
    private javax.swing.JLabel jLabel_Client_Name_Value;
    private javax.swing.JLabel jLabel_Client_Status;
    private javax.swing.JLabel jLabel_Client_Status_Value;
    private javax.swing.JLabel jLabel_Client_Surname;
    private javax.swing.JLabel jLabel_Client_Surname_Value;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Email_Value;
    private javax.swing.JLabel jLabel_Invoice_Date;
    private javax.swing.JLabel jLabel_Invoice_Date_Value;
    private javax.swing.JLabel jLabel_Invoice_Number;
    private javax.swing.JLabel jLabel_Invoice_Number_Value;
    private javax.swing.JLabel jLabel_Invoice_PaymentDate;
    private javax.swing.JLabel jLabel_Invoice_PaymentDate_Value;
    private javax.swing.JLabel jLabel_Invoice_Payment_Amount;
    private javax.swing.JLabel jLabel_Invoice_Payment_Amount_Value;
    private javax.swing.JLabel jLabel_Invoice_Payment_Method;
    private javax.swing.JLabel jLabel_Invoice_Payment_Method_Value;
    private javax.swing.JLabel jLabel_Invoice_Status;
    private javax.swing.JLabel jLabel_Invoice_Status_Value;
    private javax.swing.JLabel jLabel_Phone_Number;
    private javax.swing.JLabel jLabel_Phone_Number_Value;
    private javax.swing.JLabel jLabel_Plate_Number;
    private javax.swing.JLabel jLabel_Plate_Number_Value;
    private javax.swing.JLabel jLabel_Vehicle_Type;
    private javax.swing.JLabel jLabel_Vehicle_Type_Value;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Address;
    private javax.swing.JPanel jPanel_Client;
    private javax.swing.JPanel jPanel_InvoiceLines;
    private javax.swing.JPanel jPanel_InvoiceLines1;
    private javax.swing.JPanel jPanel_Invoice_Payment;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        
        jLabel_Client_Status.setText(Constants.Labels.CLIENT_STATUS);
        jLabel_Client_Company_Name.setText(Constants.Labels.COMPANY_NAME);
        jLabel_Client_Name.setText(Constants.Labels.NAME);
        jLabel_Client_Surname.setText(Constants.Labels.SURNAME);
        jLabel_Email.setText(Constants.Labels.EMAIL);
        jLabel_Phone_Number.setText(Constants.Labels.PHONE_NUMBER);
        jLabel_CLient_Address.setText(Constants.Labels.ADDRESS);
        jLabel_Client_Address_Street.setText(Constants.Labels.HOUSE_NUMBER);
        jLabel_Client_Address_House_Number.setText(Constants.Labels.STREET);
        jLabel_Client_Address_City.setText(Constants.Labels.CITY);
        
        jLabel_Plate_Number.setText(Constants.Labels.PLATENUMBER);
        jLabel_Vehicle_Type.setText(Constants.Labels.VEHICLE_TYPE);
        
        jLabel_Invoice_Date.setText(Constants.Labels.INVOICE_DATE);
        jLabel_Invoice_Number.setText(Constants.Labels.INVOICE_NUMBER);
        jLabel_Invoice_Status.setText(Constants.Labels.INVOICE_STATUS);
        
        jLabel_Invoice_PaymentDate.setText(Constants.Labels.PAYMENT_DATE);
        jLabel_Invoice_Payment_Amount.setText(Constants.Labels.PAYED);
        jLabel_Invoice_Payment_Method.setText(Constants.Labels.PAYMENT_METHOD);
        
        
        jLabel_Client_Status_Value.setText(clientStatusConverter1.convertForward(this.invoice.getClient().getStatus()));
        jLabel_Client_Company_Name_Value.setText(this.invoice.getClient().getCompany().getName());
        jLabel_Client_Name_Value.setText(this.invoice.getClient().getName());
        jLabel_Client_Surname_Value.setText(this.invoice.getClient().getSurname());
        jLabel_Email_Value.setText(this.invoice.getClient().getEmail());
        jLabel_Phone_Number_Value.setText(this.invoice.getClient().getPhoneNumber());
        jLabel_Client_Address_Street_Value.setText(this.invoice.getClient().getAddress().getHouseNumber());
        jLabel_Client_Address_House_Number_Value.setText(this.invoice.getClient().getAddress().getStreet());
        jLabel_Client_Address_City_Value.setText(this.invoice.getClient().getAddress().getCity());
        jLabel_Plate_Number_Value.setText(this.invoice.getPlatenumber());
        jLabel_Vehicle_Type_Value.setText(this.invoice.getVehicleType());
        jLabel_Invoice_Date_Value.setText(this.invoice.getInvoiceDate().toString());
        jLabel_Invoice_Number_Value.setText(this.invoice.getInvoiceNumber());
        jLabel_Invoice_Status_Value.setText(this.invoice.getInvoiceStatus().getInvoiceStatus());
        
        Payment payment = invoice.getPayment();
        
        if(this.invoice.getInvoiceStatus().getInvoiceStatus().equals(Constants.Labels.UNPAID))     
        { 
            jPanel_Invoice_Payment.setVisible(false);
        }
        else{
        
        jPanel_Invoice_Payment.setVisible(true);
        jLabel_Invoice_PaymentDate_Value.setText(payment.getDateOfPayment()+"");
        jLabel_Invoice_Payment_Amount_Value.setText(payment.getValue()+"");
        }
        
        invoiceLines.forEach(il -> {
            JPanel p = createInvoiceLinePanel(il);
            System.out.println(""+p);
            jPanel_InvoiceLines.add(p);
            
            }
        );
         jPanel_InvoiceLines.setVisible(true);
         jPanel_InvoiceLines.revalidate();
         jPanel_InvoiceLines.repaint();
        
    }

    private JPanel createInvoiceLinePanel(InvoiceLine il) {
      
        JPanel panel;
        JLabel label;

        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
        panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);
        GridBagConstraints gdbc = new GridBagConstraints();
        int x = 0;
        int y = 0;
        int w = 1;
        label = new JLabel(il.getPart().getReference());
        label.setBorder(border);
        label.setName("labelReference" + il.getPart().getId());
        gdbc.gridx = x;
        gdbc.gridy = y;
        gdbc.gridwidth = w;
        gdbc.ipadx = 40;
        gdbc.insets = new Insets(0, 0, 0, 12);

        label.setBorder(border);
        panel.add(label, gdbc);
        label = new JLabel(il.getPart().getDesignation());
        label.setName("labelDesignation" + il.getPart().getId());
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        w = 3;
        gdbc.gridwidth = w;
        gdbc.fill = GridBagConstraints.HORIZONTAL;
        gdbc.ipadx = 250;
        label.setPreferredSize(new Dimension(50, 20));
        label.setMinimumSize(new Dimension(50, 20));
        label.setMaximumSize(new Dimension(50, 20));
        label.setBorder(border);
        panel.add(label, gdbc);
        label = new JLabel(il.getPart().getBrand());
        label.setName("labelBrand" + il.getPart().getId());
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        w = 1;
        gdbc.gridwidth = w;
        gdbc.ipadx = 40;
        label.setBorder(border);
        label.setPreferredSize(new Dimension(50, 20));
        label.setMinimumSize(new Dimension(50, 20));
        label.setMaximumSize(new Dimension(50, 20));
        panel.add(label, gdbc);
        label = new JLabel(il.getPart().getProvider().getName() + "");
        label.setName("labelProviderName" + il.getPart().getId());
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        gdbc.gridwidth = w;
        label.setBorder(border);
        label.setPreferredSize(new Dimension(50, 20));
        label.setMinimumSize(new Dimension(50, 20));
        label.setMaximumSize(new Dimension(50, 20));
        panel.add(label, gdbc);
        label = new JLabel(il.getPart().getPurchasingPrice() + "");
        label.setName("labelPurchasingPrice" + il.getPart().getId());
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        gdbc.gridwidth = w;
        gdbc.ipadx = 30;
        label.setPreferredSize(new Dimension(30, 20));
        label.setMinimumSize(new Dimension(30, 20));
        label.setMaximumSize(new Dimension(30, 20));
        label.setBorder(border);
        panel.add(label, gdbc);
        label = new JLabel(il.getPart().getSellingPrice() + "");
        label.setName("labelSellingPrice" + il.getPart().getId());
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        gdbc.gridwidth = w;
        gdbc.ipadx = 30;
        label.setPreferredSize(new Dimension(30, 20));
        label.setMinimumSize(new Dimension(30, 20));
        label.setMaximumSize(new Dimension(30, 20));
        label.setBorder(border);
        panel.add(label, gdbc);
       
        x = x + w;
        gdbc.gridx = x;
        gdbc.gridy = y;
        w = 3;
        gdbc.gridwidth = w;
        
        label = new JLabel(il.getQuantity()+"");
        label.setName("labelQuantity" + il.getPart().getId());
        panel.add(label, gdbc);
        panel.setPreferredSize(new Dimension(500, 40));
        panel.setBorder(new MatteBorder(0,0,1,0,Color.red));
        panel.setName("panel" + il.getPart().getId());

        return panel;
    }
        
        
  
}