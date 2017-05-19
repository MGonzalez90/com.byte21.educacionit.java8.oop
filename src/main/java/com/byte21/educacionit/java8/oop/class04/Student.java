/*
 * @(#Student.java 05/17/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class04;


// Packages and classes to import from jdk 1.8
import java.util.Map;

// Packages and classes to import apache commons.
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

// Packages and classes to import of this project.
import com.byte21.educacionit.java8.oop.class03.Address;
import com.byte21.educacionit.java8.oop.class03.Phone;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class04.Student</code> 
 *     is a POJOs class for management student information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/17/2017
 * */
public class Student extends Person {
 
    // Private instance fields declarations.
    // Id student.
    private int id = 0;
    
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
        super (name, lastName, dni);
        
        // Set the internal values.
        this.phones    = phones;
        this.addresses = addresses;
        
        // Add new student.
        STUDENTS++;
    }
    
    
    // Public instance methods declarations.
    /**
     * 
     *  <p>Method that return the student id.
     * 
     *  @return Id student.
     */
    public int getId () {
        
        // Return the value.
        return this.id;
    }
    
    /**
     * 
     *  <p>Method that set the student id.
     * 
     *  @param id Id student.
     */
    public void setId (int id) {
        
        // Set the value.
        this.id = id;
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
                    append (this.getDni ()).
                    append (this.getName ()).
                    append (this.getLastName ()).
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
                    append (this.getDni (), that.getDni ()).
                    append (this.getName (), that.getName ()).
                    append (this.getLastName (), that.getLastName ()).
                    isEquals ();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.getName ().concat (" ").concat (this.getLastName ());
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