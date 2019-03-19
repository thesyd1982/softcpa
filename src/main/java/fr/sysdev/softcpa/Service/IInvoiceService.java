/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Invoice;
import fr.sysdev.softcpa.entity.InvoiceLine;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author sysdev
 */
public interface IInvoiceService {
     List<Invoice> getInvoices();
   
     Invoice getInvoiceById(Long invoiceId);
     
     Invoice addInvoice(Invoice invoice);
     
     Invoice updateInvoice(Invoice invoice);
     
     void deleteInvoice(Invoice invoice);
     
     void addInvoices(List<Invoice> invoices);
     
     InvoiceLine addInvoiceLine(Invoice invoice ,InvoiceLine InvoiceLine);
     
     InvoiceLine deleteInvoiceLine(Invoice invoice ,InvoiceLine InvoiceLine);
    
     Long key();
     
    public void addInvoicesObserver(Observer obsrvr);
    
    public void removeInvoicesObserver(Observer obsrvr);
     
}
