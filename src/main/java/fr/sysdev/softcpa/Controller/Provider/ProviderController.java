/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Controller.Provider;


import fr.sysdev.softcpa.Service.IProviderService;
import fr.sysdev.softcpa.View.Provider.ProviderView;
import fr.sysdev.softcpa.entity.Part;
import fr.sysdev.softcpa.entity.Provider;
import fr.sysdev.softcpa.utils.ObservableList;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
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
public class ProviderController  {
    @Autowired
    private final IProviderService iProviderService;
 
    @Autowired
    private ProviderView view;

    @PostConstruct
    private void prepareListeners() {

        registerAction(view.getRemoveBtn(), (e) -> removeProvider());
        registerAction(view.getAddBtn(), (e) -> addProvider());
        registerAction(view.getUpdateBtn(), (e) -> updateProvider());
        registerAction(view.getInvoicingBtn(), (e) -> invoicingParts());
        registerAction(view.getImportBtn(), (e) -> importingParts());
        registerAction(view.getRefreshBtn(), (e) -> loadingProviders());
  
    }

    public ProviderController( IProviderService iProviderService) {
        this.iProviderService=iProviderService; 
        view = new ProviderView(iProviderService.getProviders());
        prepareListeners();
    }

    public ProviderView getView() {
        return view;
    }

    public void setView(ProviderView view) {
        this.view = view;
    }

    public void removeProvider() {
        this.getView().removeProvider();
        Provider provider = new Provider();
               provider =  this.getView().getProvider();
               provider.setParts(new ArrayList<Part>());
        //provider.removeAllParts();
        this.iProviderService.updateProvider(provider);
        this.iProviderService.deleteProvider(provider);
    }

    public void addProvider() {

        this.getView().addProvider(this.iProviderService.key());
        Provider provider = this.getView().getProvider();
        iProviderService.addProvider(provider);

    }
    
     public void updateProvider() {

        this.getView().addProvider(this.iProviderService.key());
        Provider provider = this.getView().getProvider();
        iProviderService.updateProvider(provider);
    }
    
    

    protected void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

   

    private void invoicingParts() {
       
    }

    private void importingParts() {

        new Thread(() -> {
            

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
                    while ((line = br.readLine()) != null && i < 3) {
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
                    List providersParts = new ArrayList<>();
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

    
    public void loadingProviders(){
        
        this.view.setProviders(iProviderService.getProviders());
        this.view.loadParts();
    }


    
}
