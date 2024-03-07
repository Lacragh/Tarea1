package co.edu.icesi.viajes.icesiviajes.domain;

import co.edu.icesi.viajes.icesiviajes.repository.DestinoRepository;
import co.edu.icesi.viajes.icesiviajes.service.DestinoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DestinoTest {

    @Autowired
    private DestinoRepository destinoRepository;
    @Autowired
    private DestinoService destinoService;

    @Test
    void setup() throws Exception{
        Destino destino1 = new Destino(
                1, // idDest
                "CD3", // codigo
                "Montañas", // nombre
                "Un lugar ", // descripcion
                "S", // tierra
                "N", // aire
                "N", // mar
                new Date(), // fechaCreacion
                new Date(), // fechaModificacion
                "admin", // usuCreador
                "admin", // usuModificador
                "A", // estado
                2 // idTide
        );

        // Creando el segundo objeto de Destino
        Destino destino2 = new Destino(
                2,
                "CD1",
                "Islas ",
                "Islas ",
                "N",
                "S",
                "S",
                new Date(),
                new Date(),
                "usuario1",
                "usuario1",
                "A",
                3
        );

        // Creando el tercer objeto de Destino
        Destino destino3 = new Destino(
                32,
                "CD",
                "Bosques",
                "Bosques d",
                "S",
                "N",
                "N",
                new Date(),
                new Date(),
                "usuario2",
                "usuario2",
                "I",
                4
        );
        destinoService.save(destino1);
        destinoService.save(destino2);
        destinoService.save(destino3);
    }

    @Test
    void retornarTotalClientePorEstado() throws Exception{
        setup();
        List<Destino> destinos = destinoRepository.consultarDestinoPorEstado("CDG","A");
        for (Destino destino : destinos){
            System.out.println(destino.getNombre());
        }
    }

    @Test
    void findByIdTide(){
        List<Destino> destinos = destinoRepository.findByIdTide(103);
        for (Destino destino : destinos){
            System.out.println(destino.getNombre());
        }
    }

    @Test
    void consultarDestinosActivos(){
        List<Destino> destinos = destinoRepository.consultarDestinosActivos("A");
        for (Destino destino : destinos){
            System.out.println(destino.getNombre());
        }
    }
}