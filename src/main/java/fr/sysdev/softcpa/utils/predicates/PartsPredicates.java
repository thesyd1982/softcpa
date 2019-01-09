/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.predicates;

import fr.sysdev.softcpa.entity.Part;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author f
 */
public class PartsPredicates {
   public static List<Part> filterParts (List<Part> parts, Predicate<Part> predicate)
    {
        return parts.stream()
                    .filter( predicate )
                    .collect(Collectors.<Part>toList());
    }
    public static Predicate<Part> refContains(String s) {
        return p -> p.getReference().contains(s);
    }
    public static Predicate<Part> eanCodeContains(String s) {
        return p -> p.getEanCode().contains(s);
    }
    public static Predicate<Part> designantionContains(String s) {
        return p -> p.getDesignation().contains(s);
    }
    public static Predicate<Part> brandContains(String s) {
        return p -> p.getBrand().contains(s);
    }
    
    public static Predicate<Part> refOrEanOrDesignationOrBrandContains(String s) {
        return p -> p.getReference().contains(s)||
                    p.getEanCode().contains(s)||
                    p.getDesignation().contains(s)||
                    p.getBrand().contains(s);
    } 
}
