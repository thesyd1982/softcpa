/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;
import fr.sysdev.softcpa.Repository.IInvoiceRepository;
import fr.sysdev.softcpa.entity.Invoice;
import fr.sysdev.softcpa.entity.InvoiceLine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author sysdev
 */
@Slf4j
@Service
public class InvoiceService extends Observable implements IInvoiceService {
    @Autowired
    private final IInvoiceRepository invoiceRepository;

    public InvoiceService(IInvoiceRepository invoiceRepository) {

        log.debug("\"Invoice Service\" --> Started ...");
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getInvoices() {
        return (List<Invoice>) invoiceRepository.findAll();
    }
    
    @Override
    @Transactional
    public Invoice getInvoiceById(Long invoiceId) {
        Optional<Invoice> partOptional = invoiceRepository.findById(invoiceId);

        if (!partOptional.isPresent()) {
            throw new NullPointerException("Invoice Not Found. For ID value: "+invoiceId.toString() );
        }
        return partOptional.get();
    }

    @Override
    @Transactional
    public Invoice addInvoice(Invoice invoice) {
        Invoice i = invoiceRepository.save(invoice);
        this.setChanged();
        this.notifyObservers();
        return i;
    }

    @Override
    @Transactional
    public Invoice updateInvoice(Invoice invoice) {
        Invoice i = invoiceRepository.save(invoice);
        this.setChanged();
        this.notifyObservers();
        return i;
    }

    @Override
    @Transactional
    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    @Transactional
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
            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'invoice' AND table_schema = DATABASE()") ;
           
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

    @Override
    public InvoiceLine addInvoiceLine(Invoice invoice ,InvoiceLine invoiceLine) {
        invoice.getInvocesLines().add(invoiceLine);
        updateInvoice(invoice);
        return invoiceLine;
    }

    @Override
    public InvoiceLine deleteInvoiceLine(Invoice invoice ,InvoiceLine invoiceLine) {
        invoice.getInvocesLines().remove(invoiceLine);
        updateInvoice(invoice);
        return invoiceLine;
    }

    @Override
    public Double salesRevenues() {
        List invoices = getInvoices();
        Stream <Invoice> is = invoices.stream();
        Double sR = 0.0;
        
       Optional sum = is.map((t) -> {
            return t.getAmount();
        }).reduce(Double::sum);
       
       if(sum.isPresent())
           sR =  (Double) sum.get();
        return sR;
    }
    
}
