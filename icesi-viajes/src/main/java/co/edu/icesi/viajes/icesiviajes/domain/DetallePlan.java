package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "detalle_plan")
public class DetallePlan {

    @Id
    @Column(name = "id_depl", nullable = false)
    private Long idDepl;

    @Column(name = "alimentacion", nullable = false, length = 1)
    private String alimentacion;

    @Column(name = "hospedaje", nullable = false, length = 1)
    private String hospedaje;

    @Column(name = "transporte", nullable = false, length = 1)
    private String transporte;

    @Column(name = "traslados", nullable = false, length = 1)
    private String traslados;

    @Column(name = "valor", nullable = false, precision = 19)
    private double valor;

    @Column(name = "cantidad_noches", nullable = false)
    private int cantidadNoches;

    @Column(name = "cantidad_dias", nullable = false)
    private int cantidadDias;

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

    @Column(name = "id_plan", nullable = false)
    private int idPlan;

    @Column(name = "id_dest", nullable = false)
    private int idDest;

}
