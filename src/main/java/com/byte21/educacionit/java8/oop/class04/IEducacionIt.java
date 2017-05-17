/*
 * @(#IEducacionIt.java 05/17/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class04;


/**
 * 
 *  <p>The abstract class <code>com.byte21.educacionit.java8.oop.class04.IEducacionIt</code> 
 *     is a interface for define schools' methods.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/17/2017
 * */
public interface IEducacionIt {
    
    
    // Method declarations.
    /**
     * 
     *  <p>Method that register a new student inside a course.
     * 
     *  @param student Student object.
     *  @return id number ticket. 
     */
    String register (Student student);
}
