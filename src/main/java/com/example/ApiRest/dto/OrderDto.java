package com.example.ApiRest.dto;

import com.example.ApiRest.entity.Client;
import com.example.ApiRest.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private Client client;
    private LocalDate date;
    private List<Product> listProduct;


}
