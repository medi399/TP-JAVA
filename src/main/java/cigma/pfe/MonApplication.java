package cigma.pfe;
import cigma.pfe.contollers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
        // ClientController ctrl1 = new ClientController();
        // Client client =new Client(1L,"testing");
        // ctrl1.save(client);

        // Au cas ou le scope = singleton
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Au cas ou le scope = prototype
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        Client client = new Client(1,"elorfi");
        ctrl.save(client);

    }
}
