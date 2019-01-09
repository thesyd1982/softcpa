/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Repository;

import fr.sysdev.softcpa.entity.Part;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author f
 */
@Repository
public interface IPartRepository extends CrudRepository <Part,Long>  {
    
   /// List<Part>findByNameAndSurname(String name, String surname);
//    	@Query ("Select max(c.id) from Client c")Long key();      
}