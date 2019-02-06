/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author f
 */
@Entity
@Table(name = "part")
public class Part implements Serializable {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_part")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_provider")
    
    private Provider provider;
    private String eanCode;
    private String reference;
    private String designation;
    private String Brand;
    private Double purchasingPrice;
    private Double sellingPrice;
    private Double professionalSellingPrice;
    private int stock;

    @Override
    public String toString() {
        return "Part{" + "id=" + id + ", provider=" + provider 
                + ", eanCode=" + eanCode 
                + ", reference=" + reference
                + ", designation=" + designation 
                + ", Brand=" + Brand 
                + ", purchasingPrice="+ purchasingPrice 
                + ", sellingPrice=" + sellingPrice 
                + ", professionalSellingPrice=" + professionalSellingPrice 
                + ", stock=" + stock + '}';
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public Double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(Double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getProfessionalSellingPrice() {
        return professionalSellingPrice;
    }

    public void setProfessionalSellingPrice(Double professionalSellingPrice) {
        this.professionalSellingPrice = professionalSellingPrice;
    }

}
