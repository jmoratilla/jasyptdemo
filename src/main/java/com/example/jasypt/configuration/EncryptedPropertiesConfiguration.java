/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jasypt.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author jjmoratilla
 */
@Configuration
@PropertySource("${encrypted.properties.location}")
public class EncryptedPropertiesConfiguration {
  
}
