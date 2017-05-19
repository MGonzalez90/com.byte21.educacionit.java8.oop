/*
 * @(#AllTests.java 05/19/2017
 * Copyright 2015 Byte21, Inc. All rights reserved.
 * byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.test;


// Packages and classes to import of junit 4.x
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.test.AllTests</code> is a junit for run all junit test.   
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/19/2017
 *  
 *  @see {@link org.junit.runner.RunWith}
 *  @see {@link org.junit.runners.Suite.SuiteClasses}
 * */
@RunWith (Suite.class)
@SuiteClasses ({ELearningAppTest.class, StudentTest.class})
public class AllTests {

	
    // Public constructor declarations.
    /**
     * 
     *  <p>Unique constructor without parameters.
     * */
    public AllTests () {
		
	// Call to super class.
        super ();
    }
}