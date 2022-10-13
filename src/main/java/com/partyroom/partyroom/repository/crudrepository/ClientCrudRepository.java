package com.partyroom.partyroom.repository.crudrepository;



import org.springframework.data.repository.CrudRepository;

import com.partyroom.partyroom.model.Clients;


public interface ClientCrudRepository extends CrudRepository<Clients,Integer> {
    
}
