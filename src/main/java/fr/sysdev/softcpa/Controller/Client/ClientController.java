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
    private final ClientView view ;

    @PostConstruct
    private void prepareListeners() {
        
        registerAction(view.getRemoveBtn(), (e) -> removeClient());
        registerAction(view.getAddBtn(), (e) -> addClient());
    }
    
    
    public ClientController(IClientService iClientService,IAdrressService iAdrressService) {
        this.iAdrressService =iAdrressService ;
        this.iClientService = iClientService;
        this.view = new ClientView(iClientService.getClients());
        prepareListeners();
    }

    public void removeClient(){
        //this.iAdrressService.deleteAddress(this.getView().client.getAddress().getIdAddress());
        this.iClientService.deleteClient(this.getView().getClient().getId());
    }
    
    public void addClient(){    
        Client c = this.getView().getClient();
        
        
        boolean saved = this.iClientService.addClient(c); 
         log.debug("-----------------------------------------\n");
        iClientService.getClients().forEach(client -> log.debug(client.toString()));
        log.debug("-----------------------------------------\n");
        if(saved)log.debug("Client sauvgardé");
        else log.debug("Client n'a pas été sauvgardé");
        
    }
    
    
    public ClientView getView() {
        return view;
    }

    
    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }
   
    
}
