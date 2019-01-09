/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Part;
import java.util.List;

/**
 *
 * @author sysdev
 */
public interface IPartService {
    List<Part> getParts();
   
     Part getPartById(Long clientId);
     
     Part addPart(Part part);
     
     Part updatePart(Part part);
     
     void deletePart(Part part);
     
     void addParts(List<Part> parts);
     
    List<Part> findByReference(String ref);
     
    List<Part> findByEanCode(String eanCode);
      
    List<Part> findByBrand(String brand);
       
    List<Part> findByDesignation(String designation);
     Long key();
    
}
