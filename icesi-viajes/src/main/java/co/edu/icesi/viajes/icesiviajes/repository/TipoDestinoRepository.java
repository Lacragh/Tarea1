package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Long> {

    public List<TipoDestino> consultar
}
