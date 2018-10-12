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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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

    public ClientController(IClientService iClientService,IAdrressService iAdrressService) {
        log.debug("------«ClientController«---------");
        this.iAdrressService =iAdrressService ;
        this.iClientService = iClientService;
        this.view = new ClientView(iClientService.getClients());
    }

    public void removeClient(Client client){
        this.iAdrressService.deleteAddress(client.getAddress().getIdAddress());
        this.iClientService.deleteClient(client.getId());
    }
    
    public void removeClientById(){
        
        log.debug((view.client.getId()).toString()+"affiche");
           // Client clientToRemove =  this.iClientService.getClientById(clientId);
        //log.debug(clientToRemove.toString());
        //this.iAdrressService.deleteAddress(clientToRemove.getAddress().getIdAddress());
        //this.iClientService.deleteClient(clientToRemove.getId()); 
    }
    
    
    public ClientView getView() {
        return view;
    }



   
    
}
