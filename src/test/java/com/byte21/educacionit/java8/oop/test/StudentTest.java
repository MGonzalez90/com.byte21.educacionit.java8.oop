/*
 * @(#StudentTest.java 05/16/2017
 * Copyright 2015 Byte21, Inc. All rights reserved.
 * byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.test;


// Packages and classes to import of apache log4j.
import org.apache.log4j.Logger;

// Packages and classes to import of junit api.
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

// Packages and classes to import of the project.
import com.byte21.educacionit.java8.oop.class04.Student;
import com.byte21.educacionit.java8.oop.class04.IEducacionIt;
import com.byte21.educacionit.java8.oop.class04.EducacionItOnline;
import com.byte21.educacionit.java8.oop.class04.EducacionItOnSite;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.test.StudentTest</code> is a JUnit test for
 *     OOP operations.
 *     
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/16/2017
 * */
public class StudentTest {
    
    
    // Private class fields declarations.
    // Logger object.
    private static final Logger logger = Logger.getLogger (StudentTest.class);
    
    
    // Public constructor declarations.
    /*
     * Constructor without parameters.
     **/
    public StudentTest () {
        
        // Callt o super class.
        super ();
    }
    
    
    // Public instance method declarations.
    /**
     * 
     *  <p>Method that test the equals operator ==.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void checkIsTheSameStudentByReferenceTest () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s1 = new Student ();
        s1.setName ("Raul");
        s1.setLastName ("Peña");
        
        Student s2 = new Student ();
        s2.setName ("Raul");
        s2.setLastName ("Peña");
        
        
        // Check the test.
        logger.debug ("Checking " + s1 + " Vs " + s2);
        assertFalse ("Objects are not the same...", s1 == s2);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test the equal method.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void checkIsTheSameStudentByValueTest () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s1 = new Student ();
        s1.setName ("Raul");
        s1.setLastName ("Peña");
        
        Student s2 = new Student ();
        s2.setName ("Raul");
        s2.setLastName ("Peña");
        
        
        // Check the test.
        logger.debug ("Checking " + s1 + " Vs " + s2);
        assertEquals ("Objects are not the same...", s1, s2);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test register process of a new course without interfaces.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void mustRegisterANewCourseOnlineWithoutInterface () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s = new Student ();
        s.setName ("Raul");
        s.setLastName ("Peña");
        
        
        // Create a new educacionit class.
        EducacionItOnline school = new EducacionItOnline ();
        String t = school.register (s);
        
        // Check the test.
        logger.debug ("Checking the result ".concat (t).concat (" of the register for ") + s);
        assertNotNull ("Ticket is null...", t);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test register process of a new course without interfaces.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void mustRegisterANewCourseOnlineWithInterface () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s = new Student ();
        s.setName ("Raul");
        s.setLastName ("Peña");
        
        
        // Create a new educacionit class.
        IEducacionIt school = new EducacionItOnline ();
        String t = school.register (s);
        
        // Check the test.
        logger.debug ("Checking the result ".concat (t).concat (" of the register for ") + s);
        assertNotNull ("Ticket is null...", t);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test register process of a new course without interfaces.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void mustRegisterANewCourseOnSiteWithoutInterface () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s = new Student ();
        s.setName ("Homer");
        s.setLastName ("Simpson");
        
        
        // Create a new educacionit class.
        EducacionItOnSite school = new EducacionItOnSite ();
        String t = school.register (s);
        
        // Check the test.
        logger.debug ("Checking the result ".concat (t).concat (" of the register for ") + s);
        assertNotNull ("Ticket is null...", t);
        logger.info ("Ending test...");
    }
    
    /**
     * 
     *  <p>Method that test register process of a new course without interfaces.
     * 
     *  @see {@link org.junit.Test}
     */
    @Test
    public void mustRegisterANewCourseOnSiteWithInterface () {
    
        
        // Build two student.
        logger.info ("Initializing test...");
        Student s = new Student ();
        s.setName ("Homer");
        s.setLastName ("Simpson");
        
        
        // Create a new educacionit class.
        IEducacionIt school = new EducacionItOnSite ();
        String t = school.register (s);
        
        // Check the test.
        logger.debug ("Checking the result ".concat (t).concat (" of the register for ") + s);
        assertNotNull ("Ticket is null...", t);
        logger.info ("Ending test...");
    }
}