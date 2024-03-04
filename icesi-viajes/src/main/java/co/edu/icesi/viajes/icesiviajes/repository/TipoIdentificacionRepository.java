package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {
}
