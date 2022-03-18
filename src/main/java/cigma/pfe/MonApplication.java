package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Facture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class MonApplication {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("ctrl");
        FactureController fctrl = (FactureController) context.getBean("fctrl");

        fctrl.saveFacture(new Facture((new Date(2022 - 1900, 02, 15)), 20));
        fctrl.saveFacture(new Facture(new Date(2021 - 1900, 05, 30), 40));
        fctrl.modifierFacture(new Facture(new Date(2019, 05, 11), 70));
        fctrl.getAllFactures(new Date(2022, 02, 15));
        fctrl.getFacturebyId(2);
        fctrl.findAllFactures();

    }
}
