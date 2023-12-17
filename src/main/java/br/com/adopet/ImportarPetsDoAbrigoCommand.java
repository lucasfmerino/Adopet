package br.com.adopet;

import java.io.IOException;

import br.com.adopet.client.ClientHttpConfiguration;
import br.com.adopet.service.PetService;

public class ImportarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petservice = new PetService(client);
            petservice.ImportarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
