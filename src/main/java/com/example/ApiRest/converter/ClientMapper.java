/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiRest.converter;

import com.example.ApiRest.dto.ClientDto;
import com.example.ApiRest.entity.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author belugallardo
 */
@Component
public class ClientMapper {
    private final ModelMapper modelMapper;

    public ClientMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClientDto convertToDto(Client client) {
        return modelMapper.map(client, ClientDto.class);
    }

    public Client convertToEntity(ClientDto clientDto) {
        return modelMapper.map(clientDto, Client.class);
    }

    public List<ClientDto> convertToDtoList(List<Client> clients) {
        return clients.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
}
