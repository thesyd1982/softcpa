/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.entity.Invoice;
import java.util.List;

/**
 *
 * @author f
 */
public interface IInvoicingService {
    
    Double amount(List<Invoice>invoiceLines);
    Invoice convertCreditNote(List<Invoice>invoiceLines);
    //FormDilevry createFormDilevry(List<Invoice>invoiceLines);
    
}
