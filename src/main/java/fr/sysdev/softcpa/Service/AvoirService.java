/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.Model.Avoir;
import java.util.List;


/**
 *
 * @author sysdev
 */

public interface AvoirService {
    
    public void  registerAvoir(Avoir avoir);
    public Avoir createAvoir();
    public void updateAvoir(Avoir avoir);
    public void deleteAvoir(Avoir avoir);
    public  List<Avoir> listAvoir();
}
