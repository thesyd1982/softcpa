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

    private InvoiceDetailsView detailsView;
    private PaymentEditView paymentEditView;

    @PostConstruct
    private void prepareListeners() {

        //registerAction(view.getDetailsBtn(), (e) -> invoiceDetails());
        registerAction(view.getDetailsBtn(), (e) -> getDisplayDetailsBtn());
    }

    public InvoiceController(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
        this.view = new InvoiceView(invoiceService.getInvoices());
        detailsView = new InvoiceDetailsView();
        prepareListeners();
    }

    public InvoiceView getView() {
        return view;
    }

    public void loadingInvoices() {
        this.view.setInvoices(invoiceService.getInvoices());
        this.view.loadInvoices();
    }

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    public void invoiceDetails() {
        ArrayList<Invoice> slist = (ArrayList<Invoice>) this.view.getSelectedInvoices();

          if (slist.size() > 1) {
        slist.forEach((Invoice i)
        -> {
        try {
        detailsView = this.view.displayInvoice(invoiceService.getInvoiceById(i.getId()));
        registerAction(detailsView.getPayBtn(), (e) -> addPayment());
        } catch (PropertyVetoException ex) {
        Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
        } else {
            try {
                detailsView = this.view.displayInvoice(invoiceService.getInvoiceById(slist.get(0).getId()));
                registerAction(detailsView.getPayBtn(), (e) -> addPayment());
            } catch (PropertyVetoException ex) {
                Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
    }

    public void addPayment() {

        Payment payment = new Payment();
        Invoice invoice = detailsView.getInvoice();
        payment.setAmount(0.0);
        payment.setInvoice(invoice);
        payment.setDateOfPayment(LocalDate.now());
        payment.setPaymentMethod(PaymentMethodEnum.CASH);

        try {
            paymentEditView = detailsView.editPayment(payment);
            registerAction(paymentEditView.getAddBtn(), (e) -> savePayment());
        } catch (PropertyVetoException ex) {
            Logger.getLogger(InvoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void savePayment() {
        paymentEditView.addPayment();
        Payment payment = paymentEditView.getPayment();
        payment.getInvoice().getPayments().add(payment);
    }
    
    
    public JButton getDisplayDetailsBtn(){
        
    return view.getDetailsBtn();
    }

    public InvoiceDetailsView getDetailsView() {
        return detailsView;
    }

    public void setDetailsView(InvoiceDetailsView detailsView) {
        this.detailsView = detailsView;
    }

    public PaymentEditView getPaymentEditView() {
        return paymentEditView;
    }

    public void setPaymentEditView(PaymentEditView paymentEditView) {
        this.paymentEditView = paymentEditView;
    }
    
}
