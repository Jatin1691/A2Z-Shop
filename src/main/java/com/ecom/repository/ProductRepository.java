package com.ecom.repository;

import com.ecom.dto.ProductDTO;
import com.ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findAllByCategory_Id(int id);
}
