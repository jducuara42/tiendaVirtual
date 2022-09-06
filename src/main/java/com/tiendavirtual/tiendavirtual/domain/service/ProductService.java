package com.tiendavirtual.tiendavirtual.domain.service;

import com.tiendavirtual.tiendavirtual.domain.Product;
import com.tiendavirtual.tiendavirtual.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll()
    {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId)
    {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId)
    {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product)
    {
        return productRepository.save(product);
    }

    public boolean delete(int productId)
    {
        if(getProduct(productId).isPresent())
        {
            productRepository.delete(productId);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean update (int productId , Product product)
    {
        Product product1 = getProduct(productId).get();
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
        product1.setActive(product.isActive());
        product1.setPrice(product.getPrice());

        if(getProduct(productId).isPresent())
        {
            save(product1);
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
    public boolean delete(int productId)
    {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }
    * */
}
