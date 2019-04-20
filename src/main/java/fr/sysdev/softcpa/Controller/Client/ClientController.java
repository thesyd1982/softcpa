/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Client;


import fr.sysdev.softcpa.Service.IAdrressService;
import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.View.Client.ClientView;
import fr.sysdev.softcpa.entity.Client;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.annotation.PostConstruct;


/**
 *
 * @author sysdev
 */
@Slf4j
@Controller
public class ClientController { 
    @Autowired
    private final IClientService iClientService;
    @Autowired
    private final IAdrressService iAdrressService;
    @Autowired
    private final  ClientView view ;

    @PostConstruct
    private void prepareListeners() {
        
        registerAction(view.getRemoveBtn(), (e) -> removeClient());
        registerAction(view.getAddBtn(), (e) -> addClient());
        registerAction(view.getUpdateBtn(), (e) -> updateClient());
        registerAction(view.getInvoicingBtn(), (e) -> invoicingClient());
    }
    
    
    public  ClientController(IClientService iClientService, IAdrressService iAdrressService) {
        this.iAdrressService =iAdrressService ;
        this.iClientService = iClientService;
        this.view = new ClientView(iClientService.getClients()); 
        prepareListeners();   
    }

    public void removeClient(){
       
        
        Client client = this.getView().getClient();
         Client ctd =  this.iClientService.getClientById(client.getId());
        if(ctd.getInvoices().size()>0){
        this.getView().alertClientHasInvoices();
        }
        else {
            this.getView().removeClient();
            this.iClientService.deleteClient(ctd);
        }
        
    }
    
    public void addClient(){    

        this.getView().addClient(this.iClientService.key());
        Client client = this.getView().getClient();
        this.iClientService.addClient(client); 

    }
    
    
    public ClientView getView() {
        return view;
    }

    
    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    private void updateClient() {
        
        this.getView().updateClient();
        
        Client client = this.getView().getClient();
        Client c = this.iClientService.getClientById(client.getId());
        List invoices = c.getInvoices();
        
        if(invoices.size()>0)
        client.setInvoices(invoices);
        else client.setInvoices(new ArrayList <>());
        
        this.iClientService.updateClient(client);
    }

    private void invoicingClient() {
        this.getView().getClientToInvoice();
    }

    public void loadingClients() {
        this.getView().setClients(iClientService.getClients());
        this.getView().loadClients();
    }
   
    
}
