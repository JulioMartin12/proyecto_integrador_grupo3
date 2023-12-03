package org.example.DAO;

import org.example.models.Cliente;

public class ClienteDAO  extends  AbstractJpaDAO<Cliente, String>{
    public ClienteDAO() { setClase(Cliente.class);
    }
}
