package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_producto")
public class tbProducto
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "titulo_producto")
    private String tituloProducto;

    @Column(name = "descripcion_producto")
    private String descripcionProducto;

    @Column(name = "precio_producto")
    private Integer precioProducto;

    @Column(name = "id_categoria_producto")
    private Integer idCategoria;

    @Column(name = "estado_producto")
    private Boolean estadoProducto;

    @ManyToOne
    @JoinColumn(name = "id_categoria_producto", insertable = false, updatable = false)
    private tbCategoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<tbExistencia> existencias;

    @OneToMany(mappedBy = "producto")
    private List<tbDetalleVenta> detalleVentas;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getTituloProducto() {
        return tituloProducto;
    }

    public void setTituloProducto(String tituloProducto) {
        this.tituloProducto = tituloProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Boolean getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public tbCategoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(tbCategoria categoria)
    {
        this.categoria = categoria;
    }


    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
