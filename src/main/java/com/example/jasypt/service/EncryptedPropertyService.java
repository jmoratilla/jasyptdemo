/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jasypt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author jjmoratilla
 */
@Service("EncryptedPropertyService")
public class EncryptedPropertyService {
  
  @Value("${encrypted.property}")
  private String property;

  
  public String getProperty() {
    return property;
  }
  
}
