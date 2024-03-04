package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.Destino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
}
