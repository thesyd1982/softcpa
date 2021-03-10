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
import java.time.LocalDate;
import javax.persistence.*;
import java.util.List; 
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice") 
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 18)
    private InvoiceStatusEnum invoiceStatus;
    
    @JoinColumn(name = "invoceNumber")
    private String invoiceNumber;
    
    
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice",  orphanRemoval = true)
    private List <Payment> payments;

    @OneToOne
    @JoinColumn(name = "id_client")
    private Client client;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice", fetch = FetchType.EAGER, orphanRemoval = true)
    private List <InvoiceLine> invocesLines;
    
    @Column(name = "platenumber") 
    private String platenumber;
    
    @Column(name = "vehicleType") 
    private String vehicleType;
    
    @Column(name = "invoice_date")
    private LocalDate invoiceDate;

    @Column(name = "amount")
    private Double amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment>  payments) {
        this.payments = payments;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceStatusEnum getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatusEnum invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
  

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        
        String s ="";
               s+="Invoice{" + "id=" + id ;
               s+= ", invoiceStatus=" + invoiceStatus ;
               s+=  ", invoiceNumber=" + invoiceNumber ;
               //s+=  ", payments=" + payments ;
               s+=  ", client=" + client ;
               s+=  ", invocesLines=" + invocesLines ;
               s+=  ", platenumber=" + platenumber ;
               s+=  ", vehicleType=" + vehicleType ;
               s+=  ", invoiceDate=" + invoiceDate ;
               s+=  ", amount=" + amount + '}';
        return s;
        
    }

    

    public List <InvoiceLine> getInvocesLines() {
        return invocesLines;
    }

    public void setInvocesLines(List <InvoiceLine> invocesLines) {
        this.invocesLines = invocesLines;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }



    
}
