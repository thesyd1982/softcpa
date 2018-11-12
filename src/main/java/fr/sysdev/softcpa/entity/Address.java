/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;
import java.io.Serializable;
import javax.persistence.*;



 
/**
 *
 * @author thesyd
 */

@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    
    private Long  idAddress;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "flat_number")
    private String flatNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postCode;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    @Override
    public String toString() {
        return houseNumber + ", " +street + " " +
                
                //flatNumber + " " +
                city + " " + 
                "("+postCode +")";
    }
   
}