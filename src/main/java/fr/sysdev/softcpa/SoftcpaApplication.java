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
        
        String  jdbcUrl = "jdbc:mysql://localhost:3306/scpa_dev?useSSL=false";
        String username = "scpa_dev_user";
        String password = "Pq4s67Xa";
        
//        String  jdbcUrl = "jdbc:mysql://192.168.0.40:3306/scpa_dev?useSSL=false";
//        String username = "adminmysql";
//        String password = "1234";
        
        
        try{
            System.out.println("Connecting to DataBase");
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
//            Statement smt = conn.createStatement() ;
//            ResultSet resultSet = smt.executeQuery("SELECT AUTO_INCREMENT as id FROM information_schema.tables WHERE table_name = 'client' AND table_schema = DATABASE()") ;
//            int id = -1;
//            if(resultSet.next()){
//             id = resultSet.getInt("id") ;
//            }
//            System.out.println(""+ id);
            System.out.println("Connected!!!");
        
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(SoftcpaApplication.class)
                .headless(false).run(args);
      
        
        } catch (SQLException ex) {
            Logger.getLogger(SoftcpaApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
