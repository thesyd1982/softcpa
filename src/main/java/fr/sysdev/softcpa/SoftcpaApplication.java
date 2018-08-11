/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sysdev.softcpa;

import fr.sysdev.softcpa.Controllers.DefaultController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author COPCGRE
 */
@SpringBootApplication
public class SoftcpaApplication {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(SoftcpaApplication.class)
                .headless(false).run(args);
        
    }
    
}
