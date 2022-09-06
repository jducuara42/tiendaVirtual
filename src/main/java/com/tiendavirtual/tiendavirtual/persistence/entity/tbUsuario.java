package com.tiendavirtual.tiendavirtual.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "tb_usuarios")
public class tbUsuario
{
    //Creacion de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "correo_usuario")
    private String correoUsuario;

    @Column(name = "contrasena_usuario")
    private String contrasenaUsuario;

    @Column(name = "telefono_usuario")
    private String telefonoUsuario;

    @Column(name = "creacion_usuario")
    private LocalDateTime creacionUsuario;

    @OneToMany(mappedBy = "cliente")
    private List<tbVenta> ventas;

    public tbUsuario() {
    }

    //Getter y setter para los atributos
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public LocalDateTime getCreacionUsuario() {
        return creacionUsuario;
    }

    public void setCreacionUsuario(LocalDateTime creacionUsuario) {
        this.creacionUsuario = creacionUsuario;
    }
}
