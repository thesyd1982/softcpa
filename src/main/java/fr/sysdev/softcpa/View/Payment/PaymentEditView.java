/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Payment;

import fr.sysdev.softcpa.constants.Constants;
import fr.sysdev.softcpa.entity.Payment;
import fr.sysdev.softcpa.entity.PaymentMethodEnum;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author f
 */
public class PaymentEditView extends javax.swing.JInternalFrame {
private Payment payment;
    /**
     * Creates new form PaymentDetailsView
     */
    public PaymentEditView() {
        initComponents();
        this.title = Constants.Labels.PAYMENT_DETAILS;
        prepareForm() ;
    }

    public PaymentEditView(Payment payment) {
        this.payment = payment;
        initComponents();
        this.title = Constants.Labels.PAYMENT_DETAILS;
        prepareForm(payment); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_PaymentNumber = new javax.swing.JLabel();
        jLabel_PaymentNumber_Value = new javax.swing.JLabel();
        jLabel_Payment_Date = new javax.swing.JLabel();
        jLabel_Payment_Date_Value = new javax.swing.JLabel();
        jLabel_Payment_Amount = new javax.swing.JLabel();
        jLabel_Payment_Method = new javax.swing.JLabel();
        jButton_Add = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jTextField_Payment_Amount_Value = new javax.swing.JTextField();
        jComboBox_Payment_Method_Value = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel_PaymentNumber.setText("jLabel1");

        jLabel_PaymentNumber_Value.setText("jLabel1");

        jLabel_Payment_Date.setText("jLabel1");

        jLabel_Payment_Date_Value.setText("jLabel1");

        jLabel_Payment_Amount.setText("jLabel1");

        jLabel_Payment_Method.setText("jLabel1");

        jButton_Add.setText("jButton1");

        jButton_Cancel.setText("jButton1");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jComboBox_Payment_Method_Value.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Payment_Method)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_Payment_Method_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_PaymentNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_PaymentNumber_Value)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Payment_Date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Payment_Date_Value))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Payment_Amount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Payment_Amount_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Add)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PaymentNumber)
                    .addComponent(jLabel_PaymentNumber_Value)
                    .addComponent(jLabel_Payment_Date)
                    .addComponent(jLabel_Payment_Date_Value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Payment_Method)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Payment_Amount)
                        .addComponent(jTextField_Payment_Amount_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Payment_Method_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Add)
                    .addComponent(jButton_Cancel))
                .addGap(36, 36, 36))
        );

        setBounds(0, 0, 309, 190);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelActionPerformed

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JComboBox<String> jComboBox_Payment_Method_Value;
    private javax.swing.JLabel jLabel_PaymentNumber;
    private javax.swing.JLabel jLabel_PaymentNumber_Value;
    private javax.swing.JLabel jLabel_Payment_Amount;
    private javax.swing.JLabel jLabel_Payment_Date;
    private javax.swing.JLabel jLabel_Payment_Date_Value;
    private javax.swing.JLabel jLabel_Payment_Method;
    private javax.swing.JTextField jTextField_Payment_Amount_Value;
    // End of variables declaration//GEN-END:variables

    private void prepareForm(Payment payment) {
        jLabel_PaymentNumber.setText(Constants.Labels.PAYMENT_NUMBER);
        jLabel_PaymentNumber_Value.setText(payment.getId()+"");
        jLabel_Payment_Amount.setText(Constants.Labels.AMOUNT);
        jTextField_Payment_Amount_Value.setText(payment.getAmount()+"");
        jLabel_Payment_Date.setText(Constants.Labels.PAYMENT_DATE);
        jLabel_Payment_Date_Value.setText(payment.getDateOfPayment().toString());
        jLabel_Payment_Method.setText(Constants.Labels.PAYMENT_METHOD);
        jLabel_Payment_Date_Value.setText(payment.getPaymentMethod().getName());
        jButton_Add.setText(Constants.Labels.ADD_BTN);
        jButton_Cancel.setText(Constants.Labels.CANCEL_BTN);
        
        jComboBox_Payment_Method_Value.removeAllItems();
        PaymentMethodEnum[] values = PaymentMethodEnum.values();
        List<PaymentMethodEnum> pmsList = Arrays.asList(values);
        pmsList.forEach(pm->jComboBox_Payment_Method_Value.addItem(pm.getName()) );
    }
    
    
     private void prepareForm() {
        jLabel_PaymentNumber.setText(Constants.Labels.PAYMENT_NUMBER);
        //jLabel_PaymentNumber_Value.setText(payment.getId()+"");
        jLabel_Payment_Amount.setText(Constants.Labels.AMOUNT);
        jTextField_Payment_Amount_Value.setText(0.0+"");
        jLabel_Payment_Date.setText(Constants.Labels.PAYMENT_DATE);
        //jLabel_Payment_Date_Value.setText(payment.getDateOfPayment().toString());
        jLabel_Payment_Method.setText(Constants.Labels.PAYMENT_METHOD);
        //jLabel_Payment_Date_Value.setText(payment.getPaymentMethod().getName());
        jButton_Add.setText(Constants.Labels.ADD_BTN);
        jButton_Cancel.setText(Constants.Labels.CANCEL_BTN);
        PaymentMethodEnum[] values = PaymentMethodEnum.values();
        List<PaymentMethodEnum> pmsList = Arrays.asList(values);
        pmsList.forEach(pm->jComboBox_Payment_Method_Value.addItem(pm.getName()) );
    }
    
    
}
