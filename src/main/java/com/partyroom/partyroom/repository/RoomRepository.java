package com.partyroom.partyroom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partyroom.partyroom.model.partyroom;
import com.partyroom.partyroom.repository.crudrepository.RoomCrudRepository;

@Repository
public class RoomRepository {
    @Autowired
    private RoomCrudRepository RoomCrudRepository;

    public List<partyroom> obtenerpartyroom(){
        return (List<partyroom>) RoomCrudRepository.findAll();
    }

    public Optional<partyroom> partyroomPorId(int id){
        return RoomCrudRepository.findById(id);
    }

    public partyroom guardarpartyroom (partyroom partyroom){
        return RoomCrudRepository.save(partyroom);
    }
}
