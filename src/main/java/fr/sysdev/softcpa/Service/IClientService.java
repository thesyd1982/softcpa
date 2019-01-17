/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;



import fr.sysdev.softcpa.entity.Client;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author sysdev
 */
public interface IClientService {
    
   List<Client> getClients();
   
     Client getClientById(long clientId);
     
     Client addClient(Client client);
     
     Client updateClient(Client client);
     
     void deleteClient(Client client);
     
     Client getLastClient();
     
     Long key();

    public void addClientsObserver(Observer obsrvr);
     
    public void removeClientsObserver(Observer obsrvr);
     
  
}
