package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_carrito")
public class tbCarrito
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrito")
    private Integer idCarrito;

    @Column(name = "fecha_carrito")
    private LocalDateTime fechaCarrito;

}
