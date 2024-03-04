package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id_usua", nullable = false)
    private Long idUsua;

    @Column(name = "login", nullable = false, length = 10)
    private String login;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "identificacion", nullable = false, length = 15)
    private String identificacion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false, length = 10)
    private String usuCreador;

    @Column(name = "usu_modificador", length = 10)
    private String usuModificador;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

}

