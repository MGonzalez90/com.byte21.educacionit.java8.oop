/*
 * @(#ICommunicator.java 05/19/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class05;


/**
 * 
 *  <p>The abstract class <code>com.byte21.educacionit.java8.oop.class05.ICommunicator</code> 
 *     is a interface that define methods for send communications.
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/19/2017
 * */
public interface ICommunicator {
    
    
    // Method declarations.
    /**
     * 
     *  <p>Method that send a message information.
     * 
     *  @param arg Message to send.
     */
    void send (String arg);
}