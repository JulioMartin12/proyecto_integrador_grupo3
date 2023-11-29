package org.example.services;

import org.example.controllers.ClienteController;
import org.example.models.Cliente;

import java.util.List;

public class ClienteService {
    private ClienteController clienteController;

    public ClienteService() {
        this.clienteController = new ClienteController();
    }

    public  void crear(Cliente cliente){
        clienteController.create(cliente);
    }

    public List<Cliente> findAll(){
        return clienteController.findAll();
    }
}
