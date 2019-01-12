/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.predicates;

import fr.sysdev.softcpa.entity.Provider;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author f
 */
public class ProvidersPredicates {
   public static List<Provider> filterProviders (List<Provider> providers, Predicate<Provider> predicate)
    {
        return providers.stream()
                    .filter( predicate )
                    .collect(Collectors.<Provider>toList());
    }
    public static Predicate<Provider> nameContains(String s) {
        return p -> p.getName().contains(s);
    }
   
    
//    public static Predicate<Provider> refOrEanOrDesignationOrBrandContains(String s) {
//        return p -> p.getReference().contains(s)||
//                    p.getEanCode().contains(s)||
//                    p.getDesignation().contains(s)||
//                    p.getBrand().contains(s);
//    } 
}
