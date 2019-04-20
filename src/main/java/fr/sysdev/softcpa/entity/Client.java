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
import java.util.List;
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Invoice> invoicies;

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

    @Enumerated(EnumType.STRING)
    @Column(length = 18)
    private ClientStatusEnum clientStatus;
    
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
        String s ="Client{";
                s+="id=" + id ;
                s+=", clientStatus=" + clientStatus ;
                s+=", name="+name ;
                s+=", surname="+ surname ;
                s+=", phoneNumber=" + phoneNumber ;
                s+=", email=" + email ;
                s+='}';
        return s;
            }
    

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Invoice> getInvoices() {

        return invoicies;
    }

    public void setInvoices(List<Invoice> invoicies) {

        this.invoicies = invoicies;
    }

    public List<Invoice> getInvoicies() {
        return invoicies;
    }

    public void setInvoicies(List<Invoice> invoicies) {
        this.invoicies = invoicies;
    }

    public ClientStatusEnum getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(ClientStatusEnum clientStatus) {
        this.clientStatus = clientStatus;
    }

}
