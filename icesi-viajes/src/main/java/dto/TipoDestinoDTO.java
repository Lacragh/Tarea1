package dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

public class TipoDestinoDTO implements Serializable {

    private static final Long serialVersionUID = 42L;

    private Integer idTide;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;

    public TipoDestinoDTO(Integer idTide, String codigo, String nombre, String descripcion) {
        this.idTide = idTide;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getIdTide() {
        return idTide;
    }

    public void setIdTide(Integer idTide) {
        this.idTide = idTide;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuCreador() {
        return usuCreador;
    }

    public void setUsuCreador(String usuCreador) {
        this.usuCreador = usuCreador;
    }

    public String getUsuModificador() {
        return usuModificador;
    }

    public void setUsuModificador(String usuModificador) {
        this.usuModificador = usuModificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
