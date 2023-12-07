/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiRest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author belugallardo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDto {
   
    private long idClient;
    private String name;
    private String phone;
    private String email;
    private boolean active;


}
