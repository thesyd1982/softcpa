/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Repository;

import fr.sysdev.softcpa.entity.Provider;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author f
 */
public interface IProviderRepository  extends CrudRepository <Provider,Long>  {
   /// List<Part>findByNameAndSurname(String name, String surname);
//    	@Query ("Select max(c.id) from Client c")Long key();      
}