/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;
import fr.sysdev.softcpa.Repository.IInvoiceRepository;
import fr.sysdev.softcpa.entity.Invoice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author sysdev
 */
@Service
public class InvoiceService extends Observable implements IInvoiceService {
    @Autowired
    private final IInvoiceRepository invoiceRepository;

    public InvoiceService(IInvoiceRepository invoiceRepository) {
        System.out.println("Invoice Service");
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getInvoices() {
        return (List<Invoice>) invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long invoiceId) {
        Optional<Invoice> partOptional = invoiceRepository.findById(invoiceId);

        if (!partOptional.isPresent()) {
            throw new NullPointerException("Invoice Not Found. For ID value: "+invoiceId.toString() );
        }
        return partOptional.get();
    }

    @Override
    public Invoice addInvoice(Invoice invoice) {
        Invoice i = invoiceRepository.save(invoice);
        this.setChanged();
        this.notifyObservers();
        return i;
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {
        Invoice i = invoiceRepository.save(invoice);
        this.setChanged();
        this.notifyObservers();
        return i;
    }

    @Override
    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public void addInvoices(List<Invoice> Invoices) {
       invoiceRepository.saveAll(Invoices);
    }

  

  
    private Connection getConnection() throws SQLException {
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
    
   

    @Override
    public Long key() {
         int id = -1;
        try{
            
            Connection conn = getConnection();
            Statement smt = conn.createStatement() ;
            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'part' AND table_schema = DATABASE()") ;
           
            if(resultSet.next()){
             id = resultSet.getInt("id") ;
            }
            System.out.println("AUTO_INCREMENT PART"+ id);
        
        } catch (SQLException ex) {
           
        }
        
        return (long)id ;
    }

    @Override
    public void addInvoicesObserver(Observer obsrvr) {
        this.addObserver(obsrvr);
    }

    @Override
    public void removeInvoicesObserver(Observer obsrvr) {
        this.deleteObserver(obsrvr);
    }
    
}
