package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import dto.TipoDestinoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Long> {

    @Query(nativeQuery = true)
    public List<TipoDestinoDTO> consultarTipoDestinoPorEstado(@Param("pEstado")String estado);

    @Query("select tp from TipoDestino tp where tp.estado = ?1")
    public List<TipoDestino> consultarTipo(String estado);
}
