/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.Repository.IProviderRepository;
import fr.sysdev.softcpa.entity.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author f
 */
@Service
public class ProviderService extends Observable implements IProviderService{
    @Autowired
    private final IProviderRepository providerRepository;

    public ProviderService(IProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }
    

    @Override
    public List<Provider> getProviders() {
        return (List<Provider>) this.providerRepository.findAll();
    }

    @Override
    public Provider getProviderById(Long providerId) {
       Optional<Provider> partOptional = providerRepository.findById(providerId);

        if (!partOptional.isPresent()) {
            throw new NullPointerException("Part Not Found. For ID value: "+providerId.toString() );
        }
        return partOptional.get();
    }

    @Override
    public Provider addProvider(Provider provider) {
        provider = providerRepository.save(provider);
        this.setChanged();
        this.notifyObservers();
        return provider;
    }

    @Override
    public Provider updateProvider(Provider provider) {
          provider = providerRepository.save(provider);
          this.setChanged();
          this.notifyObservers();
          return  provider;
    }

    @Override
    public void deleteProvider(Provider provider) {
      providerRepository.delete(provider);
      this.setChanged();
      this.notifyObservers();
    }
    
    @Override
    public Long key() {
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        int id = -1;
        try{
            
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement smt = conn.createStatement() ;
            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'provider' AND table_schema = DATABASE()") ;
           
            if(resultSet.next()){
             id = resultSet.getInt("id") ;
            }
            System.out.println("AUTO_INCREMENT PART"+ id);
        
        } catch (SQLException ex) {
           
        }
        
        return (long)id ;
    }
    
    @Override
    public void addProvidersObserver( Observer obsrvr){
    
    this.addObserver(obsrvr);
    }
    
    
    @Override
    public void removeProvidersObserver(Observer obsrvr){
    this.deleteObserver(obsrvr);
    }
    
}
