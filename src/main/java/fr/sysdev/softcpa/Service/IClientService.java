/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.entity.Client;
import java.util.List;

/**
 *
 * @author sysdev
 */
public interface IClientService {
    
   List<Client> getClients();
   
     Client getClientById(long clientId);
     
     boolean addClient(Client client);
     
     void updateClient(Client client);
     
     void deleteClient(Long clientId);
}
