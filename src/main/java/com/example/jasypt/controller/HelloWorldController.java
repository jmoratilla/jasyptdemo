/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jasypt.controller;

import com.example.jasypt.service.EncryptedPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jjmoratilla
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
  
  private static final String HELLO_VIEW = "hello";
  
  @Autowired
  @Qualifier("EncryptedPropertyService")
  private EncryptedPropertyService service;
  
  @GetMapping("/")
  public ModelAndView sayHello() {
    ModelAndView mav = new ModelAndView(HELLO_VIEW);
    mav.addObject("property", service.getProperty());
    
    
    return mav;
  }
}
