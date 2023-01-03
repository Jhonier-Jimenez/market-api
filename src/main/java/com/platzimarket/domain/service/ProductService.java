package com.platzimarket.domain.service;

import com.platzimarket.domain.Product;
import com.platzimarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(Integer productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(Integer categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product saveProduct(Product product){
        return productRepository.saveProduct(product);
    }

    public boolean deleteProduct(Integer productId){

/*        return getProduct(productId).map(product -> {
            productRepository.deleteProduct(productId);
            return true;
        }).orElse(false);*/

        if (getProduct(productId).isPresent()){
            productRepository.deleteProduct(productId);
            return true;
        }
        return false;
    }
}
