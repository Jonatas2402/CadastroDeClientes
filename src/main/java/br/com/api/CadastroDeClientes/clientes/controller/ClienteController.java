package br.com.api.CadastroDeClientes.clientes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {

    //Método para boas vindas.
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Boas Vindas a minha API";
    }
}
