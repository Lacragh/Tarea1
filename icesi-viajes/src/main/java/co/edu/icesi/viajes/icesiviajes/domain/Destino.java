package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "destino")
public class Destino {

    @Id
    @Column(name = "id_dest", nullable = false)
    private Long idDest;

    @Column(name = "codigo", nullable = false, length = 5)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 300)
    private String descripcion;

    @Column(name = "tierra", nullable = false, length = 1)
    private String tierra;

    @Column(name = "aire", nullable = false, length = 1)
    private String aire;

    @Column(name = "mar", nullable = false, length = 1)
    private String mar;

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

    @Column(name = "id_tide", nullable = false)
    private int idTide;

}

