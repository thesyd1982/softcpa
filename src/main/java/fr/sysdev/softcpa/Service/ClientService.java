/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.entity.Client;
import fr.sysdev.softcpa.Repository.ClientRepository;
import java.util.ArrayList;


import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sysdev
 */
@Slf4j
@Service
public class ClientService implements IClientService {
    @Autowired
    private final ClientRepository clientRepository ;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        System.out.println("Client Service ");
        this.clientRepository = clientRepository;
    }

 
    
      
    @Override
    public List<Client> getClients() {
         log.debug("I'm in the service");
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().iterator().forEachRemaining(clients::add);
        log.debug(clients.toString());
        return clients;
    }

    @Override
    public Client getClientById(long clientId) {
        return clientRepository.findById(clientId).get();
    }

    @Override
    public boolean addClient(Client client) {
        log.debug("addClient  ------------------------name :"+client.toString());
        List<Client> list = clientRepository.findByNameAndSurname(client.getName(), client.getSurname()); 	
                if (false) {
    	           return false;
                } else {
                    
    	        clientRepository.save(client);
    	        return true;
                }
    }
    @Override
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long clientId) {
        
        clientRepository.delete(getClientById(clientId));
    }

    

   

    
    
}
