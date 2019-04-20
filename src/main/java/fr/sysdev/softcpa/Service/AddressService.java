/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;


import fr.sysdev.softcpa.Repository.AddressRepository;
import fr.sysdev.softcpa.entity.Address;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author f
 */
@Slf4j
@Service
public class AddressService implements IAdrressService{
@Autowired
    private AddressRepository addressRepository ;
@Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
        log.debug("Addresse Service --> started -->");
    }





    @Override
    public List<Address> getAdrress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(long addressId) {
        return addressRepository.findById(addressId).get();
    }

    @Override
    public boolean addAddress(Address address) {
    Optional<Address> a = addressRepository.findById(address.getIdAddress()); 	
                if (!a.isPresent()) {
                    addressRepository.save(address);
                    return true;
                } else {
                    return false;
                }
    }

    @Override
    public void updateAddress(Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAddress(Long addressId) {
         Optional<Address> a = addressRepository.findById(addressId); 	
                if (!a.isPresent()) {
                    addressRepository.deleteById(addressId);
                }
    }
    
}
