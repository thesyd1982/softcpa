/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Repository;

import fr.sysdev.softcpa.entity.Client;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author f
 */

@Repository
public interface IClientRepository extends CrudRepository <Client,Long>  {
    List<Client>findByNameAndSurname(String name, String surname);
//    	@Query ("Select max(c.id) from Client c")Long key();

        
}
