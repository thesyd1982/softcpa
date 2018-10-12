/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller;


import fr.sysdev.softcpa.Controller.Piece.PieceController;
import fr.sysdev.softcpa.Controller.Devis.DevisController;
import fr.sysdev.softcpa.Controller.Facture.FactureController;
import fr.sysdev.softcpa.Controller.Client.ClientController;
import fr.sysdev.softcpa.Controller.Avoir.AvoirController;
import fr.sysdev.softcpa.Service.IAdrressService;
import fr.sysdev.softcpa.Service.IClientService;
import fr.sysdev.softcpa.View.Client.ClientView;
import fr.sysdev.softcpa.View.Piece.PieceView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author COPCGRE
 */
@Controller

public class DefaultController {

    private final  ClientController clientController;
    private final PieceController pieceController;
    private final DevisController devisController;
    private final AvoirController avoirController;
    private final FactureController factureController;
    private final IAdrressService iAdrressService;
    private final IClientService iClientService;
  
    
    
   
    public DefaultController(IClientService iClientService , IAdrressService iAdrressService) {
        this.iAdrressService = iAdrressService;
        this.iClientService = iClientService;
        this.clientController = new ClientController(iClientService, iAdrressService);
        this.pieceController = new PieceController();
        this.devisController = new DevisController();
        this.avoirController = new AvoirController();
        this.factureController = new FactureController();
        
        System.out.println("DefaultController");
    }
    public ClientView gestionClients(){
        System.out.println("gestionClients");
        return clientController.getView();
        
    }
    public PieceView gestionStock(){
        
        System.out.println("gestionStock");
        return pieceController.getView();
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
