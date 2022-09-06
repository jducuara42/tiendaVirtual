package com.tiendavirtual.tiendavirtual.persistence.crud;

import com.tiendavirtual.tiendavirtual.persistence.entity.tbProducto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCRUDRepository extends CrudRepository<tbProducto, Integer>
{
    List<tbProducto> findByIdCategoria(int idCategoria);

    Optional<List<tbProducto>> findByPrecioProductoLessThanAndEstadoProducto(int precioProducto, boolean estadoProducto);
}
