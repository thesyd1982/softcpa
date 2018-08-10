/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Services;


import fr.sysdev.softcpa.Models.Avoir;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author sysdev
 */
@Service
public class AvoirServiceImpl implements AvoirService {
    private String message ="";
    
    private List<Avoir> avoirs = null;
    
    public void  registerAvoir(Avoir avoir){
        boolean add = avoirs.add(avoir);
        message =(add)?"avoir enregistré":"l'avoir n'a pas été enregistré";
        
    }
    
    public Avoir createAvoir(){
        Avoir avoir = new Avoir();
         message =(null!= avoir)?"nouvel avoir crée":"l'avoir n'a pas été crée";
        return avoir;
    }
    
    public void updateAvoir(Avoir avoir){
        // à changer
    message =(null!=avoir)?"avoir enregistré":"l'avoir n'a pas été enregistré";
    }
    public void deleteAvoir(Avoir avoir){
        boolean remove = avoirs.remove(avoir);
        message =(remove)?"avoir supprimé":"l'avoir n'a pas été supprimé";
    }
    public  List<Avoir> listAvoir(){
        return avoirs;
                }
}
