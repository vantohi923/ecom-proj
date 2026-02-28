package com.example.ecom_proj.repo;

import com.example.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository <Product, Integer>{

    public List<Product> findByBrand(String brand);
}
fwfrhd