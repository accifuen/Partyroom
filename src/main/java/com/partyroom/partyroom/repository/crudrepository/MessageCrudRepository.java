package com.partyroom.partyroom.repository.crudrepository;



import org.springframework.data.repository.CrudRepository;

import com.partyroom.partyroom.model.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
    
}
