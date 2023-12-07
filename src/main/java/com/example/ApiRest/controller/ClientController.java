package com.example.ApiRest.controller;

import com.example.ApiRest.dto.ClientDto;
import com.example.ApiRest.exception.MyException;
import com.example.ApiRest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/clients")
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> addClient(@RequestBody ClientDto clientDto) throws MyException {
        System.out.println(clientDto.toString());
        clientService.addClient(clientDto);
        return new ResponseEntity<>("Client added successfully " + clientDto.toString(), HttpStatus.CREATED);

    }


}
