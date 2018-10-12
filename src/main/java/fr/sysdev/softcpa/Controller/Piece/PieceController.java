/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Piece;


import fr.sysdev.softcpa.View.Piece.PieceView;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sysdev
 */

@Controller
public class PieceController {

    private PieceView view ;

    public PieceController() {
        view = new PieceView();
    }

    public PieceView getView() {
        return view;
    }

    public void setView(PieceView view) {
        this.view = view;
    }
    
   
}
