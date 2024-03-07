package co.edu.icesi.viajes.icesiviajes.domain;

import co.edu.icesi.viajes.icesiviajes.repository.TipoIdentificacionRepository;
import co.edu.icesi.viajes.icesiviajes.service.TipoIdentificacionService;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TipoIdentificacionTest {

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;

    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    void setup() throws Exception{
        TipoIdentificacion tipoIdentificacion = new TipoIdentificacion(
                1L, // idTiid
                "DNI", // codigo
                "Documento Nacional de Identidad", // nombre
                new Date(), // fechaCreacion (puedes usar la fecha actual o una específica)
                new Date(), // fechaModificacion (puedes usar la fecha actual o una específica)
                "usuario1", // usuCreador
                "usuario2", // usuModificador
                "activo" // estado
        );
        // Segundo objeto
        TipoIdentificacion tipoIdentificacion2 = new TipoIdentificacion(
                2L, // idTiid
                "PAS", // codigo
                "Pasaporte", // nombre
                new Date(), // fechaCreacion (puedes usar la fecha actual o una específica)
                new Date(), // fechaModificacion (puedes usar la fecha actual o una específica)
                "usuario3", // usuCreador
                "usuario4", // usuModificador
                "activo" // estado
        );

// Tercer objeto
        TipoIdentificacion tipoIdentificacion3 = new TipoIdentificacion(
                3L, // idTiid
                "CI", // codigo
                "Cédula de Identidad", // nombre
                new Date(), // fechaCreacion (puedes usar la fecha actual o una específica)
                new Date(), // fechaModificacion (puedes usar la fecha actual o una específica)
                "usuario5", // usuCreador
                "usuario6", // usuModificador
                "activo" // estado
        );

        tipoIdentificacionService.save(tipoIdentificacion);
        tipoIdentificacionService.save(tipoIdentificacion2);
        tipoIdentificacionService.save(tipoIdentificacion3);
    }
    @Test
    void consultarTipoIdentificacionPorEstado() throws Exception{
        setup();
        List<TipoIdentificacion> tipoIdentificacions = tipoIdentificacionRepository.consultarTipoIdentificacionPorEstado("activo");
        for (TipoIdentificacion tipoIdentificacion : tipoIdentificacions){
            System.out.println(tipoIdentificacion.getNombre());
        }
    }

    @Test
    void consultarTipoIdentificacionPorEstadoCodigo(){
        List<TipoIdentificacion> tipoIdentificacions = tipoIdentificacionRepository.consultarTipoIdentificacionPorEstadoCodigo("DNI","activo");
        for (TipoIdentificacion tipoIdentificacion : tipoIdentificacions){
            System.out.println(tipoIdentificacion.getNombre());
        }
    }

}