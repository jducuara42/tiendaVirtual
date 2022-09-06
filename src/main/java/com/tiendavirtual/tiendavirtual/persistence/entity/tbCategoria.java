package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_categorias")
public class tbCategoria
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "descripcion_categoria")
    private String descripcionCategoria;

    @Column(name = "estado_categoria")
    private Boolean estadoCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<tbProducto> productos;

    public List<tbProducto> getProductos()
    {
        return productos;
    }

    public void setProductos(List<tbProducto> productos)
    {
        this.productos = productos;
    }

    public Integer getIdCategoria()
    {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria)
    {
        this.idCategoria = idCategoria;
    }

    public String getDescripcionCategoria()
    {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria)
    {
        this.descripcionCategoria = descripcionCategoria;
    }

    public Boolean getEstadoCategoria()
    {
        return estadoCategoria;
    }

    public void setEstadoCategoria(Boolean estadoCategoria)
    {
        this.estadoCategoria = estadoCategoria;
    }
}
