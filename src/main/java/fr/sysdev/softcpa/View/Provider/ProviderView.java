/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.View.Provider;



import fr.sysdev.softcpa.constants.Constants;
import fr.sysdev.softcpa.entity.Provider;
import fr.sysdev.softcpa.utils.predicates.ProvidersPredicates;
import fr.sysdev.softcpa.utils.ui.IconHeaderRenderer;
import fr.sysdev.softcpa.utils.ui.TextAndIcon;
import java.awt.Color;
import java.awt.HeadlessException;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JTextField;
import javax.swing.UIManager;


import javax.swing.event.RowSorterEvent;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author COPCGRE
 */
@Slf4j
@Component
@Scope
public class ProviderView extends javax.swing.JInternalFrame {
    private  Provider provider = new Provider();
    private  List<Provider> allProviders;
    private  List<Provider> providers;
 

    private String csvFile;
    private TableRowSorter<TableModel> sorter;

 

    public ProviderView(List<Provider> providers) {

        this.providers = new ArrayList<>(providers);
        this.allProviders = new ArrayList<>(this.providers);

        initComponents(); 
        prepareForm();
        resetInterface();

    }



    /**
     * Creates new form PieceViews
     */

    public ProviderView() {

        initComponents();

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

        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Remove = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Invoicing = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Provider = new javax.swing.JTable();
        jTextField_Provider_Search = new javax.swing.JTextField();
        jTextField_Provider_Name = new javax.swing.JTextField();
        jTextField_Provider_Id = new javax.swing.JTextField();
        jLabel_Provider_Name = new javax.swing.JLabel();
        jLabel_Provider_Name_Id = new javax.swing.JLabel();
        jLabel_Provider_Search = new javax.swing.JLabel();
        jButton_Part_Open_Csv = new javax.swing.JButton();
        jTextField_Part_CsvFilePath = new javax.swing.JTextField();
        jButton_Part_Import = new javax.swing.JButton();
        jLabel_Provider_Count = new javax.swing.JLabel();
        jButton_Refresh = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Stock");
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1160, 527));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Update.setText("Modify");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Remove.setText("Remove");
        jButton_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemoveActionPerformed(evt);
            }
        });

        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Invoicing.setText("Invoicing");
        jButton_Invoicing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InvoicingActionPerformed(evt);
            }
        });

        jTable_Provider.setAutoCreateRowSorter(true);
        jTable_Provider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${providers}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable_Provider);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable_Provider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProviderMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Provider);

        jTextField_Provider_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Provider_SearchKeyReleased(evt);
            }
        });

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable_Provider, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.name}"), jTextField_Provider_Name, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField_Provider_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Provider_NameActionPerformed(evt);
            }
        });

        jTextField_Provider_Id.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable_Provider, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), jTextField_Provider_Id, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField_Provider_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Provider_IdActionPerformed(evt);
            }
        });

        jLabel_Provider_Name.setText("jLabel1");

        jLabel_Provider_Name_Id.setText("jLabel1");

        jLabel_Provider_Search.setText("jLabel1");

        jButton_Part_Open_Csv.setText("open csv");
        jButton_Part_Open_Csv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Part_Open_CsvActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${csvFile}"), jTextField_Part_CsvFilePath, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jButton_Part_Import.setText("Import");
        jButton_Part_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Part_ImportActionPerformed(evt);
            }
        });

        jLabel_Provider_Count.setText("jLabel1");

        jButton_Refresh.setText("jButton1");
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Provider_Name_Id)
                            .addComponent(jLabel_Provider_Name))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_Provider_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addComponent(jTextField_Provider_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel_Provider_Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Provider_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Provider_Count)
                        .addContainerGap(193, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Invoicing, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_Part_CsvFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Part_Open_Csv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Part_Import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Provider_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Provider_Name_Id))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Provider_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Provider_Search)
                        .addComponent(jLabel_Provider_Count)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_Invoicing))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Provider_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Provider_Name))
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Update)
                            .addComponent(jButton_Remove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Cancel)
                            .addComponent(jButton_Add)
                            .addComponent(jButton_Part_Open_Csv))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Part_CsvFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Part_Import)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_Refresh)))
                .addGap(29, 29, 29))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Provider_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Provider_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Provider_NameActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        //pieceController.getView().setTitle("toDel");
        //System.out.println(""+pieceController.getView().getTitle());
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
     
        
        
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jTextField_Provider_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Provider_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Provider_IdActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        updateInterface();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        resetInterface();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_Part_Open_CsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Part_Open_CsvActionPerformed
        getCsvFilePath();
    }//GEN-LAST:event_jButton_Part_Open_CsvActionPerformed

    private void jButton_Part_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Part_ImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Part_ImportActionPerformed

    private void jTable_ProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProviderMouseClicked
        getProviderFromSelectedTableRow();
 
        jTable_Provider.setSelectionBackground(Color.blue);
        jTable_Provider.setSelectionForeground(Color.white);
        if (evt.getClickCount() == 2) {

        } else {
            updateInterface();
        }
    }//GEN-LAST:event_jTable_ProviderMouseClicked

    private void jTextField_Provider_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Provider_SearchKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
        {   providers.clear();
            providers.addAll(allProviders);
            //bindingPartTable();
        }
        search();
    }//GEN-LAST:event_jTextField_Provider_SearchKeyReleased

    private void jButton_InvoicingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InvoicingActionPerformed


    }//GEN-LAST:event_jButton_InvoicingActionPerformed

    private void jButton_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RemoveActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
   bindingPartTable();
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    public void getCsvFilePath() throws HeadlessException {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle(Constants.Labels.SELECT_A_FILE);
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(Constants.Labels.CSV_FILE, "csv");
        jfc.addChoosableFileFilter(filter);

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile().getPath());
            this.setCsvFile(jfc.getSelectedFile().getPath());
            jTextField_Part_CsvFilePath.setText(csvFile);
        } else {
            System.out.println("No Selection ");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Invoicing;
    private javax.swing.JButton jButton_Part_Import;
    private javax.swing.JButton jButton_Part_Open_Csv;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel_Provider_Count;
    private javax.swing.JLabel jLabel_Provider_Name;
    private javax.swing.JLabel jLabel_Provider_Name_Id;
    private javax.swing.JLabel jLabel_Provider_Search;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Provider;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField_Part_CsvFilePath;
    private javax.swing.JTextField jTextField_Provider_Id;
    private javax.swing.JTextField jTextField_Provider_Name;
    private javax.swing.JTextField jTextField_Provider_Search;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {


        jLabel_Provider_Count.setText(providers.size()+" "+Constants.Labels.RROVIDERS);
        jLabel_Provider_Name_Id.setText(Constants.Labels.PART_ID);
        jLabel_Provider_Name.setText(Constants.Labels.NAME);
        

        jLabel_Provider_Search.setText(Constants.Labels.SEARCH);
        jButton_Add.setText(Constants.Labels.ADD_BTN);
        jButton_Remove.setText(Constants.Labels.REMOVE_BTN);
        jButton_Update.setText(Constants.Labels.UPDATE_BTN);
        jButton_Refresh.setText(Constants.Labels.REFRESH_BTN);
        bindingPartTable();
        
        jTable_Provider.getTableHeader().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int col = jTable_Provider.columnAtPoint(e.getPoint());
            String name = jTable_Provider.getColumnName(col);
            
            System.out.println("Column index selected " + col + " " + name);
            //UIManager.getIcon("Table.ascendingSortIcon")
            if(col == 0){
            ProvidersPredicates.sortProvidersById(providers);
            jTable_Provider.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer( new IconHeaderRenderer());
            jTable_Provider.getColumnModel().getColumn(0).setHeaderValue(new TextAndIcon(name, UIManager.getIcon("Table.ascendingSortIcon")));
            }
            else {ProvidersPredicates.sortProvidersByName(providers);
            jTable_Provider.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer( new IconHeaderRenderer());
            jTable_Provider.getColumnModel().getColumn(1).setHeaderValue(new TextAndIcon(name, UIManager.getIcon("Table.ascendingSortIcon")));
            }
        }
       
        });
         bindingPartTable();
        
    }

    public Provider getProvider() {
        return provider;
    }

    public void setPart(Provider provider) {
        this.provider = provider;
    }

    public JButton getRemoveBtn() {
        return jButton_Remove;
    }

    public JButton getAddBtn() {
        return jButton_Add;
    }

    public JButton getUpdateBtn() {
        return jButton_Update;
    }

    public JButton getInvoicingBtn() {
        return jButton_Invoicing;
    }

    public JButton getImportBtn() {
        return jButton_Part_Import;
    }

    public JTextField getSearchJTF() {

        return jTextField_Provider_Search;
    }

    public void removeProvider() {


        getProviderFromSelectedTableRow();
        int indexInAllProviders = allProviders.indexOf(findProviderById(providers,provider.getId()));
        int indexInProviders= providers.indexOf(findProviderById(providers,provider.getId()));
        allProviders.remove(indexInAllProviders);
        providers.remove(indexInProviders);
          bindingPartTable();
          resetInterface();
        
    }

    public void addProvider(Long key) {
        jTextField_Provider_Id.setText(key.toString());
        setProviderFromForm();
        providers.add(provider);
        allProviders.add(provider);
        bindingPartTable();

        resetInterface();
    }

    public void updatePart() {
        int row = jTable_Provider.getSelectedRow();
        int rowt = jTable_Provider.getRowSorter().convertRowIndexToModel(row);
        getProviderFromSelectedTableRow();
        int indexInAllParts = allProviders.indexOf(findProviderById(providers,provider.getId()));
        bindingPartTable();
        jTable_Provider.setRowSelectionInterval(rowt,rowt);
        getProviderFromSelectedTableRow();
        int indexInProviders = providers.indexOf(findProviderById(providers,provider.getId()));
        allProviders.set(indexInAllParts, provider);
        providers.set(indexInProviders, provider);
    }

    public void getPartsToInvoice() {

    }

    private void bindingPartTable() {
        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${providers}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable_Provider);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName(Constants.Labels.PROVIDER_ID);
        columnBinding.setColumnClass(Long.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName(Constants.Labels.NAME);
        columnBinding.setColumnClass(String.class);
       
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        TableColumnModel cm = jTable_Provider.getColumnModel();
        cm.getColumn(0).setPreferredWidth(25);
        cm.getColumn(1).setPreferredWidth(50);
   
       // cm.getColumn(1).setCellRenderer(new StockCellRender());
    
         
         
        TableModel model = jTable_Provider.getModel();
        sorter = new TableRowSorter<>(model);
        
//        sorter.addRowSorterListener((RowSorterEvent evt) -> {
//            providers = removingDuplicatesAndSortProviderstList(providers);
//            
//           // bindingPartTable();
//            System.out.println(LocalDateTime.now());
//
//        });


        sorter.setSortable(0, false);
        sorter.setSortable(1, false);
        jTable_Provider.setRowSorter(sorter);

    }

    private void resetInterface() {

        searchInterface();

        jTextField_Provider_Search.setText("");
        displayPartsCount();
        jButton_Add.setVisible(true);
        jButton_Cancel.setVisible(true);
        jButton_Remove.setVisible(false);
        jButton_Update.setVisible(false);
    }

    public void displayPartsCount() {
        if(providers.size()>0)
            if(providers.size() == 1)
            jLabel_Provider_Count.setText(Constants.Labels.ONE_PART);
        else{jLabel_Provider_Count.setText("");}
    }

    private void searchInterface() {
        jTable_Provider.clearSelection();
        jTextField_Provider_Id.setText("");
        jTextField_Provider_Name.setText("");

        
        jButton_Add.setVisible(true);
        jButton_Remove.setVisible(false);
        jButton_Update.setVisible(false);
        jButton_Cancel.setVisible(true);
        jButton_Cancel.setText(Constants.Labels.CANCEL_BTN);

    }

    private void updateInterface() {

        jButton_Add.setVisible(false);
        jButton_Remove.setVisible(true);
        jButton_Update.setVisible(true);
        jButton_Cancel.setVisible(true);
        jButton_Cancel.setText(Constants.Labels.CREATE);
    }

    private void setProviderFromForm() {
       
        provider.setId(new Long(jTextField_Provider_Id.getText()));
        provider.setName(jTextField_Provider_Name.getText().toUpperCase());
    }

    public String getCsvFile() {
        return csvFile;
    }

    public void setCsvFile(String csvFile) {
        this.csvFile = csvFile;
    }

    private Provider getProviderFromSelectedTableRow() {
        provider = new Provider();
        int row = jTable_Provider.getSelectedRow();
        int rowt = jTable_Provider.getRowSorter().convertRowIndexToModel(row);
        Long id = (Long) (jTable_Provider.getModel().getValueAt(rowt, 0));
        provider.setId(id);
        String name = (String) (jTable_Provider.getModel().getValueAt(rowt, 1));
        provider.setName(name);


        return provider;
    }

    private void search() {

        String s = jTextField_Provider_Search.getText().toUpperCase();
        if (jTable_Provider.getRowCount() != 0 && !"".equals(s)) {
          
            List<Provider> filter = ProvidersPredicates.filterProviders(allProviders, ProvidersPredicates.nameContains(s));
            providers.clear();
            boolean addAll = providers.addAll (filter);
            
            
            updateInterface();
            bindingPartTable();
            if(providers.size()>0){
            jTable_Provider.setRowSelectionInterval(0, 0);
            jTable_Provider.setSelectionBackground(Color.blue);
            jTable_Provider.setSelectionForeground(Color.red);
            getProviderFromSelectedTableRow();
            }
            else{
            searchInterface();
            bindingPartTable();
            }

        } else {
            
            searchInterface();
            providers.clear();
            providers.addAll(allProviders);
            bindingPartTable();
  
        }
        displayPartsCount() ;
    }

    public static List<Provider> removingDuplicatesAndSortProviderstList(List<Provider> ListeAvecDoublons) {
        Set set = new HashSet();
        set.addAll(ListeAvecDoublons);
        List<Provider> res = new ArrayList(set);
        Collections.sort(res, (Provider p2, Provider p1) -> p2.getId().compareTo(p1.getId()));
        return res;
    }
    
   public Provider findProviderById(List <Provider> providersList , Long id){
       Provider  result = null;
    Optional<Provider> providerOptional = providersList.stream().filter((t) -> {
           return t.getId().equals(id)     ;
            }).findAny();
    if(providerOptional.isPresent())
          result = providerOptional.get();

    return result;
   }

    
    public Provider findProviderByName (List <Provider> providersList , String name){
       Provider  result = null;
    Optional<Provider> providerOptional = providersList.stream().filter((p) -> {
           return p.getName().equals(name)     ;
            }).findAny();
    if(providerOptional.isPresent())
          result = providerOptional.get();

    return result;
   }
   
   public JButton getRefreshBtn(){
    
    return jButton_Refresh;
    }
   
   public void loadParts(){
   allProviders = providers;
   prepareForm();
   }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    public List<Provider> getProviders() {
        return providers;
    }

    public void setAllProviders(List<Provider> allProviders) {
        this.allProviders = allProviders;
    }
}
