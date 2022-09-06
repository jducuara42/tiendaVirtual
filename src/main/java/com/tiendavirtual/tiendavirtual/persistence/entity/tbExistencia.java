package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_existencias")
public class tbExistencia
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_existencia")
    private Integer idProducto;

    @Column(name = "cantidad_exisitencia")
    private Integer precioProducto;

    @Column(name = "fecha_existencia")
    private LocalDateTime fechaExistencia;

    @ManyToOne
    @JoinColumn(name = "id_producto_existencia", insertable = false, updatable = false)
    private tbProducto producto;

    public Integer getIdProducto()
    {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto)
    {
        this.idProducto = idProducto;
    }

    public Integer getPrecioProducto()
    {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto)
    {
        this.precioProducto = precioProducto;
    }

    public LocalDateTime getFechaExistencia()
    {
        return fechaExistencia;
    }

    public void setFechaExistencia(LocalDateTime fechaExistencia)
    {
        this.fechaExistencia = fechaExistencia;
    }
}
