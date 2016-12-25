package fr.kdefombelle.assembly;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dummy main application
 * 
 * @author kdefombelle
 */
public class Example2Main 
{
	
    private static Logger LOGGER = LoggerFactory.getLogger(Example2Main.class);
    
    public static void main( String[] args )
    {
    	LOGGER.info( "Let's print the properties from a file common.properties in the classpath" );
    	ResourceBundle bundle = ResourceBundle.getBundle("common");
    	bundle.keySet().stream().sorted().forEach(k -> LOGGER.info("{}:{}", k, bundle.getString(k)));
    	LOGGER.info( "It is not this maion class which is interesting in this example" );
    	LOGGER.info( "It is the fact the assembly in this project is based on a common descriptor in assembly-component module" );
    }
}
