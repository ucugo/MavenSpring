/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugo.autowiring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ugo_dock
 */
@Configuration
public class PersonBeanConfig {
    
    @Bean
    public Person getPerson(){
        return new YoungPerson();
    }
}
