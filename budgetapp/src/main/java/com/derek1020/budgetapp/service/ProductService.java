package com.derek1020.budgetapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derek1020.budgetapp.Repository.ProductRepository;
import com.derek1020.budgetapp.exception.NotFoundException;
import com.derek1020.budgetapp.exception.UnprocessableEntityException;
import com.derek1020.budgetapp.model.Product;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepository repository;
	
	public Product getProduct(String id) {	
		return repository.findById(id).orElse(null);
	}
	
	public Product createProduct(Product request) {
	    Product product = new Product();
	    product.setName(request.getName());
	    return repository.insert(product);
	}
	
	//If cannot find, then insert
	//if find, then update
	public Product replaceProduct(String id, Product request) {
	    Product oldProduct = getProduct(id);
	    Product product = new Product();
	    product.setId(oldProduct.getId());
	    product.setName(request.getName());
	    return repository.save(product);
	}
	
	//No exception will be thrown if cannot find a result with id
	public void deleteProduct(String id) {
	    repository.deleteById(id);
	}
}
