/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Invoice;

import fr.sysdev.softcpa.Service.IInvoiceService;
import fr.sysdev.softcpa.View.Invoice.InvoiceDetailsView;
import fr.sysdev.softcpa.View.Invoice.InvoiceView;
import fr.sysdev.softcpa.View.Payment.PaymentEditView;
import fr.sysdev.softcpa.entity.Invoice;
import fr.sysdev.softcpa.entity.Payment;
import fr.sysdev.softcpa.entity.PaymentMethodEnum;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author f
 */
@Controller
public class InvoiceController {

    @Autowired
    private final IInvoiceService invoiceService;
    @Autowired
    private final InvoiceView view;
    
    InvoiceDetailsView detailsView;
    PaymentEditView paymentEditView;
    
   @PostConstruct
    private void prepareListeners() {
        
        registerAction(view.getDetailsBtn(), (e) -> invoiceDetails());
       // registerAction(detailsView.getPayBtn(), (e) -> addPayment());
    } 
    

    public InvoiceController(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
        this.view = new InvoiceView(invoiceService.getInvoices()); 
        detailsView = new InvoiceDetailsView();
         prepareListeners() ;
    }

    public InvoiceView getView() {
        return view;
    }

    public void loadingInvoices(){
    this.view.setInvoices(invoiceService.getInvoices());
    this.view.loadInvoices() ;
    }
 
    
    
    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    public void invoiceDetails(){
    ArrayList<Invoice> slist =(ArrayList<Invoice>) this.view.getSelectedInvoices();
    slist.forEach((Invoice i)->
            
           {
        try {
            this.view.displayInvoice (invoiceService.getInvoiceById(i.getId()));
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }
    

     
     
  
}
