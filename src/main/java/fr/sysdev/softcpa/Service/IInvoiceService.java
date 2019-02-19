/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Invoice;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author sysdev
 */
public interface IInvoiceService {
    List<Invoice> getInvoices();
   
     Invoice getInvoiceById(Long clientId);
     
     Invoice addInvoice(Invoice Invoice);
     
     Invoice updateInvoice(Invoice Invoice);
     
     void deleteInvoice(Invoice Invoice);
     
     void addInvoices(List<Invoice> Invoices);
    
     Long key();
     
    public void addInvoicesObserver(Observer obsrvr);
    
    public void removeInvoicesObserver(Observer obsrvr);
     
}
