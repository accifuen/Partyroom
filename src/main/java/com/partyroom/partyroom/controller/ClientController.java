package com.partyroom.partyroom.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.partyroom.partyroom.model.Clients;
import com.partyroom.partyroom.service.ClientService;



@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins="*", methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Clients> obtenerClientes(){
        return clientService.obtenerClientes();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Clients salvarCliente(@RequestBody Clients client){
        return clientService.salvarCliente(client);
    }
}
