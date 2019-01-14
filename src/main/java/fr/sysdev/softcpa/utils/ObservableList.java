/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author f
 */
public class ObservableList<T> extends Observable {
  
    protected List <T> list; 

    public ObservableList() {
        this.list = new ArrayList<>();
    }
    
    public void add(T t){
        this.list.add(t);
        setChanged();
        notifyObservers();
    }
    
    public void remove(T t){
        this.list.remove(t);
        setChanged();
        notifyObservers();
    }

    public List<T> getList() {
        
        return list;
        
    }

    public void setList(List<T> list) {
        this.list = list;
        setChanged();
        notifyObservers();
    }
    
    
    

}
