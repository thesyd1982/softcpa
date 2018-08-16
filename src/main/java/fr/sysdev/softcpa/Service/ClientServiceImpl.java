/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.Model.Client;
import fr.sysdev.softcpa.Repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sysdev
 */
@Service
public class ClientServiceImpl implements ClientService {

      private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public void remove(Client client) {
        clientRepository.delete(client);
    }
    
    
    
    
    
    
    
    private String message = "";
    private List<Client> clients = null;

    public void registerClient(Client client) {
        boolean add = clients.add(client);
        message = (add) ? "Client enregistré!" : "Le Client n'a pas été enregistré!";
    }

    public Client createClient() {
        Client client = new Client();

        message = (client != null) ? "Client crée!" : "Le Client n'a pas été crée!";
        return client;
    }

    public void updateClient(Client client) {

    }

    public void deleteClient(Client client) {

        boolean remove = clients.remove(client);
        message = (remove) ? "Client supprimé!" : "Le Client n'a pas été supprimé!";
    }

    public List<Client> listClient() {
        return clients;
    }

}
