/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Invoicing;

import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.Service.IInvoiceService;
import fr.sysdev.softcpa.Service.IPartService;
import fr.sysdev.softcpa.View.Invoicing.InvoicingView;
import fr.sysdev.softcpa.entity.Invoice;
import java.awt.event.ActionListener;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sysdev
 */
@Controller
public class InvoicingController {
    @Autowired
    private final IClientService iClientService;
    @Autowired
    private final IPartService iPartService;
    @Autowired
    private final IInvoiceService invoiceService;
    @Autowired
    private final InvoicingView view;
    
    
   @PostConstruct
    private void prepareListeners() {
        
        registerAction(view.getRefreshBtn(), (e) -> loadingClients());
        registerAction(view.getValidateBtn(), (e) -> chooseAction());
    }
    

    public InvoicingController(IClientService iClientService,IPartService iPartService, IInvoiceService invoiceService) {
         this.iClientService = iClientService;
         this.iPartService = iPartService;
         this.invoiceService =invoiceService;
         this.view = new InvoicingView(iClientService.getClients(), iPartService.getParts()); 
         prepareListeners() ;
    }

    public InvoicingView getView() {
        return view;
    }

    public void loadingClients(){
    this.view.setClients(iClientService.getClients());
    this.view.loadClients() ;
    }
 
    
    
    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    public void loadingParts() {
        System.out.println("Invoicing loadingParts()");
        this.view.setParts(iPartService.getParts());
        this.view.loadParts() ;
    }
    
    public void addInvoice(){    

        this.getView().addInvoice(this.invoiceService.key());
        Invoice invoice = this.getView().getInvoice();
        JOptionPane.showMessageDialog(null, invoice);
        this.invoiceService.addInvoice(invoice);    
    }

    private void chooseAction() {
        this.getView().actionChooser();
        int choice = this.getView().getChoice();
        
        switch(choice){
            case 0:{
                addInvoice();
                this.getView().displayInvoice();
            break;
            }
            default: {;}
        }
    }
    
    
}
