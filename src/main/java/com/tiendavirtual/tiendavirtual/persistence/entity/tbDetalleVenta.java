package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_detalle_venta")
public class tbDetalleVenta
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
    private Integer idDetalleVenta;

    @Column(name = "cantidad_detalle")
    private Integer cantidadDetalle;

    @Column(name = "impuesto_detalle")
    private Float impuestoDetalle;

    @ManyToOne
    @JoinColumn(name = "id_detalle_venta_producto", insertable = false, updatable = false)
    private tbProducto producto;

    @ManyToOne
    @JoinColumn(name = "id_detalle_venta_venta", insertable = false, updatable = false)
    private tbVenta venta;

    public Integer getIdDetalleVenta()
    {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta)
    {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Integer getCantidadDetalle()
    {
        return cantidadDetalle;
    }

    public void setCantidadDetalle(Integer cantidadDetalle)
    {
        this.cantidadDetalle = cantidadDetalle;
    }

    public Float getImpuestoDetalle()
    {
        return impuestoDetalle;
    }

    public void setImpuestoDetalle(Float impuestoDetalle)
    {
        this.impuestoDetalle = impuestoDetalle;
    }
}
