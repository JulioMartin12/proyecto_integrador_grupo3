package org.example.controllers;

import org.example.DAO.ClienteDAO;
import org.example.models.Cliente;
import org.example.models.Especialidad;
import org.example.models.Tecnico;

import java.util.List;

public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    public void create(Cliente cliente) {
        clienteDAO.create(cliente); }

    public Cliente update(Cliente cliente) {
        return clienteDAO.update(cliente);
    }

    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }

    public List<Cliente> findAll(){
        return this.clienteDAO.findAll();
    }
}
