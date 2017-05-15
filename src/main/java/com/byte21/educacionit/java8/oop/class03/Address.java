/*
 * @(#Address.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class03;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class03.Address</code> 
 *     is a POJOs class for management address information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Address {
    
    // Private instance fields declarations.
    // Street name.
    private String street = "";
    
    // Street number.
    private int    number = 0;
    
    // Postal code.
    private String postal = "";
    
    // Province.
    private Province province = null;

    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Address() {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param street Street name.
     * @param number Street number.
     * @param postal Postal code.
     * @param province Province.
     */
    public Address (String street, int number, String postal,
                    Province province) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.street   = street;
        this.number   = number;
        this.postal   = postal;
        this.province = province;
    }
    
    
    // Public instance methods declarations.
    /**
     * 
     *  <p>Method that return the street.
     * 
     * @return The street.
     */
    public String getStreet () {
        
        // Return the value.
        return this.street;
    }

    /**
     * 
     *  <p>Method that set the street.
     * 
     * @param street Street value.
     */
    public void setStreet (String street) {
        
        // Set the value.
        this.street = street;
    }

    /**
     * 
     *  <p>Method that return the street number.
     * 
     * @return The street number.
     */
    public int getNumber () {
        
        // Return the value.
        return this.number;
    }

    /**
     * 
     *  <p>Method that set the street number.
     * 
     * @param number street number.
     */
    public void setNumber (int number) {
        
        // Set the value.
        this.number = number;
    }

    /**
     * 
     *  <p>Method that return the postal code.
     * 
     * @return The postal code.
     */
    public String getPostal () {
        
        // Return the value.
        return this.postal;
    }

    /**
     * 
     *  <p>Method that set the postal code.
     * 
     * @param postal Postal code.
     */
    public void setPostal (String postal) {
        
        // Set the value.
        this.postal = postal;
    }

    /**
     * 
     *  <p>Method that return the province.
     * 
     * @return The province.
     */
    public Province getProvince () {
        
        // Return the value.
        return this.province;
    }
    
    /**
     * 
     *  <p>Method that set the province.
     * 
     * @param province The province.
     */
    public void setProvince (Province province) {
     
        // Set the value.
        this.province = province;
    }
    
    
    // Public instance method declarations extended of java.lang.Object
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.street.concat (" ").
                concat (String.valueOf (this.number)).
                concat (", ").
                concat (this.province.toString ());
    }
}