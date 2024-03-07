package co.edu.icesi.viajes.icesiviajes.domain;

import co.edu.icesi.viajes.icesiviajes.repository.TipoIdentificacionRepository;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TipoIdentificacionTest {

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;


    @Test
    void consultarTipoIdentificacionPorEstado(){
        List<TipoIdentificacion> tipoIdentificacions = tipoIdentificacionRepository.consultarTipoIdentificacionPorEstado()
        for (TipoIdentificacion tipoIdentificacion : tipoIdentificacions){
            System.out.println(tipoIdentificacion.getNombre());
        }
    }

    @Test
    void consultarTipoIdentificacionPorEstadoCodigo(){
        List<TipoIdentificacion> tipoIdentificacions = tipoIdentificacionRepository.consultarTipoIdentificacionPorEstadoCodigo()
        for (TipoIdentificacion tipoIdentificacion : tipoIdentificacions){
            System.out.println(tipoIdentificacion.getNombre());
        }
    }

}