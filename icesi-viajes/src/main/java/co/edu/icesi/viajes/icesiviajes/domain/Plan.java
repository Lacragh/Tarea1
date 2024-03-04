package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "plan")
public class Plan {

    @Id
    @Column(name = "id_plan", nullable = false)
    private Long idPlan;

    @Column(name = "codigo", nullable = false, length = 5)
    private String codigo;

    @Column(name = "descripcion_solicitud", nullable = false, length = 300)
    private String descripcionSolicitud;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "cantidad_personas", nullable = false)
    private int cantidadPersonas;

    @Column(name = "fecha_solicitud", nullable = false)
    private Date fechaSolicitud;

    @Column(name = "fecha_inicio_viaje")
    private Date fechaInicioViaje;

    @Column(name = "fecha_fin_viaje")
    private Date fechaFinViaje;

    @Column(name = "valor_total", nullable = false, precision = 19)
    private double valorTotal;

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

    @Column(name = "id_clie", nullable = false)
    private int idClie;

    @Column(name = "id_usua", nullable = false)
    private int idUsua;

}
