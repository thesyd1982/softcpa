/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa.Service;

import fr.sysdev.softcpa.Repository.IPartRepository;
import fr.sysdev.softcpa.entity.Part;
import fr.sysdev.softcpa.entity.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sysdev
 */
@Slf4j
@Service
public class PartService extends Observable implements IPartService{
     @Autowired
    private final IPartRepository partRepository;
    private String message ="";
    
    public PartService(IPartRepository partRepository) {
       log.debug("Part Service --> Started ...");
        this.partRepository = partRepository ;
    }
     
     
    @Override
    public List<Part> getParts() {
        return (List<Part>) partRepository.findAll();
    }

    @Override
    public Part getPartById(Long partId) {
        Optional<Part> partOptional = partRepository.findById(partId);

        if (!partOptional.isPresent()) {
            throw new NullPointerException("Part Not Found. For ID value: "+partId.toString() );
        }
        return partOptional.get();
    }

    @Override
    public Part addPart(Part part) {
        Part p = partRepository.save(part);
        this.setChanged();
        this.notifyObservers();
        return p;
    }

    @Override
    public Part updatePart(Part part) {
        Part p = partRepository.save(part);
        this.setChanged();
        this.notifyObservers();
        return p;
    }

    @Override
    public void deletePart(Part part) {
        partRepository.delete(part);
        this.setChanged();
        this.notifyObservers();
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
    public void addParts(List<Part> parts) {
        this.partRepository.saveAll(parts);
    }

    

    public Part setPartFromCursor(final ResultSet rs) throws SQLException {
        Part p = new Part();
        p.setId(rs.getLong("id_part"));
        p.setBrand(rs.getString("brand"));
        p.setDesignation(rs.getString("designation"));
        p.setEanCode(rs.getString("ean_code"));
        p.setPurchasingPrice(rs.getDouble("purchasing_price"));
        p.setStock(rs.getInt("quantity"));
        p.setReference(rs.getString("reference"));
        p.setSellingPrice(rs.getDouble("selling_price"));
        Provider provider = new Provider();
        provider.setId(rs.getLong("id_provider"));
        
        p.setProvider(provider);
        return p;
    }



    private Connection getConnection() throws SQLException {
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    @Override
    public List<Part> findByEanCode(String eanCode) {
            List<Part> result = new ArrayList<>();
        
        Part part = null;
        Connection con = null ;
        try {
            
                con = getConnection();
                String sql = "SELECT * FROM part Where part.eanCode like '%"+eanCode+"%'";
            PreparedStatement pst = con.prepareStatement(sql);
                //pst.setString(1, ref);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //part =  setPartFromCursor(rs);
                  part =  getPartById(rs.getLong("id_part"));
                
                  result.add(part);
                }
       
                
                
        } catch (SQLException e) {
            message = e.getMessage();
        }
        finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        
            return result;
        
    }

    @Override
    public List<Part> findByBrand(String brand) {
            List<Part> result = new ArrayList<>();
        
        Part part = null;
        Connection con = null ;
        try {
            
                con = getConnection();
                String sql = "SELECT * FROM part Where part.brand like '%"+brand+"%'";
            PreparedStatement pst = con.prepareStatement(sql);
                //pst.setString(1, ref);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //part =  setPartFromCursor(rs);
                  part =  getPartById(rs.getLong("id_part"));
                
                  result.add(part);
                }
       
                
                
        } catch (SQLException e) {
            message = e.getMessage();
        }
        finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        
            return result;
        
    }

    @Override
    public List<Part> findByDesignation(String designation) {
            List<Part> result = new ArrayList<>();
        
        Part part = null;
        Connection con = null ;
        try {
            
                con = getConnection();
                String sql = "SELECT * FROM part Where part.designation like '%"+designation+"%'";
            PreparedStatement pst = con.prepareStatement(sql);
                //pst.setString(1, ref);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //part =  setPartFromCursor(rs);
                  part =  getPartById(rs.getLong("id_part"));
                
                  result.add(part);
                }
       
                
                
        } catch (SQLException e) {
            message = e.getMessage();
        }
        finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        
            return result;
        
    }
    
    @Override
    public List<Part> findByReference(String ref) {
        List<Part> result = new ArrayList<>();
        
        Part part = null;
        Connection con = null ;
        try {
            
                con = getConnection();
                String sql = "SELECT * FROM part Where part.reference like '%"+ref+"%'";
            PreparedStatement pst = con.prepareStatement(sql);
                //pst.setString(1, ref);
            ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    //part =  setPartFromCursor(rs);
                  part =  getPartById(rs.getLong("id_part"));
                
                  result.add(part);
                }
       
                
                
        } catch (SQLException e) {
            message = e.getMessage();
        }
        finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        
            return result;
        
    }

    @Override
    public void addPartsObserver(Observer obsrvr) {
        this.addObserver(obsrvr);
    }

    @Override
    public void removePartsObserver(Observer obsrvr) {
        this.deleteObserver(obsrvr);
    }
    
    
}
