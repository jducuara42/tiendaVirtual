package com.tiendavirtual.tiendavirtual.web.controller;

import com.tiendavirtual.tiendavirtual.domain.Product;
import com.tiendavirtual.tiendavirtual.domain.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping("/products")
public class ProductController
{
    @Autowired
    private ProductService productService;

    @CrossOrigin
    @GetMapping("/all")
    public List<Product> getAll()
    {
        return productService.getAll();
    }

    @CrossOrigin
    @GetMapping("/{productId}")
    public Optional<Product> getProduct(@PathVariable("productId") int productId)
    {
        return productService.getProduct(productId);
    }

    @GetMapping("/category/{categoryId}")
    public Optional<List<Product>> getByCategory(@PathVariable("categoryId") int categoryId)
    {
        return productService.getByCategory(categoryId);
    }

    @CrossOrigin
    @PostMapping("/save")
    public Product save (@RequestBody Product product)
    {
        return productService.save(product);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{productId}")
    public boolean delete (@PathVariable("productId") int productId)
    {
        return productService.delete(productId);
    }

    @CrossOrigin
    @PutMapping("/update/{id}")
    public boolean update (@PathVariable("id") int productId, @RequestBody Product product)
    {
        boolean saveState = productService.update(productId, product);
        if (saveState)
        {
            Product updateState = productService.save(product);
            return true;
        }
        else
        {
            return false;
        }
    }
}
