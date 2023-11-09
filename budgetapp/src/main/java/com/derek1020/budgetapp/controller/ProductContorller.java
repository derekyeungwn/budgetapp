package com.derek1020.budgetapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.derek1020.budgetapp.model.Product;
import com.derek1020.budgetapp.service.ProductService;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductContorller {
	
	@PostConstruct
	//Execute after the creation of the controller
	private void init() {
		
	}
	
	@Autowired
    private ProductService productService;

	//Get
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") String id) {
    	Product product = productService.getProduct(id);
    	if(product != null)
    		return ResponseEntity.ok().body(product);
    	else
    		return ResponseEntity.notFound().build();
    }
    
    //name="derek"&name2="mary"
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam(value = "name", defaultValue = "123") String name,
            @RequestParam(value = "name2", defaultValue = "") String name2) {
    	System.out.println(name);
    	System.out.println(name2);
    	return null;
    }
    
    //Add to MAP
    @PostMapping("/product2")
    public @ResponseBody void testPost(@RequestBody Map<String,String> product){
    	System.out.println(product.get("name"));
    	System.out.println(product);
    }
    
    //Add to POJO
    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product request) {
    	Product product = new Product();
        product.setId(request.getId());
        product.setName(request.getName());
        return ResponseEntity.ok().body(product); 
    }
     
    //Update
    @PutMapping("/{id}")
    public ResponseEntity<Product> replaceProduct(
            @PathVariable("id") String id, @RequestBody Product request) {
    	Product product = request;
    	return ResponseEntity.ok().body(product);
	}
    
    //Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") String id) {
    	return ResponseEntity.notFound().build();
    }

}
