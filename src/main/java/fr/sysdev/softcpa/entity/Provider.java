/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.entity;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author f
 */
@Entity
@Table(name = "provider")
public class Provider implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider")
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provider", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Part> parts;

    @Override
    public String toString() {
        return "Provider{" + "id=" + id + ", name=" + name + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    public void removePart(Part part) {

        Iterator<Part> iterator = parts.iterator();

        while (iterator.hasNext()) {
            if (Objects.equals((iterator.next()).getId(), part.getId())) {
                iterator.remove();
            }
        }

    }
    
    public void removeAllParts(){
    Iterator<Part> iterator = parts.iterator();

        while (iterator.hasNext()) {
            
                iterator.remove();
            
        }
    
    }  
}
