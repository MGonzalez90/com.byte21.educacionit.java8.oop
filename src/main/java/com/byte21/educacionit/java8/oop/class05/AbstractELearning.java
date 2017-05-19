/*
 * @(#AbstractELearning.java 05/19/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class05;


// Packages and classes to import of this project.
import com.byte21.educacionit.java8.oop.class04.Student;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class05.AbstractELearning</code> 
 *     is the base class for build ELearning classes.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/19/2017
 * */
public abstract class AbstractELearning {
    
    
    // Private instance fields declarations.
    // App name.
    private String name = "";
 
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Unique constructor with arguments.
     * 
     *  @param name App name.
     */
    public AbstractELearning (String name) {
        
        // Call to super class.
        super ();
        
        // Set internal values.
        this.name = name;
    }
    
    
    // Public instance method declarations. (Get/set)
    /**
     * <p>Method that return the app name.
     * 
     * @return App name.
     */
    public String getName () {
        
        // Return the name.
        return this.name;
    }
    
    
    // Public abstract methods declarations.
    /**
     * 
     *  <p>Method that register a new student.
     * 
     *  @param  student Student to register.
     *  @return confirm number.
     *  @see    {@link com.byte21.educacionit.java8.oop.class04.Student}
     */
    public abstract String register (Student student);
}