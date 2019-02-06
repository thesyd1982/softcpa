/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.utils.predicates;

import fr.sysdev.softcpa.entity.Provider;
import java.util.Collections;
import java.util.Comparator;
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
        return p -> p.getName().toUpperCase().contains(s.toUpperCase());
    }
   
    public static void sortProvidersById (List<Provider> providers)
    {
        Comparator<Provider> idComparator;
        idComparator = Comparator.comparingInt((p) -> (int)(long)p.getId());
        Collections.sort(providers, idComparator);
    }
    
    
    public static void sortReverseProvidersById (List<Provider> providers)
    {
        Comparator<Provider> idComparator;
        idComparator = Comparator.comparingInt((p) -> (int)(long)p.getId());
        Collections.sort(providers, Collections.reverseOrder(idComparator));
    }
    
    
   public static void sortProvidersByName (List<Provider> providers)
    {
       Collections.sort(providers, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
    
public static void sortReverseProvidersByName (List<Provider> providers)
    {
       Collections.sort(providers, Collections.reverseOrder((p1, p2) -> p1.getName().compareTo(p2.getName())));
    }
}
