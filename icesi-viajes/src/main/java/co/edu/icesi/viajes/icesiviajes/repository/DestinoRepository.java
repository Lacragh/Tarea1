package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.Destino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DestinoRepository extends JpaRepository<Destino, Long> {

    //Consulta #11
    @Query("select dt from Destino dt where dt.codigo = ?1 AND dt.estado = ?2")
    public List<Destino> consultarDestinoPorEstado(String codigo, String estado);

    //Consulta #12
    public List<Destino> findByIdTide(Integer idTipoDestino);

    //Consulta #13
    @Query("select dt.idTide from Destino dt where dt.estado = ?1")
    public List<Destino> consultarDestinosActivos(String estado);
}
