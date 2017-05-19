/*
 * @(#Person.java 05/17/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class04;


// Packages and classes to import of jdk 1.8
import java.time.LocalDate;


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
    
    // Birthdate.
    private LocalDate birthDate = null;
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Person() {
        
        // Call to constructor.
        this ("", "", 0, 
              null);
    }
    
    /**
     * 
     *  <p>Constructor with arguments.
     * 
     * @param name Student name.
     * @param lastName Student last name.
     * @param dni Student dni.
     * @param birthDate Birth date.
     */
    public Person (String name, String lastName, int dni,
                   LocalDate birthDate) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.name = name;
        this.lastName = lastName;
        this.dni      = dni;
        this.birthDate = birthDate;
    }
    
    
    // Private instance method declarations.
    /*
     *  <p>Method that calculate the age.
     *
     *  @return The age.
     */
    private int calculateAge () {
        
        // Calcuala teh age.
        if (this.birthDate != null) {
            return LocalDate.now ().getYear () - this.birthDate.getYear ();
        } else {
            return 0;
        }
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

    /**
     * 
     *  <p>Method that return the birth date.
     * 
     * @return Birth date.
     */
    public LocalDate getBirthDate () {
        
        // Return the value.
        return this.birthDate;
    }

    /**
     * 
     *  <p>Method that set the birth date.
     * 
     * @param birthDate Birth date.
     */
    public void setBirthDate (LocalDate birthDate) {
        
        // Set the value.
        this.birthDate = birthDate;
    }
    
    /**
     * 
     *  <p>Method that return the age.
     * 
     * @return Age.
     */
    public int getAge () {
        
        // Return the value.
        return this.calculateAge ();
    }
}