package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository ;
    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }

}



