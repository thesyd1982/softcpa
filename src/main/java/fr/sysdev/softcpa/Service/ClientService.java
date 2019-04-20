/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Client;
import fr.sysdev.softcpa.Repository.IClientRepository;
import fr.sysdev.softcpa.entity.Invoice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sysdev
 */
@Slf4j
@Service
public class ClientService extends Observable implements IClientService {

    @Autowired
    private final IClientRepository clientRepository;

    @Autowired
    public ClientService(IClientRepository clientRepository) {
        
        this.clientRepository = clientRepository;
        log.debug("CLient Service --> Started ...");
    }

    @Override
    public List<Client> getClients() {

        return (List<Client>) clientRepository.findAll();
    }

    @Override
    @Transactional
    public Client getClientById(long clientId) {
        return clientRepository.findById(clientId).get();
    }

    @Override
    @Transactional
    public Client addClient(Client client) {
        Client c = clientRepository.save(client);
        this.setChanged();
        this.notifyObservers();
        return c;

    }

    @Override
    @Transactional
    public Client updateClient(Client client) {
    
        Client c = clientRepository.save(client);
        this.setChanged();
        this.notifyObservers();
        return c;
    }

    @Override
    @Transactional
    public void deleteClient(Client client) {

        clientRepository.delete(client);
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public Client getLastClient() {

        List<Client> clients = getClients();

        return clients.get(clients.size() - 1);
    }

    @Override
    public Long key() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        int id = -1;
        try {
            System.out.println("Connecting to DataBase");
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement smt = conn.createStatement();
            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'client' AND table_schema = DATABASE()");

            if (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            System.out.println("" + id);
            System.out.println("Connected!!!");

        } catch (SQLException ex) {

        }

        return (long) id;
    }

    @Override
    public void addClientsObserver(Observer obsrvr) {
       this.addObserver(obsrvr); 
    }

    @Override
    public void removeClientsObserver(Observer obsrvr) {
        this.deleteObserver(obsrvr);
    }
}
