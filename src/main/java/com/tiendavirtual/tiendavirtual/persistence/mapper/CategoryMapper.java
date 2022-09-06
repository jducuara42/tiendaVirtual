package com.tiendavirtual.tiendavirtual.persistence.mapper;

import com.tiendavirtual.tiendavirtual.domain.Category;
import com.tiendavirtual.tiendavirtual.persistence.entity.tbCategoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper
{
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcionCategoria", target = "category"),
            @Mapping(source = "estadoCategoria", target = "active"),
    })
    Category toCategory(tbCategoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    tbCategoria toCategoria(Category category);
}
