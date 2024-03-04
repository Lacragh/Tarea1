package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.DetallePlan;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePlanRepository extends JpaRepository<DetallePlan, Long> {
}
