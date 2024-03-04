package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "id_clie", nullable = false)
    private Long idClie;

    @Column(name = "numero_identificacion", nullable = false, length = 15)
    private String numeroIdentificacion;

    @Column(name = "primer_apellido", nullable = false, length = 100)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 100)
    private String segundoApellido;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "telefono1", length = 15)
    private String telefono1;

    @Column(name = "telefono2", length = 15)
    private String telefono2;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

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

    @Column(name = "id_tiid", nullable = false)
    private int idTiid;

}

