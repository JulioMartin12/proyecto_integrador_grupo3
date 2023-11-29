package org.example.DAO;

import org.example.models.Cliente;

public class ClienteDAO  extends  AbstractJpaDAO<Cliente>{
    public ClienteDAO() { setClazz(Cliente.class);
    }
}
