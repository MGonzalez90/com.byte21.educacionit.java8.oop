/*
 * @(#Phone.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class02;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class02.Phone</code> 
 *     is a POJOs class for management phone information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Phone {
 
    // Private instance fields declarations.
    // Country code.
    private String countryCode = "";
    
    // Area code.
    private String    areaCode = "";
    
    // Number.
    private int number = 0;
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Phone() {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param countryCode Country code.
     * @param areaCode Area code.
     * @param number Number.
     */
    public Phone (String countryCode, String areaCode, int number) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.countryCode = countryCode;
        this.areaCode    = areaCode;
        this.number = number;
    }
    
    
    // Public instance methods declarations.
    /**
     * 
     *  <p>Method that return the country code.
     * 
     * @return The country code.
     */
    public String getCountryCode () {
        
        // Return the value.
        return this.countryCode;
    }

    /**
     * 
     *  <p>Method that set the country code.
     * 
     * @param countryCode country code value.
     */
    public void setCountryCode (String countryCode) {
        
        // Set the value.
        this.countryCode = countryCode;
    }
    
    /**
     * 
     *  <p>Method that return the area code.
     * 
     * @return The area code.
     */
    public String getAreaCode () {
        
        // Return the value.
        return this.areaCode;
    }

    /**
     * 
     *  <p>Method that set the area code.
     * 
     * @param areaCode area code value.
     */
    public void setAreaCode (String areaCode) {
        
        // Set the value.
        this.areaCode = areaCode;
    }
    
    /**
     * 
     *  <p>Method that return the number.
     * 
     * @return The number.
     */
    public int getNumber () {
        
        // Return the value.
        return this.number;
    }
    
    /**
     * 
     *  <p>Method that set the number.
     * 
     * @param number Number value.
     */
    public void setNumber (int number) {
        
        // Set the value.
        this.number = number;
    }
}