package br.com.adopet;

import java.io.IOException;

import br.com.adopet.client.ClientHttpConfiguration;
import br.com.adopet.service.AbrigoService;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {

        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);
            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
