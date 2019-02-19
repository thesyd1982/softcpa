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

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice") 
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_invoice_status")
    private InvoiceStatus invoiceStatus;
    
    @JoinColumn(name = "invoceNumber")
    private String invoiceNumber;
    
    @ManyToOne
    @JoinColumn(name = "id_payment")
    private Payment payment;

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
    private long amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
  

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return client.toString();
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
