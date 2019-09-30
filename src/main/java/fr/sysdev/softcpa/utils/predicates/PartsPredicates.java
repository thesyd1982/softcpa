/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.predicates;

import fr.sysdev.softcpa.entity.Part;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author f
 */
public class PartsPredicates {

    public static List<Part> filterParts(List<Part> parts, Predicate<Part> predicate) {
        return parts.stream()
                .filter(predicate)
                .collect(Collectors.<Part>toList());
    }

    public static Predicate<Part> refContains(String s) {
        return p -> p.getReference().toUpperCase().contains(s.toUpperCase());
    }

    public static Predicate<Part> eanCodeContains(String s) {
        return p -> p.getEanCode().toUpperCase().contains(s.toUpperCase());
    }

    public static Predicate<Part> designantionContains(String s) {
        return p -> p.getDesignation().toUpperCase().contains(s.toUpperCase());
    }

    public static Predicate<Part> brandContains(String s) {
        return p -> p.getBrand().toUpperCase().contains(s.toUpperCase());
    }

    public static Predicate<Part> refOrEanOrDesignationOrBrandContains(String s) {
        return p -> p.getReference().toUpperCase().contains(s.toUpperCase())
                || p.getEanCode().toUpperCase().contains(s.toUpperCase())
                || p.getDesignation().toUpperCase().contains(s.toUpperCase())
                || p.getBrand().toUpperCase().contains(s.toUpperCase());
    }

    public static Predicate<Part> refEquals(String s) {
        return p -> p.getReference().toUpperCase().equals(s.toUpperCase());
    }

    
    public static Predicate<Part> eanCodeEquals(String s) {
        return p -> p.getEanCode().equals(s.toUpperCase());
    }
    
     public static Predicate<Part> refOrEanCodeEquals(String s) {
      return p ->p.getReference().toUpperCase().equals(s.toUpperCase())|| p.getEanCode().equals(s.toUpperCase());
    }
    
    
    
    
    public static void sortPartsById(List<Part> providers) {
        Comparator<Part> idComparator;
        idComparator = Comparator.comparingInt((p) -> (int) (long) p.getId());
        Collections.sort(providers, idComparator);
    }

    public static void sortReversePartsById (List<Part> parts) {
        Comparator<Part> idComparator;
        idComparator = Comparator.comparingInt((p) -> (int) (long) p.getId());
        Collections.sort(parts, Collections.reverseOrder(idComparator));
    }

    public static void sortPartsByEanCode(List<Part> parts) {
        Collections.sort(parts, (p1, p2) -> p1.getEanCode().compareTo(p2.getEanCode()));
    }

    public static void sortReversePartsByEanCode(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder((p1, p2) -> p1.getEanCode().compareTo(p2.getEanCode())));
    }

    public static void sortPartsByStock(List<Part> parts) {
        Collections.sort(parts, Comparator.comparingInt((p) -> p.getStock()));
    }

    public static void sortReversePartsByStock(List<Part> parts) {
        
        Collections.sort(parts, Collections.reverseOrder( Comparator.comparingInt((p) -> p.getStock())));
    }

    public static void sortPartsByPurPrice(List<Part> parts) {
        Collections.sort(parts, Comparator.comparingDouble((p) -> p.getPurchasingPrice()));
    }

    public static void sortReversePartsByPurPrice(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder( Comparator.comparingDouble(p-> p.getPurchasingPrice())));
    }

    public static void sortPartsByIndivPrice(List<Part> parts) {
        Collections.sort(parts, Comparator.comparingDouble((p) -> p.getSellingPrice()));
    }

    public static void sortReversePartsByIndivPrice(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder( Comparator.comparingDouble(p-> p.getSellingPrice())));
    }

    public static void sortPartsByProPrice(List<Part> parts) {
        Collections.sort(parts, Comparator.comparingDouble((p) -> p.getProfessionalSellingPrice()));
    }

    public static void sortReversePartsByProPrice(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder( Comparator.comparingDouble(p-> p.getProfessionalSellingPrice())));
    }

    public static void sortPartsByDesignation(List<Part> parts) {
       Collections.sort(parts, (p1, p2) -> p1.getDesignation().compareTo(p2.getDesignation()));
    }

    public static void sortReversePartsByDesignation(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder((p1, p2) -> p1.getDesignation().compareTo(p2.getDesignation())));
    }

    public static void sortPartsByRef(List<Part> parts) {
        Collections.sort(parts, (p1, p2) -> p1.getReference().compareTo(p2.getReference()));
    }

    public static void sortReversePartsByRef(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder((p1, p2) -> p1.getReference().compareTo(p2.getReference())));
    }

    public static void sortPartsByBrand(List<Part> parts) {
        Collections.sort(parts, (p1, p2) -> p1.getBrand().compareTo(p2.getBrand()));
    }

    public static void sortReversePartsByBrand(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder((p1, p2) -> p1.getBrand().compareTo(p2.getBrand())));
    }

    public static void sortPartsByProvider(List<Part> parts) {
        Collections.sort(parts,(p1, p2) -> p1.getProvider().getName().compareTo(p2.getProvider().getName())); 
    }

    public static void sortReversePartsByProvider(List<Part> parts) {
        Collections.sort(parts, Collections.reverseOrder((p1, p2) -> p1.getProvider().getName().compareTo(p2.getProvider().getName())));
    }
}
