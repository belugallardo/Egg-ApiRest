/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiRest.service;

import com.example.ApiRest.dto.ClientDto;
import com.example.ApiRest.converter.ClientMapper;
import com.example.ApiRest.entity.Client;

import com.example.ApiRest.exception.MyException;
import com.example.ApiRest.repository.ClientRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author belugallardo
 */
@Service
public class ClientService {
    
    @Autowired 
    ClientRepository clientRepository;
    
    @Autowired
    private ClientMapper clientMapper;
    
    
    @Transactional
    public void addClient(ClientDto clientDto) throws MyException{
        
    // Convierte el DTO a la entidad Client utilizando ModelMapper
        Client client = clientMapper.convertToEntity(clientDto);

        clientRepository.save(client);
   
    }
    
    @Transactional
    public void upDateClient(Long id, ClientDto clientDto){
        Optional<Client> existClient = clientRepository.findById(id);
        
        if(existClient.isPresent()){
            Client client = existClient.get();
            client.setName(String.valueOf(clientDto));
        }
    }
    
}
