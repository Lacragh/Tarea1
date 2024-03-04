package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.Plan;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}

