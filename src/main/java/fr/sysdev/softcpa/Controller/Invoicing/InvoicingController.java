/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Invoicing;

import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.Service.IPartService;
import fr.sysdev.softcpa.View.Invoicing.InvoicingView;
import java.awt.event.ActionListener;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
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
    private final InvoicingView view;
    
    
   @PostConstruct
    private void prepareListeners() {
        
        registerAction(view.getRefreshBtn(), (e) -> loadingClients());

    }
    

    public InvoicingController(IClientService iClientService,IPartService iPartService) {
         this.iClientService =iClientService;
         this.iPartService = iPartService;
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
}
