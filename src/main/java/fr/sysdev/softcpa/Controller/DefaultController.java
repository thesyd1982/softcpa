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
import fr.sysdev.softcpa.Controller.Invoice.InvoiceController;
import fr.sysdev.softcpa.Controller.Provider.ProviderController;

import fr.sysdev.softcpa.Service.ClientService;
import fr.sysdev.softcpa.Service.IAdrressService;
import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.Service.IInvoiceService;
import fr.sysdev.softcpa.Service.IPartService;
import fr.sysdev.softcpa.Service.IProviderService;
import fr.sysdev.softcpa.Service.InvoiceService;
import fr.sysdev.softcpa.Service.PartService;
import fr.sysdev.softcpa.Service.ProviderService;
import fr.sysdev.softcpa.View.DefaultView;

import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;

import java.util.Observable;
import java.util.Observer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author COPCGRE
 */
@Controller

public class DefaultController implements Observer {
    @Autowired
    private  DefaultView defaultView;
    
    private final ClientController clientController;
    private final PartController partController; 
    private final ProviderController providerController;
    private final InvoiceController invoiceController;
    private final DevisController devisController;
    private final AvoirController avoirController;
    private final InvoicingController invoicingController;

    private final IAdrressService iAdrressService;
    private final IClientService iClientService;
    private final IPartService iPartService;
    private final IProviderService iProviderService;
    private final IInvoiceService invoiceService;

     @PostConstruct
    private void prepareListeners() {
        
        registerAction(defaultView.getClientsBtn(), (e) -> managingClients());
        registerAction(defaultView.getStockBtn(), (e) -> managingStock());
        registerAction(defaultView.getProvidersBtn(), (e) -> managingProviders());
        registerAction(defaultView.getInvoicingBtn(), (e) -> invoicing());
        registerAction(defaultView.getInvoicesBtn(), (e) -> managingInvoices());
        loadingSalesRevenues();
    }
    
    
    
    public DefaultController(IClientService iClientService,
            IAdrressService iAdrressService,
            IPartService iPartService,
            IProviderService iProviderService,
            IInvoiceService invoiceService) {
        this.iAdrressService = iAdrressService;
        this.iClientService = iClientService;
        this.iClientService.addClientsObserver(this);
        this.iProviderService = iProviderService;
        this.iProviderService.addProvidersObserver(this);
        this.iPartService = iPartService;
        this.iPartService.addPartsObserver(this);
        this.invoiceService = invoiceService;
        this.invoiceService.addInvoicesObserver(this);

        this.clientController = new ClientController(this.iClientService, this.iAdrressService);
        this.partController = new PartController(this.iPartService, this.iProviderService);

        this.providerController = new ProviderController(this.iProviderService);
        this.devisController = new DevisController();
        this.avoirController = new AvoirController();
        this.invoicingController = new InvoicingController(this.iClientService, this.iPartService , this.invoiceService);

        this.invoiceController = new InvoiceController(this.invoiceService);
        
        System.out.println("DefaultController");
       
        
    }

    
    public void managingClients() {
        System.out.println("managingClients");
        addJInternalFrame(clientController.getView());
    }

    public void managingStock() {
         System.out.println("managingStock");
         addJInternalFrame(partController.getView());
    }
    
     public void managingProviders() {
        System.out.println("managingProviders");
        addJInternalFrame(providerController.getView());
    }

    public void invoicing() {
        System.out.println("invoicing");
        addJInternalFrame(invoicingController.getView());      
    }

    public void managingInvoices() {
        System.out.println("managingInvoices");
        addJInternalFrame(invoiceController.getView());    
    }

    public void gestionDevis() {
        System.out.println("gestionDevis");
    }

    public void gestionAvoirs() {
        System.out.println("gestionAvoirs");
    }


    
    
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof ProviderService) {
            providerController.loadingProviders();
            partController.loadingProviders();
            partController.loadingParts();
            invoicingController.loadingParts();

        }

        if (o instanceof ClientService) {
            clientController.loadingClients();
            invoicingController.loadingClients();
        }

        if (o instanceof PartService) {
            partController.loadingParts();
            invoicingController.loadingParts();
        }
        
        if (o instanceof InvoiceService) {
            invoiceController.loadingInvoices();
            this.loadingSalesRevenues();
        }
        
        
    }
    
    public void addJInternalFrame(JInternalFrame view) {
        try {
            defaultView.addFrame(view);
        } catch (PropertyVetoException e) {
        }
    }
    
    
    private void loadingSalesRevenues() {
        Double salesRevenues = invoiceService.salesRevenues();
        defaultView.setSalesRevenues(salesRevenues);
        defaultView.displaySalesRevenues();
        
    }

    
    
    protected void registerAction(JButton button, ActionListener listener) {
    button.addActionListener(listener);
}
}  
