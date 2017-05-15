/*
 * @(#Student.java 05/15/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class01;


// Packages and classes to import from jdk 1.8
import java.util.Map;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class01.Student</code> 
 *     is a POJOs class for management student information.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/15/2017
 * */
public class Student {
 
    // Public instance fields declarations.
    // DNI
    public int dni = 0;
    
    // Student name.
    public String name = "";
    
    // Student last name.
    public String lastName = "";    
    
    // Phones.
    public Map<String, Phone>      phones = null;
    
    // Addresses.
    public Map<String, Address> addresses = null;
}