/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller;


import fr.sysdev.softcpa.View.ClientView;
import fr.sysdev.softcpa.View.PieceView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author COPCGRE
 */
@Controller

public class DefaultController {

    private  ClientController clientController;
    private final PieceController pieceController;
    private final DevisController devisController;
    private final AvoirController avoirController;
    private final FactureController factureController;
    
  
    
    
   
    public DefaultController() {
        clientController = new ClientController();
        pieceController = new PieceController();
        devisController = new DevisController();
        avoirController = new AvoirController();
        factureController = new FactureController();
        
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
