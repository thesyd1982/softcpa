/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Part;

import fr.sysdev.softcpa.Service.IPartService;
import fr.sysdev.softcpa.Service.IProviderService;
import fr.sysdev.softcpa.View.Part.PartView;
import fr.sysdev.softcpa.entity.Part;
import fr.sysdev.softcpa.entity.Provider;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sysdev
 */
@Controller
public class PartController {
    @Autowired
    private final IProviderService iProviderService;
    @Autowired
    private final IPartService iPartService;

    
    
    @Autowired
    private PartView view;

    @PostConstruct
    private void prepareListeners() {

        registerAction(view.getRemoveBtn(), (e) -> removePart());
        registerAction(view.getAddBtn(), (e) -> addPart());
        registerAction(view.getUpdateBtn(), (e) -> updatePart());
        registerAction(view.getInvoicingBtn(), (e) -> invoicingParts());
        registerAction(view.getImportBtn(), (e) -> importingParts());
    }

    public PartController(IPartService iPartService , IProviderService iProviderService) {
        this.iProviderService=iProviderService;
        this.iPartService = iPartService;
        
        
        view = new PartView(iPartService.getParts(),iProviderService.getProviders());
        prepareListeners();
    }

    public PartView getView() {
        return view;
    }

    public void setView(PartView view) {
        this.view = view;
    }

    public void removePart() {

        this.getView().removePart();
        this.iPartService.deletePart(this.getView().getPart());

    }

    public void addPart() {

        this.getView().addPart(this.iPartService.key());
        Provider provider = this.getView().getPart().getProvider();
        Part part  = this.getView().getPart();
        
        iPartService.addPart(part);
        iProviderService.updateProvider(provider);
       
        provider = iProviderService.getProviderById(1L);
        
        Set<Part> parts = provider.getParts();
        parts.forEach(System.out::println);
  
    }

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

    private void updatePart() {

        this.getView().updatePart();
        Part part = this.getView().getPart();
        JOptionPane.showConfirmDialog(null, part);
        this.iPartService.updatePart(part);
    }

    private void invoicingParts() {
        List<Part> findBy = iPartService.findByReference("J1115033");
         findBy.forEach(System.out::println);
       findBy =  iPartService.findByDesignation("FIL");
       findBy.forEach(System.out::println);
        findBy =  iPartService.findByEanCode("803343401");
       findBy.forEach(System.out::println); 
       findBy =  iPartService.findByBrand("LES");
       findBy.forEach(System.out::println); 
        //this.getView().getPartsToInvoice();
    }

    private void importingParts() {

        new Thread(() -> {
            // code goes here.

            Part part = new Part();
            Provider provider = new Provider();
            ArrayList<Part> parts = new ArrayList<>();
            
            
            String csvFile = view.getCsvFile();
            String result = "";
            if (csvFile != null) {
                String line = "";
                String cvsSplitBy = ";";
                LocalDateTime start = LocalDateTime.now();
                provider.setId(iProviderService.key());
                provider.setName("EXADIS");
                try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                    int i = 0;
                    while ((line = br.readLine()) != null ) {
                        if (i != 0) {
                            
                            String[] strPart = line.split(cvsSplitBy);                            
                            part =new Part();                            
                            part.setEanCode(strPart[0]);
                            part.setReference(strPart[1]);
                            part.setDesignation(strPart[4]);
                            part.setPurchasingPrice(new Double(strPart[11]));
                            part.setSellingPrice(new Double(strPart[11]));
                            part.setQuantity(0);
                            part.setBrand(strPart[38]);
                            part.setProvider(provider);
                            parts.add(part);
                           
                        }


                        i++;

                    }
                    HashSet providersParts = new HashSet<>();
                    parts.forEach(p-> providersParts.add(p));
                    provider.setParts(providersParts);
                    iProviderService.addProvider(provider);

                    LocalDateTime finish = LocalDateTime.now();
                    
                    long days = ChronoUnit.DAYS.between(start, finish);
                    long hours = ChronoUnit.HOURS.between(start, finish);
                    long minutes = ChronoUnit.MINUTES.between(start, finish);
                    long seconds = ChronoUnit.SECONDS.between(start, finish);
                    
                    
                     System.out.println(days + " days");
                        System.out.println(hours + " hours");
                        System.out.println(minutes + " minutes");
                        System.out.println(seconds + " seconds");
                    
                    JOptionPane.showMessageDialog(null, start + "\n" + finish + "\n count: " + (i - 1)+"\n"+days + " days"+
                            "\n"+hours + " hours"+"\n"+minutes + " minutes"+"\n"+seconds + " seconds"
                            );

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
            }
        }).start();

    }

    
    
    
}
