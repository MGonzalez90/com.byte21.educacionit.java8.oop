/*
 * @(#ELearnigApp.java 05/19/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class05;


// Packages and classes to import of apache log4j.
import org.apache.log4j.Logger;

// Packages and classes to import of this project.
import com.byte21.educacionit.java8.oop.class04.Student;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class05.ELearnigApp</code> 
 *     is an app for register student and courses.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/19/2017
 * */
public class ELearnigApp extends AbstractELearning {
    
    
    // Private instance fields declarations.
    // Object for send notifications messages.
    private ICommunicator communicator = null;
    
    
    // Private class fields declarations.
    // Logger object.
    private static final Logger logger = Logger.getLogger (ELearnigApp.class);
    
    
    // Public constructor declarations.
    /**
     * 
     *  <p>Unique constructor with arguments.
     * 
     *  @param name App name.
     */
    public ELearnigApp (String name) {
        
        // Call to super class.
        super (name);
    }
    
    
    // Public instance method declarations. (Get/Set)
    /**
     *  <p>Method that set a new communicator.
     * 
     *  @param communicator Object for send notifications.
     */
    public void setCommunicator (ICommunicator communicator) {
        
        // Set the value.
        this.communicator = communicator;
    }
    
    
    // Public instance methods declarations.
    /* (non-Javadoc)
     * @see com.byte21.educacionit.java8.oop.class05#register (com.byte21.educacionit.java8.oop.class04.Student)
     */
    @Override
    public String register (Student student) {
        
        // Vars declarations.
        String id = "";
        
        
        // Register a new student.
        logger.info ("Staring register process for " + student);
        
        logger.info ("Register process for " + student + " finished.");
        return id;
    }
    
    
    // Public instance method declarations extended of java.lang.Object
     /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value.
	return "Elearning EducacionIt App [" + this.getName () + "]";
    }
}