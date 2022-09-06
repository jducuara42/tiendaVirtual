package com.tiendavirtual.tiendavirtual.persistence;

import com.tiendavirtual.tiendavirtual.domain.Product;
import com.tiendavirtual.tiendavirtual.persistence.crud.ProductoCRUDRepository;
import com.tiendavirtual.tiendavirtual.persistence.entity.tbProducto;
import com.tiendavirtual.tiendavirtual.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tiendavirtual.tiendavirtual.domain.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository
{
    @Autowired
    private ProductoCRUDRepository productoCRUDRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll()
    {
        List<tbProducto> productos = (List<tbProducto>) productoCRUDRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId)
    {
        List<tbProducto> productos = productoCRUDRepository.findByIdCategoria(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getCheap(int quantity)
    {
        Optional<List<tbProducto>> productos = productoCRUDRepository.findByPrecioProductoLessThanAndEstadoProducto(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId)
    {
        return productoCRUDRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product)
    {
        tbProducto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCRUDRepository.save(producto));
    }

    @Override
    public void delete(int productId)
    {
        productoCRUDRepository.deleteById(productId);
    }
}
