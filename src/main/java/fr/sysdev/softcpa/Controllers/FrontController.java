/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controllers;


import fr.sysdev.softcpa.Views.AccueilView;
import org.springframework.stereotype.Controller;


/**
 *
 * @author sysdev
 */
@Controller
public class FrontController {
    
    private AccueilView view ;

    public FrontController() {
        
    }
    
    public void start(){    
      view = new AccueilView();
      view.setVisible(true);
    }
    
    public void gestionStock(){    
        PieceController pc = new PieceController();
        //pc.start();
    }
    
    public void gestionClient(){    
       ClientController clientController = new ClientController();
      // clientController.start();
        view.addFrameTest();
    }

    public AccueilView getView() {
        return view;
    }

    public void setView(AccueilView view) {
        this.view = view;
    }
    
    
}
