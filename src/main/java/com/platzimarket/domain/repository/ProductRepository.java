package com.platzimarket.domain.repository;

import com.platzimarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(Integer categoryId);
    Optional<List<Product>> findByIdCategory(Integer categoryId);
    Optional<List<Product>> getLowStock(int quantity);
    Optional<Product> getProduct(Integer productId);
    Product saveProduct(Product product);
    void deleteProduct(Integer productId);

}
