/*
 * @(#Person.java 05/17/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class04;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class04.Person</code> 
 *     is a POJOs class for management person information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/17/2017
 * */
public abstract class Person {
 
    // Private instance fields declarations.
    // DNI
    private int dni = 0;
    
    // Student name.
    private String name = "";
    
    // Student last name.
    private String lastName = "";   
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Person() {
        
        // Call to constructor.
        this ("", "", 0);
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param name Student name.
     * @param lastName Student last name.
     * @param dni Student dni.
     */
    public Person (String name, String lastName, int dni) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
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
     *  <p>Method that set the name
     * 
     * @param name Name.
     */
    public void setName (String name) {
        
        // Set the value.
        this.name = name;
    }
    
    /**
     * 
     *  <p>Method that return the last name.
     * 
     * @return The last name.
     */
    public String getLastName () {
        
        // Return the value.
        return this.lastName;
    }

    /**
     * 
     *  <p>Method that set the last name.
     * 
     * @param lastName last name.
     */
    public void setLastName (String lastName) {
        
        // Set the value.
        this.lastName = lastName;
    }
    
    /**
     * 
     *  <p>Method that return the dni.
     * 
     * @return The dni.
     */
    public int getDni () {
        
        // Return the value.
        return this.dni;
    }

    /**
     * 
     *  <p>Method that set the dni.
     * 
     * @param dni dni.
     */
    public void setDni (int dni) {
        
        // Set the value.
        this.dni = dni;
    }
}