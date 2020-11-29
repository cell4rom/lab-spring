package eu.yayi.client;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import eu.yayi.business.IPersenBusiness;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@Component
public class Demo2SpringCore {

    private static final Logger LOGGER = LogManager.getLogger(Demo2SpringCore.class);

    //@Autowired(required = true)
    private IPersenBusiness businness ;

    public Demo2SpringCore(IPersenBusiness businness) {
        this.businness = businness;
    }

    public static void main( String[] args )
    {
        // Start the Spring Container
        try(ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            // Pull the objects from the container
            Demo2SpringCore client = context.getBean(Demo2SpringCore.class);
            LOGGER.info("ALL .... "+client.businness.getRondomPerson());
        }

    }
}
