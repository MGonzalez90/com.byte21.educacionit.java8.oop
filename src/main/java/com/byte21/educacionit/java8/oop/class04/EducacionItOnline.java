/*
 * @(#EducacionItOnline.java 05/17/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class04;


// Packages and classes to import of apache commons.
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

// Packages and classes to import of apache log4j.
import org.apache.log4j.Logger;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class04.EducacionItOnline</code> 
 *     implements the schools' methods using IEducacionIt interface.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/17/2017
 *  @see     {@link com.byte21.educacionit.java8.oop.class04.IEducacionIt}
 * */
public class EducacionItOnline implements IEducacionIt {
    
    
    // Private class fields declarations.
    // Logger object.
    private static final Logger logger = Logger.getLogger (EducacionItOnline.class);
    
    
    // Public constructors declarations.
    /**
     * 
     *  <p>Unique constructor without parameters.
     */
    public EducacionItOnline () {
    
        // Call to super class.
        super ();
    }
 
    
    // Public instance methods declarations extended of com.byte21.educacionit.java8.oop.class04.IEducacionIt
    /* (non-Javadoc)
     * @see com.byte21.educacionit.java8.oop.class04.IEducacionIt#register (java.lang.Object)
     */
    @Override
    public String register (Student student) {
 
        logger.info ("Initializing the register of ".concat (student.toString ()));
        logger.info ("Filling the form with basic information.");
        logger.info ("Selecting the course.");
        logger.info ("Paying the course.");
        
        String id = randomNumeric (10);
        logger.info ("Finishing the register of ".concat (student.toString ()).concat (" your number ticket is " .concat (id)));
        
        // Return the ticket.
        return id;
    }
}