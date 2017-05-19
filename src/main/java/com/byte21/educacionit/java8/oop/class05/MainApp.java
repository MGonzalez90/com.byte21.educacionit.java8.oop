/*
 * @(#MainApp.java 05/19/2017
 * Copyright 2017 Byte21/Educationit, Inc. All rights reserved.
 * Byte21/Educacionit/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.oop.class05;


// Packages and classes to import of apache log4j.
import org.apache.log4j.Logger;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.oop.class05.MainApp</code> 
 *     is the main app of this course (number class 4).
 *  
 *  @author  Raul Geomar Pena (raul.pena@gmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   05/19/2017
 * */
public final class MainApp {
    
    
    // Private class fields declarations.
    // Logger object.
    private static final Logger logger = Logger.getLogger (ELearnigApp.class);
    
    
    // private constructor declarations.
    /**
     * 
     *  <p>Unique constructor without arguments.
     */
    private MainApp () {
        
        // Call to super class.
        super ();
    }
    
    
    // Public static methods declarations.
    /**
     * 
     *  <p>Method that build a new elearning app style online.
     * 
     *  @return new elearning app.
     */
    public static ELearnigApp buildOnlineApp () {
        
        // Build a new elearning app.
        ELearnigApp app = new ELearnigApp ("Remote Education");
        
        
            // Set the requeriments
            
            // Add notifications object.
            /*
             * This example for send notifications works 
             * using anonymous classes.
             */
            app.setCommunicator (new ICommunicator () {
                
                @Override
                public void send (String arg) {
                    
                    // Send a message.
                    logger.info (arg.concat (" this message was sent using anonymous classes !!!"));
                }
            });
        
            
        // Return a new app.
        return app;
    }
    
    /**
     * 
     *  <p>Method that build a new elearning app style onsite.
     * 
     *  @return new elearning app.
     */
    public static ELearnigApp buildOnsiteApp () {
        
        // Build a new elearning app.
        ELearnigApp app = new ELearnigApp ("Microcentro offices");
        
        
            // Set the requeriments
            
            // Add notifications object.
            /*
             * This example for send notifications works 
             * using lambda expressions classes.
             */
            app.setCommunicator ( e -> logger.info (e.concat (" this message was sent using lambda expressions !!!")));
        
            
        // Return a new app.
        return app;
    }
    
    /**
     * 
     *  <p>Method that build a new elearning app style personal home.
     * 
     *  @return new elearning app.
     */
    public static ELearnigApp buildPersonalHomeApp () {
        
        // Build a new elearning app.
        ELearnigApp app = new ELearnigApp ("Personal Home App");
        
        
            // Set the requeriments
            
            // Add notifications object.
            /*
             * This example for send notifications works 
             * using lambda expressions classes.
             */
            app.setCommunicator (new StaticClassComunicator ());
        
            
        // Return a new app.
        return app;
    }
    
    
    // Private static classes declarations.
    /**
      * 
      *  <p>The class <code>com.byte21.educacionit.java8.oop.class05.MainApp#StaticClassComunicator</code> 
      *     as a implementations of a notificator.
      *  
      *  @author  Raul Geomar Pena (raul.pena@gmail.com)
      *  @version 1.0.0
      *  @since   jdk 1.8
      *  @since   05/19/2017
      * */
    private static class StaticClassComunicator implements ICommunicator {
        
        
        // Public constructor declarations.
        /**
         * 
         *  <p>Unique constructor without arguments.
         */
        public StaticClassComunicator () {
        
            // Call to super class.
            super ();
        }
        
        
        // Public instance methods declarations extended of com.byte21.educacionit.java8.oop.class05.ICommunicator
        /* (non-Javadoc)
         * @see com.byte21.educacionit.java8.oop.class05ICommunicator#send (java.lang.String)
         */
        @Override
        public void send (String arg) {
                    
            // Send a message.
            logger.info (arg.concat (" this message was sent an using static inner classes !!!"));
        }
    }
}
