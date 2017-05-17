/*
 * @(#Country.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class03;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class03.Country</code> 
 *     is a POJOs class for management country information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Country {
    
    // Private instance fields declarations.
    // Country name.
    private String name = "";
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Country() {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param name name.
     */
    public Country (String name) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.name = name;
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
    
    
    // Public instance method declarations extended of java.lang.Object
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode ()
     */
    @Override
    public int hashCode () {
        
        // Return the value.
        return this.name.hashCode ();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#equals (Object obj)
     */
    @Override
    public boolean equals (Object obj) {
        
        // Check values.
        if (!(obj instanceof Student)) {
            return false;
        }
    
        // Return the value.
        Country that = (Country) obj;
        return this.name.equalsIgnoreCase (that.name);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.name;
    }
}