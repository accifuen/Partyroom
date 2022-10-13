package com.partyroom.partyroom.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partyroom.partyroom.model.Message;
import com.partyroom.partyroom.repository.crudrepository.MessageCrudRepository;



@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> obtenerMensajes() {
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Message salvarMessage(Message message) {
        return messageCrudRepository.save(message);
    }
}
