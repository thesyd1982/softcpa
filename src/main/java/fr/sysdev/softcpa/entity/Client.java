/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;

/**
 *
 * @author f
 */
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;

    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_provider", insertable = false,updatable = false)
    private Set<Invoice>invoicies; 

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company")
    private Company company;
    
    
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "mail")
    private String email;
    
    @Column(name = "status")
    private int status;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long clientId) {
        this.id = clientId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String strClient = "{ id : "+id+" name : "+name+", surname:"+surname+", email:"+email+", phone :"+ phoneNumber+"}";
        return strClient ;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set <Invoice> getInvoices() {
        return invoicies;
    }

    public void setInvoices(Set <Invoice> invoicies) {
        this.invoicies = invoicies;
    }
    
}