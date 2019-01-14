/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller;


import fr.sysdev.softcpa.Controller.Part.PartController;
import fr.sysdev.softcpa.Controller.Devis.DevisController;
import fr.sysdev.softcpa.Controller.Invoicing.InvoicingController;
import fr.sysdev.softcpa.Controller.Client.ClientController;
import fr.sysdev.softcpa.Controller.Avoir.AvoirController;
import fr.sysdev.softcpa.Controller.Provider.ProviderController;
import fr.sysdev.softcpa.Service.IAdrressService;
import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.Service.IPartService;
import fr.sysdev.softcpa.Service.IProviderService;
import fr.sysdev.softcpa.View.Client.ClientView;
import fr.sysdev.softcpa.View.Invoicing.InvoicingView;
import fr.sysdev.softcpa.View.Part.PartView;
import fr.sysdev.softcpa.View.Provider.ProviderView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author COPCGRE
 */
@Controller

public class DefaultController {

    private final ClientController clientController;
    private final PartController partController;
    private final ProviderController providerController;
    private final DevisController devisController;
    private final AvoirController avoirController;
    private final InvoicingController invoicingController;
    
    
    
    private final IAdrressService iAdrressService;
    private final IClientService iClientService;
    private final IPartService iPartService;
    private final IProviderService iProviderService;
    
    
   
    public DefaultController(IClientService iClientService,IAdrressService iAdrressService,IPartService iPartService, IProviderService iProviderService ) {
        this.iAdrressService = iAdrressService;
        this.iClientService =iClientService;
        this.iProviderService  =  iProviderService ;
        this.iPartService= iPartService;
        
        
        
        
        
        this.clientController = new ClientController(this.iClientService, this.iAdrressService);
        this.partController = new PartController(this.iPartService, this.iProviderService);
        this.providerController = new ProviderController(this.iProviderService);
        this.devisController = new DevisController();
        this.avoirController = new AvoirController();
        this.invoicingController = new InvoicingController(this.iClientService, this.iPartService);
        
        System.out.println("DefaultController");
    }
    public ClientView gestionClients(){
        System.out.println("gestionClients");
        return clientController.getView();
        
    }
    public PartView gestionStock(){
        
        System.out.println("gestionStock");
        return partController.getView();
    }
    
    public InvoicingView invoicing(){
        return invoicingController.getView();
    }
    
    public ProviderView managingProviders(){
        System.out.println("managingProviders");
    return providerController.getView();
    
    }
    
    
    public void gestionFactures(){
        System.out.println("gestionFactures");
    }
    public void gestionDevis(){
        System.out.println("gestionDevis");
    }
    public void gestionAvoirs(){
        System.out.println("gestionAvoirs");
    }
    

    
}