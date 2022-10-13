package com.partyroom.partyroom.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.partyroom.partyroom.model.partyroom;
import com.partyroom.partyroom.service.RoomService;

@RestController
@RequestMapping("/api/partyroom")
@CrossOrigin(origins="*", methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class RoomController {
    
    @Autowired
    private RoomService RoomService;

 
    @GetMapping("/all")
    public List<partyroom> obtenerListapartyroom(){
        return RoomService.obtenerpartyroom();
    }

    @GetMapping("/{id}")  // {}  son variables digitarlas
    public Optional<partyroom> partyroomPorId(@PathVariable("id") int partyroom){
        return RoomService.partyroomPorId(partyroom);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public partyroom agregarRoom(@RequestBody partyroom partyroom){
        return RoomService.guardarpartyroom(partyroom);
    }

}
