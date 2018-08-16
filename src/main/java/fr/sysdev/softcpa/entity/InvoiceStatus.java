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
@Table(name = "reservation_status")
public class InvoiceStatus implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_reservation_status")
    private long id;

    @Column(name = "reservation_status")
    private String reservationStatus;

    public long getId() {
        return id;
    }

    public String getInvoiceStatus() {
        return reservationStatus;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setInvoiceStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return reservationStatus;
    }
}