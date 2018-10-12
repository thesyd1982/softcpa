/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Address;
import java.util.List;

/**
 *
 * @author f
 */
public interface IAdrressService {
     List<Address> getAdrress();
   
     Address getAddressById(long addressId);
     
     boolean addAddress(Address address);
     
     void updateAddress(Address address);
     
     void deleteAddress(Long addressId);
}
