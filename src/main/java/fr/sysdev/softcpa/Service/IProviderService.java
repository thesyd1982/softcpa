/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Provider;
import fr.sysdev.softcpa.utils.ObservableList;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author f
 */
public interface IProviderService {
     
    List<Provider> getProviders();
   
     Provider getProviderById(Long providerId);
     
     Provider addProvider(Provider provider);
     
     Provider updateProvider(Provider provider);
     
     void deleteProvider(Provider provider);
    
     public Long key();

     public void addProvidersObserver( Observer obsrvr);
    
     public void removeProvidersObserver(Observer obsrvr);
   
}
