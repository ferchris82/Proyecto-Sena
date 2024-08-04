package com.chrisferdev.farmacia.backend.infrastructure.config;

import com.chrisferdev.farmacia.backend.application.*;
import com.chrisferdev.farmacia.backend.domain.port.ICategoryRepository;
import com.chrisferdev.farmacia.backend.domain.port.IOrderRepository;
import com.chrisferdev.farmacia.backend.domain.port.IProductRepository;
import com.chrisferdev.farmacia.backend.domain.port.IUserRepository;
import com.chrisferdev.farmacia.backend.infrastructure.adapter.IProductCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);
    }

    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }

    @Bean
    public ProductService productService(IProductRepository iProductRepository, UploadFile uploadFile){
        return new ProductService(iProductRepository, uploadFile);
    }

    @Bean
    public OrderService orderService(IOrderRepository iOrderRepository){
        return new OrderService(iOrderRepository);
    }

    @Bean
    public UploadFile uploadFile(){
        return new UploadFile();
    }
}
