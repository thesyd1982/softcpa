/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Invoice;

import fr.sysdev.softcpa.constants.FR.*;
import fr.sysdev.softcpa.entity.Client;
import fr.sysdev.softcpa.entity.Invoice;
import fr.sysdev.softcpa.entity.InvoiceStatusEnum;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import fr.sysdev.softcpa.utils.predicates.InvoicesPredicates;
import java.beans.PropertyVetoException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.TableColumnModel;
import org.springframework.stereotype.Component;
/**
 *
 * @author f
 */
@Component
public class InvoiceView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InvoiceView
     */
    private List<Invoice> invoices;
    private List<Invoice> allInvoices;
    private List<Invoice> selectedInvoices;
    private Invoice invoice;
    public InvoiceView() {
        initComponents();
    }

    public InvoiceView(List<Invoice> invoices) {
        this.setTitle(Constants.JFrameTitles.INVOICES);

        this.invoices = new ArrayList<>(invoices);
        this.allInvoices = new ArrayList<>(invoices);
        
        initComponents();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField_Invoice_Search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Invoice = new javax.swing.JTable();
        jButton_Refresh = new javax.swing.JButton();
        jLabel_Part_Count = new javax.swing.JLabel();
        jLabel_Invoice_Search = new javax.swing.JLabel();
        jButton_Invoice_Details = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/001-bill.png"))); // NOI18N

        jTextField_Invoice_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Invoice_SearchKeyReleased(evt);
            }
        });

        jTable_Invoice.setAutoCreateRowSorter(true);
        jTable_Invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Invoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_Invoice.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${invoices}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable_Invoice);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceNumber}"));
        columnBinding.setColumnName("Invoice Number");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${client}"));
        columnBinding.setColumnName("Client");
        columnBinding.setColumnClass(fr.sysdev.softcpa.entity.Client.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${platenumber}"));
        columnBinding.setColumnName("Platenumber");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vehicleType}"));
        columnBinding.setColumnName("Vehicle Type");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${amount}"));
        columnBinding.setColumnName("Amount");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceDate}"));
        columnBinding.setColumnName("Invoice Date");
        columnBinding.setColumnClass(java.time.LocalDate.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceStatus}"));
        columnBinding.setColumnName("Invoice Status");
        columnBinding.setColumnClass(fr.sysdev.softcpa.entity.InvoiceStatusEnum.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${invoice}"), jTable_Invoice, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${selectedInvoices}"), jTable_Invoice, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        jTable_Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_InvoiceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Invoice);

        jButton_Refresh.setText("jButton1");
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jLabel_Part_Count.setText("jLabel1");

        jLabel_Invoice_Search.setText("jLabel1");

        jButton_Invoice_Details.setText("jButton1");
        jButton_Invoice_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Invoice_DetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel_Invoice_Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Invoice_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Part_Count)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Invoice_Details, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Invoice_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Invoice_Search)
                    .addComponent(jButton_Refresh)
                    .addComponent(jLabel_Part_Count)
                    .addComponent(jButton_Invoice_Details))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Invoice_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Invoice_SearchKeyReleased
        
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            invoices.clear();
            invoices.addAll(allInvoices);
            bindingInvoicesTable();
        }
        search();
    
    }//GEN-LAST:event_jTextField_Invoice_SearchKeyReleased

    private void jTable_InvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_InvoiceMouseClicked
         getInvoiceFromSelectedTableRow();
        jTable_Invoice.setSelectionBackground(Color.blue);
        jTable_Invoice.setSelectionForeground(Color.white);
      
        if (evt.getClickCount() == 2) {
             
             
            jButton_Invoice_Details.doClick();
            
        } else {
            //updateInterface();
        }
    }//GEN-LAST:event_jTable_InvoiceMouseClicked
public InvoiceDetailsView displayInvoice(Invoice in) throws PropertyVetoException {
        InvoiceDetailsView idv = new InvoiceDetailsView(in);
        
        idv.setVisible(true);
        this.getParent().add(idv);
        idv.setSelected(true);
        idv.toFront();
        idv.setFocusable(true);
       return idv;
    }

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        prepareForm();
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_Invoice_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Invoice_DetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Invoice_DetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Invoice_Details;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JLabel jLabel_Invoice_Search;
    private javax.swing.JLabel jLabel_Part_Count;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Invoice;
    private javax.swing.JTextField jTextField_Invoice_Search;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    private void search() {
          String s = jTextField_Invoice_Search.getText().toUpperCase();

        if (s.equals("")) {
            invoices.clear();
            invoices.addAll(allInvoices);
            bindingInvoicesTable();
          
        } else {
            List<Invoice> filter = InvoicesPredicates.filterInvoices(allInvoices, InvoicesPredicates.oneOfAllContains(s));
            invoices.clear();
            invoices.addAll(filter);
            
            if (invoices.size() > 0) {


                bindingInvoicesTable();
                jTable_Invoice.setRowSelectionInterval(0, 0);
                jTable_Invoice.setSelectionBackground(Color.blue);
                jTable_Invoice.setSelectionForeground(Color.red);

            } else {

                invoices.clear();
                bindingInvoicesTable();

            }
    }
}

    private Invoice getInvoiceFromSelectedTableRow() {
        invoice = new Invoice();
        int row = jTable_Invoice.getSelectedRow();
        int rowt = jTable_Invoice.getRowSorter().convertRowIndexToModel(row);
        Long id = (Long) (jTable_Invoice.getModel().getValueAt(rowt, 0));
        invoice.setId(id);
        String iN = (String) (jTable_Invoice.getModel().getValueAt(rowt, 1));
        invoice.setInvoiceNumber(iN);

       Client client = (Client) (jTable_Invoice.getModel().getValueAt(rowt, 2));
        invoice.setClient(client);

         String platenumber =(String) (jTable_Invoice.getModel().getValueAt(rowt, 3));
         invoice.setPlatenumber(platenumber);
         
         String vehicleType =(String) (jTable_Invoice.getModel().getValueAt(rowt, 4));
         invoice.setVehicleType(vehicleType);
         
         Double amount=(Double) (jTable_Invoice.getModel().getValueAt(rowt, 5));
         
         invoice.setAmount(amount);

         LocalDate invoiceDate= (LocalDate)(jTable_Invoice.getModel().getValueAt(rowt, 6));
         invoice.setInvoiceDate(invoiceDate);
         
         InvoiceStatusEnum invoiceStatus  = (InvoiceStatusEnum)(jTable_Invoice.getModel().getValueAt(rowt, 7));
         invoice.setInvoiceStatus(invoiceStatus);
                 
        return invoice;
    }

    private void bindingInvoicesTable() {
        
        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${invoices}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable_Invoice);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceNumber}"));
        columnBinding.setColumnName("Invoice Number");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${client}"));
        columnBinding.setColumnName("Client");
        columnBinding.setColumnClass(fr.sysdev.softcpa.entity.Client.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vehicleType}"));
        columnBinding.setColumnName("Vehicle Type");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${platenumber}"));
        columnBinding.setColumnName("Platenumber");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${amount}"));
        columnBinding.setColumnName("Amount");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceDate}"));
        columnBinding.setColumnName("Invoice Date");
        columnBinding.setColumnClass(java.time.LocalDate.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${invoiceStatus}"));
        columnBinding.setColumnName("Invoice Status");
        columnBinding.setColumnClass(fr.sysdev.softcpa.entity.InvoiceStatusEnum.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        
        
        
        TableColumnModel cm = jTable_Invoice.getColumnModel();
        cm.getColumn(0).setPreferredWidth(25);
        cm.getColumn(1).setPreferredWidth(25);
        cm.getColumn(2).setPreferredWidth(25);
        cm.getColumn(3).setPreferredWidth(25);
        cm.getColumn(4).setPreferredWidth(25);
        cm.getColumn(5).setPreferredWidth(25);
        cm.getColumn(6).setPreferredWidth(25);
        cm.getColumn(7).setPreferredWidth(25);
        
        cm.getColumn(2).setCellRenderer(new ClientCellRender());
        cm.getColumn(5).setCellRenderer(new AmountCellRender());
        cm.getColumn(7).setCellRenderer(new InvoiceStatusCellRender());
  
        jTable_Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (jTable_Invoice.isEditing())
     jTable_Invoice.getCellEditor().stopCellEditing();
                
                jTable_InvoiceMouseClicked(evt);
               
            }
        });
        

    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void loadInvoices() {
        System.out.println("Maj des invoices");
        allInvoices = invoices;
        prepareForm();
    }

    private void prepareForm() {
        
        jButton_Invoice_Details.setText(Constants.Labels.INVOICE_DETAILS);
        jButton_Refresh.setText(Constants.Labels.REFRESH_BTN);
        jLabel_Invoice_Search.setText(Constants.Labels.SEARCH);
        bindingInvoicesTable();
    }
    
    
    public JButton getDetailsBtn(){
    
    return jButton_Invoice_Details;
    }

    public List<Invoice> getSelectedInvoices() {
        return selectedInvoices;
    }

    public void setSelectedInvoices(List<Invoice> selectedInvoices) {
        this.selectedInvoices = selectedInvoices;
    }
    
    
}
