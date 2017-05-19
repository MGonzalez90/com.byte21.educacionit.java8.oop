/*
 * @(#ELearningAppTest.java 05/19/2017
 * Copyright 2015 Byte21, Inc. All rights reserved.
 * byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.test;


// Packages and classes to import of jdk 1.8
import java.time.LocalDate;

// Packages and classes to import of apache log4j.
import org.apache.log4j.Logger;

// Packages and classes to import of junit api.
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

// Packages and classes to import of the project.
import com.byte21.educacionit.java8.oop.class03.Province;
import com.byte21.educacionit.java8.oop.class04.Student;
import com.byte21.educacionit.java8.oop.class05.MainApp;
import com.byte21.educacionit.java8.oop.class05.AbstractELearning;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.test.ELearningAppTest</code> is a JUnit test for
 *     OOP operations.
 *     
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/16/2017
 * */
public class ELearningAppTest {
    
    
    // Private class fields declarations.
    // Logger object.
    private static final Logger logger = Logger.getLogger (ELearningAppTest.class);
    
    
    // Public constructor declarations.
    /*
     * Constructor without parameters.
     **/
    public ELearningAppTest () {
        
        // Callt o super class.
        super ();
    }
    
    
    // Public instance method declarations.
    /**
     * 
     *  <p>Method that test a register successful. (App Online)
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void checkARegisterOnlineSuccessful () {
        
        // Build a student.
        logger.info ("Initializing test...");
        logger.info ("Creating new student...");
        Student s = new Student ();
        s.setName ("Raul");
        s.setLastName ("Peña");
        s.setBirthDate (LocalDate.of (1977, 7, 9));
        s.setProvince (new Province ("CABA", null));
        logger.debug ("New student " + s + " created.");
        
        
        // Get a school.
        logger.info ("Getting new app school...");
        AbstractELearning app = MainApp.buildOnlineApp ();
        logger.debug ("School " + app + " ready.");
        
        
        // Register a new student.
        logger.info ("Registering " + s + " in " + app);
        String confirmation = app.register (s);
        logger.debug (s + " in " + app + " registered, him confirmation number is ==> " + confirmation + " and student id " + s.getId ());
        
        
        // Check the test.
        logger.debug ("Checking test.");
        assertNotNull ("Confirmation number is invalid...", confirmation);
        assertTrue ("Student id is invalid...", s.getId () > 0);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test a register successful. (App Onsite)
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void checkARegisterOnsiteWithFailure () {
        
        // Build a student.
        logger.info ("Initializing test...");
        logger.info ("Creating new student...");
        Student s = new Student ();
        s.setName ("Homer");
        s.setLastName ("Simpson");
        s.setBirthDate (LocalDate.of (1950, 7, 9));
        s.setProvince (new Province ("Springfield", null));
        logger.debug ("New student " + s + " created.");
        
        
        // Get a school.
        logger.info ("Getting new app school...");
        AbstractELearning app = MainApp.buildOnsiteApp ();
        logger.debug ("School " + app + " ready.");
        
        
        // Register a new student.
        logger.info ("Registering " + s + " in " + app);
        String confirmation = app.register (s);
        logger.debug (s + " in " + app + " registered, him confirmation number is ==> " + confirmation + " and student id " + s.getId ());
        
        
        // Check the test.
        logger.debug ("Checking test.");
        assertNull ("Confirmation number is invalid...", confirmation);
        assertTrue ("Student id is invalid...", s.getId () == 0);
        logger.info ("Ending test...");
    }
}