/*
 * @(#Student.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class02;


// Packages and classes to import from jdk 1.8
import java.util.Map;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class02.Student</code> 
 *     is a POJOs class for management student information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Student {
 
    // Private instance fields declarations.
    // DNI
    private int dni = 0;
    
    // Student name.
    private String name = "";
    
    // Student last name.
    private String lastName = "";    
    
    private int age = 0;
    
    // Phones.
    private Map<String, Phone>      phones = null;
    
    // Addresses.
    private Map<String, Address> addresses = null;
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Student() {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param name Student name.
     * @param lastName Student last name.
     * @param dni Student dni.
     * @param phones Student phones numbers.
     * @param addresses Student addresses.
     */
    public Student (String name, String lastName, int dni,
                    Map<String, Phone> phones, Map<String, Address> addresses) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.name = name;
        this.lastName    = lastName;
        this.dni = dni;
        this.phones    = phones;
        this.addresses = addresses;
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
    
    public int getAge () {
        
        return age;
    }
    
    public void setAge (int a) {
        
        if (a >= 0 && a <= 100) {
            age = a;
        }
    }
    
    /**
     * 
     *  <p>Method that set the phones.
     * 
     * @return The phones.
     */
    public Map<String, Phone> getPhones () {
        
        // Retunr the value.
        return this.phones;
    }

    /**
     * 
     *  <p>Method that set the phones.
     * 
     * @param phones phones.
     */
    public void setPhones (Map<String, Phone> phones) {
        
        // Set the value.
        this.phones = phones;
    }
    
    /**
     * 
     *  <p>Method that return the address.
     * 
     * @return The addresses.
     */
    public Map<String, Address> getetAddress () {
        
        // Return the value.
        return this.addresses;
    }

    /**
     * 
     *  <p>Method that set the address.
     * 
     * @param addresses addresses.
     */
    public void setAddress (Map<String, Address> addresses) {
        
        // Set the value.
        this.addresses = addresses;
    }
}