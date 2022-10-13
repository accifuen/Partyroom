package com.partyroom.partyroom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partyroom.partyroom.model.partyroom;
import com.partyroom.partyroom.repository.RoomRepository;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository RoomRepository;
    
    public List<partyroom> obtenerpartyroom(){
        return RoomRepository.obtenerpartyroom();
    }

    public Optional<partyroom> partyroomPorId(int id){
        return RoomRepository.partyroomPorId(id);
    } 
    
    public partyroom guardarpartyroom(partyroom partyroom) {
        if (partyroom.getId() == null) {
            return RoomRepository.guardarpartyroom(partyroom);
        } else {
            Optional<partyroom> partyroom1 = RoomRepository.partyroomPorId(partyroom.getId());
            if (partyroom1.isEmpty()) {
                return RoomRepository.guardarpartyroom(partyroom);
            } else {
                return partyroom;
            }
        }
    }

}
