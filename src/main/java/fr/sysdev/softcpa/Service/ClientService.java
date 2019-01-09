/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.entity.Client;
import fr.sysdev.softcpa.Repository.IClientRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;


import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sysdev
 */
@Slf4j
@Service
public class ClientService implements IClientService {
    @Autowired
    private final IClientRepository clientRepository ;
    @Autowired
    public ClientService(IClientRepository clientRepository) {
        System.out.println("Client Service ");
        this.clientRepository = clientRepository;
    }

    
    
      
    @Override
    public List<Client> getClients() {

        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().iterator().forEachRemaining(clients::add);
        log.debug(clients.toString());
        return clients;
    }

    @Override
    @Transactional
    public Client getClientById(long clientId) {
        return clientRepository.findById(clientId).get();
    }

    @Override
    @Transactional
    public boolean addClient(Client client) {

                if (false) {
    	           return false;
                } else {  
    	        clientRepository.save(client);
    	        return true;
                }
    }
    @Override
    @Transactional
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClient(Client client) {
        
        clientRepository.delete(client);
    }

    @Override
    public Client getLastClient() {
        
         List<Client> clients = getClients();
        
         return clients.get(clients.size()-1);
    }

    @Override
    public Long key() {
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        int id = -1;
        try{
            System.out.println("Connecting to DataBase");
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement smt = conn.createStatement() ;
            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'client' AND table_schema = DATABASE()") ;
           
            if(resultSet.next()){
             id = resultSet.getInt("id") ;
            }
            System.out.println(""+ id);
            System.out.println("Connected!!!");
        
     
      
        
        } catch (SQLException ex) {
           
        }
        
        return (long)id ;
    }

    
}
