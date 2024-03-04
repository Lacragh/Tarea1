package co.edu.icesi.viajes.icesiviajes.icesiviajes.service;
import org.junit.jupiter.api.Assertions;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.service.TipoDestinoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.aspectj.bridge.MessageUtil.fail;

@SpringBootTest
public class TipoDestinoTest {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    @Test
    void debeRetornarListaDeTiposDestino() {
        List<TipoDestino> tipoDestinoList = tipoDestinoService.findAll();

        for(TipoDestino tipoDestino: tipoDestinoList) {
            System.out.println(tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
        }

    }

    @Test
    void retornarnListaTipoDestinoPorId(){

        //Aqui validamos por el nombre
        Assertions.assertEquals("BLANCA NIEVE",tipoDestinoService.findById(5L).get().getNombre());
        Assertions.assertEquals("NATURALEZA, BOSQUE Y AIRE",tipoDestinoService.findById(3L).get().getNombre());

    }

    @Test
    void guardarTipoDestino() throws Exception {
        TipoDestino tipoDestino = new TipoDestino(10, "10", "BugaYork", "Iglesias",
                new Date(), new Date(), "CLOPEZ", null, "A");
        tipoDestinoService.save(tipoDestino);
        //Verificamos que si se creo
        Assertions.assertEquals("BugaYork",tipoDestinoService.findById(10L).get().getNombre());

    }

    @Test
    void actualizarTipoDestino() throws Exception {
        TipoDestino tipoDestino = new TipoDestino(10, "10", "CaliYork", "Iglesias",
                new Date(), new Date(), "CLOPEZ", null, "A");
        //Vamos a utilizar el anterior tipo de destino que creamos para actualizarlo
        tipoDestinoService.update(tipoDestino);
        Assertions.assertEquals("CaliYork",tipoDestinoService.findById(10L).get().getNombre());
    }

    @Test
    void eliminarTipoDestino() throws Exception {
        //vamos a eliminar a CaliYork
        guardarTipoDestino();
        Optional<TipoDestino> tipoDestino = tipoDestinoService.findById(10L);
        tipoDestinoService.delete(tipoDestino.get());
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            tipoDestinoService.findById(10L).get();
        });
    }

    @Test
    void eliminarTipoDestinoPorId() throws Exception {
        guardarTipoDestino();
        tipoDestinoService.deleteById(10L);
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            tipoDestinoService.findById(10L).get();
        });
    }



}
