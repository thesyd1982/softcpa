package fr.sysdev.softcpa.system.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "fr.sysdev.softcpa")
@EnableJpaRepositories(basePackages = "fr.sysdev.softcpa.Repository")
public class ApplicationConfiguration {
}
