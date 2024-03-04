package co.edu.icesi.viajes.icesiviajes;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.icesiviajes.repository.TipoDestinoRepository;
import co.edu.icesi.viajes.icesiviajes.repository.TipoIdentificacionRepository;
import dto.TipoDestinoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class IcesiViajesApplication implements CommandLineRunner {

	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;

	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;
	public static void main(String[] args) {
		SpringApplication.run(IcesiViajesApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{
		consultarTipoDestinoPorEstado();
		consultarTipoDestino();
	}



	private void consultarTipoDestinoPorEstado(){
		//Se consulta los tipos de destino por estado
		List<TipoDestinoDTO> lstTipoDestino = tipoDestinoRepository.consultarTipoDestinoPorEstado("A");

		for (TipoDestinoDTO tipoDestino: lstTipoDestino){
			System.out.println("Tipo de Destino" + "\nID: "+tipoDestino.getIdTide() + "\nNombre: " + tipoDestino.getNombre() );
		}
	}

	private void consultarTipoDestino(){
		//Se consulta los tipos de destino por estado
		List<TipoIdentificacion> lstTipoDestino = tipoIdentificacionRepository.consultarTipoIdentificacionPorEstado("A");

		for (TipoIdentificacion tipoDestino: lstTipoDestino){
			System.out.println("Tipo de Destino" + "\nID: "+tipoDestino.getIdTiid() + "\nNombre: " + tipoDestino.getNombre() );
		}
	}
}


