package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {
    //Consulta #1
    @Query("select ti from TipoIdentificacion ti where ti.estado = ?1 ORDER BY ti.nombre")
    public List<TipoIdentificacion> consultarTipoIdentificacionPorEstado(String estado);

    //Consulta #7
    @Query("select ti from TipoIdentificacion ti where ti.codigo = ?1 AND ti.estado = ?2")
    public List<TipoIdentificacion> consultarTipoIdentificacionPorEstadoCodigo(String codigo, String estado);
}
