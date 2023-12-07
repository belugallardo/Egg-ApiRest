package com.example.ApiRest.converter;

import com.example.ApiRest.dto.ProductDto;
import com.example.ApiRest.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    private final ModelMapper modelMapper;

    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProductDto convertToDto (Product product){
        return modelMapper.map(product, ProductDto.class);
    }

    public Product convertToEntity(ProductDto productDto){
        return modelMapper.map(productDto, Product.class);
    }
}
