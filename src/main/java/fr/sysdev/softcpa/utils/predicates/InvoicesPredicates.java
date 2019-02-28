/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.predicates;

import fr.sysdev.softcpa.entity.Invoice;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author f
 */
public class InvoicesPredicates {
    public static List<Invoice> filterInvoices(List<Invoice> invoices, Predicate<Invoice> predicate) {
        return invoices.stream()
                .filter(predicate)
                .collect(Collectors.<Invoice>toList());
    }
    public static Predicate<Invoice> invoiceNumberContains(String s) {
        return p -> p.getInvoiceNumber().toUpperCase().contains(s.toUpperCase());
    }
    
    
    public static Predicate<Invoice> clientNameContains(String s) {
        return p -> p.getClient().getName().toUpperCase().contains(s.toUpperCase());
    }
    
    public static Predicate<Invoice> clientSurnameContains(String s) {
        return p -> p.getClient().getSurname().toUpperCase().contains(s.toUpperCase());
    }
    
    public static Predicate<Invoice> companyNameContains(String s) {
        return p -> p.getClient().getCompany().getName().toUpperCase().contains(s.toUpperCase());
    }
    
    public static Predicate<Invoice> companyCinContains(String s) {
        return p -> p.getClient().getCompany().getCin().toUpperCase().contains(s.toUpperCase());
    }
    
    public static Predicate<Invoice> plateNumberContains(String s) {
        return p -> p.getPlatenumber().toUpperCase().contains(s.toUpperCase());
    }
    
    public static Predicate<Invoice> vehicleTypeContains(String s) {
        return p -> p.getVehicleType().toUpperCase().contains(s.toUpperCase());
    }
    
    
     public static Predicate<Invoice> numberOrNameOrSurnameOrPlatenumberOrVehicleTypeContains(String s) {
        return p -> p.getInvoiceNumber().toUpperCase().contains(s.toUpperCase())
                || p.getClient().getName().toUpperCase().contains(s.toUpperCase())
                || p.getClient().getSurname().toUpperCase().contains(s.toUpperCase())
                || p.getPlatenumber().toUpperCase().contains(s.toUpperCase())
                || p.getVehicleType().toUpperCase().contains(s.toUpperCase());
    }
    
     public static Predicate<Invoice> oneOfAllContains(String s) {
        return p -> p.getInvoiceNumber().toUpperCase().contains(s.toUpperCase())
                    || p.getClient().getName().toUpperCase().contains(s.toUpperCase())
                    || p.getClient().getSurname().toUpperCase().contains(s.toUpperCase())
                    || p.getPlatenumber().toUpperCase().contains(s.toUpperCase())
                    || p.getAmount().toString().toUpperCase().contains(s.toUpperCase())
                    || p.getInvoiceDate().toString().toUpperCase().contains(s.toUpperCase())
                    || p.getVehicleType().toUpperCase().contains(s.toUpperCase());
    }
}
