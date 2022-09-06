package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_venta")
public class tbVenta
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Integer idVenta;

    @Column(name = "fecha_venta")
    private LocalDateTime fechaVenta;

    @Column(name = "valor_total_venta")
    private Integer valorTotalVenta;

    @ManyToOne
    @JoinColumn(name = "usuario_venta", insertable = false, updatable = false)
    private tbUsuario cliente;

    @OneToMany(mappedBy = "venta")
    private List<tbDetalleVenta> detalleVentas;

    public Integer getIdVenta()
    {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta)
    {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFechaVenta()
    {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta)
    {
        this.fechaVenta = fechaVenta;
    }

    public Integer getValorTotalVenta()
    {
        return valorTotalVenta;
    }

    public void setValorTotalVenta(Integer valorTotalVenta)
    {
        this.valorTotalVenta = valorTotalVenta;
    }
}
