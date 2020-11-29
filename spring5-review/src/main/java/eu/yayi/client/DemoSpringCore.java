package eu.yayi.client;

import eu.yayi.domain.Person;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoSpringCore {

    private static final Logger LOGGER = LogManager.getLogger(DemoSpringCore.class);

    public static void main( String[] args )
    {
        System.setProperty("log4j.configurationFile","./log4j2.xml");
        Person p1 = new Person("samir", "romdhani") ;
        final String message = "Logging Powered by LOG4J - Hello logging!";
        LOGGER.info(message);
        LOGGER.info(p1.toString());

        // Start the Spring Container
        try(ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            // Pull the objects from the container
            Person p2 = context.getBean(Person.class);
            LOGGER.info(p2.toString());
        }

    }
}
