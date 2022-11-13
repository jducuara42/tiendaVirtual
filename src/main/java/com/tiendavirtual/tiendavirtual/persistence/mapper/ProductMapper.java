package com.tiendavirtual.tiendavirtual.persistence.mapper;

import com.tiendavirtual.tiendavirtual.domain.Product;
import com.tiendavirtual.tiendavirtual.persistence.entity.tbProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper
{
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "tituloProducto", target = "name"),
            @Mapping(source = "descripcionProducto", target = "description"),
            @Mapping(source = "precioProducto", target = "price"),
            @Mapping(source = "estadoProducto", target = "active"),
            @Mapping(source = "imagenProducto", target = "image"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "categoria", target = "category"),
    })
    Product toProduct(tbProducto producto);
    List<Product> toProducts(List<tbProducto> productos);

    @InheritInverseConfiguration
    tbProducto toProducto(Product product);
}
