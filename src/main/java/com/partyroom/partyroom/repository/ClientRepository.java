package com.partyroom.partyroom.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partyroom.partyroom.model.Clients;
import com.partyroom.partyroom.repository.crudrepository.ClientCrudRepository;


@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Clients> obtenerClientes() {
        return (List<Clients>) clientCrudRepository.findAll();
    }

    public Clients salvarCliente(Clients client) {
        return clientCrudRepository.save(client);
    }
}
