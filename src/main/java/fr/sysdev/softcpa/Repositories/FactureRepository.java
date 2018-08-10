/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Repositories;


import fr.sysdev.softcpa.Models.Facture;
import java.util.List;

/**
 *
 * @author COPCGRE
 */
public interface FactureRepository  {
   public void save(Facture facture);
   public Facture getById(int id);
   public List<Facture> list();
}
