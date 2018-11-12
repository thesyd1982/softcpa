/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


/**
 *
 * @author COPCGRE
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SoftcpaApplication {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_prod?useSSL=false";
        String username = "scpa_prod_user";
        String password = "Pq4s67Xa";
        
        try{
            System.out.println("Connecting to DataBase");
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected!!!");
        
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(SoftcpaApplication.class)
                .headless(false).run(args);
        
        
        } catch (SQLException ex) {
            Logger.getLogger(SoftcpaApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
