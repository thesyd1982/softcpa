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

import fr.sysdev.softcpa.View.Client.ClientView;
import fr.sysdev.softcpa.View.Invoice.InvoiceView;
import fr.sysdev.softcpa.View.Invoicing.InvoicingView;
import fr.sysdev.softcpa.View.Part.PartView;
import fr.sysdev.softcpa.View.Provider.ProviderView;

import java.util.Observable;
import java.util.Observer;
import org.springframework.stereotype.Controller;

/**
 *
 * @author COPCGRE
 */
@Controller

public class DefaultController implements Observer {

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

    public ClientView gestionClients() {
        System.out.println("gestionClients");
        return clientController.getView();

    }

    public PartView gestionStock() {

        System.out.println("gestionStock");
        return partController.getView();
    }

    public InvoicingView invoicing() {
        System.out.println("invoicing");
        return invoicingController.getView();
    }

    public ProviderView managingProviders() {
        System.out.println("managingProviders");
        return providerController.getView();

    }

    public InvoiceView managingInvoices() {
        System.out.println("managingInvoices");
        return invoiceController.getView();
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

    private void loadingSalesRevenues() {
        Double salesRevenues = invoiceService.salesRevenues();
        System.out.println("salesRevenues "+salesRevenues+" €");
    }

}
