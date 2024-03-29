/*
 * @(#Student.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class03;


// Packages and classes to import from jdk 1.8
import java.util.Map;

// Packages and classes to import apache commons.
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class03.Student</code> 
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
    
    // Phones.
    private Map<String, Phone>      phones = null;
    
    // Addresses.
    private Map<String, Address> addresses = null;
    
    
    // Private class fields declarations.
    private static int STUDENTS = 0;
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without arguments.
     */
    public Student() {
        
        // Call to constructor.
        this ("", "", 0, 
              null, null);
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
        
        // Add new student.
        STUDENTS++;
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
    
    
    // Public instance method declarations extended of java.lang.Object
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode ()
     */
    @Override
    public int hashCode () {
        
        // Return the value.
        return new HashCodeBuilder ().
                    append (this.dni).
                    append (this.name).
                    append (this.lastName).
                    toHashCode ();
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
        Student that = (Student) obj;
        return new EqualsBuilder ().
                    append (this.dni, that.dni).
                    append (this.name, that.name).
                    append (this.lastName, that.lastName).
                    isEquals ();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.name.concat (" ").concat (this.lastName);
    }
    
    
    // Public class methods declarations.
    /**
     * 
     *  <p>Method that return how many students has been created.
     * 
     *  @return Return how many students has been created.
     */
    public static int getTotalStudentsCreated () {
        
        // Return the values.
        return STUDENTS;
    }
}