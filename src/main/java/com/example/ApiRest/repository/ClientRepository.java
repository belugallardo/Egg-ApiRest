/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ApiRest.repository;

import com.example.ApiRest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author belugallardo
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
