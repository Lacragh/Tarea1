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

    public Destino(Long idDest, String codigo, String nombre, String descripcion, String tierra, String aire, String mar, Date fechaCreacion, Date fechaModificacion, String usuCreador, String usuModificador, String estado, int idTide) {
        this.idDest = idDest;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tierra = tierra;
        this.aire = aire;
        this.mar = mar;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.estado = estado;
        this.idTide = idTide;
    }

    public Destino(){

    }
}

