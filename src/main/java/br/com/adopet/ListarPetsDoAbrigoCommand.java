package br.com.adopet;

import java.io.IOException;

import br.com.adopet.client.ClientHttpConfiguration;
import br.com.adopet.service.PetService;

public class ListarPetsDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petservice = new PetService(client);
            petservice.listarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
