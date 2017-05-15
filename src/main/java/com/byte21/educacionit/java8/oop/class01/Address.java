/*
 * @(#Address.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class01;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class01.Address</code> 
 *     is a POJOs class for management address information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Address {
 
    // Public instance fields declarations.
    // Street name.
    public String street = "";
    
    // Street number.
    public int    number = 0;
    
    // Postal code.
    public String postal = "";
    
    // Province.
    public Province province = null;
}