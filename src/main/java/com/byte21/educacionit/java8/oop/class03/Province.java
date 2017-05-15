/*
 * @(#Province.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class03;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class03Province</code> 
 *     is a POJOs class for management province information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Province {
 
    // Private instance fields declarations.
    // Province name.
    private String name = "";
    
    // Province.
    private Country country = null;
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Province() {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param name name.
     * @param country Country.
     */
    public Province (String name, Country country) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.name = name;
        this.country = country;
    }
    
    
    // Public instance methods declarations.
    /**
     * 
     *  <p>Method that return the name.
     * 
     * @return The name.
     */
    public String getName () {
        
        // Return the value.
        return this.name;
    }

    /**
     * 
     *  <p>Method that set the street.
     * 
     * @param name Name value.
     */
    public void setName (String name) {
        
        // Set the value.
        this.name = name;
    }
    
    /**
     * 
     *  <p>Method that return the country.
     * 
     * @return The country.
     */
    public Country getCountry () {
        
        // Return the value.
        return this.country;
    }

    /**
     * 
     *  <p>Method that set the country.
     * 
     * @param country Country value.
     */
    public void setCountry (Country country) {
        
        // Set the value.
        this.country = country;
    }
    
    
    // Public instance method declarations extended of java.lang.Object
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.name;
    }
}