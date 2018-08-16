/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller;


import fr.sysdev.softcpa.View.ClientView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sysdev
 */
@Controller
public class ClientController {
    
    private ClientView view ;

    public ClientController() {
        view = new ClientView();
    }
    

    public ClientView getView() {
        return view;
    }

    public void setView(ClientView view) {
        this.view = view;
    }
    

    
}
