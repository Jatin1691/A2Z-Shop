package com.ecom.service;

import com.ecom.dto.ProductDTO;
import com.ecom.model.Product;
import com.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
   public List<Product> findAllProduct(){
       return productRepository.findAll();
   }

   public void addProduct(Product product){
       productRepository.save(product);
   }

   public void removeProduct(long id){
       productRepository.deleteById(id);
   }

   public Optional<Product> getProductById(long id){
       return productRepository.findById(id);
   }

   public List<Product> getAllProductCategoryById(int id){
       return productRepository.findAllByCategory_Id(id);
   }


}
