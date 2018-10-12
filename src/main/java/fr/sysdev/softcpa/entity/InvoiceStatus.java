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
 * @author f
 */

@Entity
@Table(name = "Invoice_status")
public class InvoiceStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice_status")
    private long id;

    @Column(name = "invoice_status")
    private String invoiceStatus;

    public long getId() {
        return id;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return invoiceStatus;
    }
}