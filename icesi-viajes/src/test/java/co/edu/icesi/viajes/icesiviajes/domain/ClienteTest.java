package co.edu.icesi.viajes.icesiviajes.domain;

import co.edu.icesi.viajes.icesiviajes.repository.ClienteRepository;
import co.edu.icesi.viajes.icesiviajes.service.ClienteService;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClienteTest {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteService clienteService;


    @Test
    void setup() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Cliente cliente1 = new Cliente(
                1L, // idClie
                "12345678A", // numeroIdentificacion
                "García", // primerApellido
                "Fernández", // segundoApellido
                "Juan", // nombre
                "666555444", // telefono1
                "666555443", // telefono2
                "juan.garcia@example.com", // correo
                "M", // sexo
                sdf.parse("1985-05-15"), // fechaNacimiento
                sdf.parse("2023-01-01"), // fechaCreacion
                sdf.parse("2023-01-02"), // fechaModificacion
                "admin", // usuCreador
                "admin", // usuModificador
                "A", // estado
                1 // idTiid
        );

        Cliente cliente2 = new Cliente(
                2L,
                "87654321B",
                "López",
                "Martínez",
                "Ana",
                "655444333",
                "655444332",
                "ana.lopez@example.com",
                "F",
                sdf.parse("1990-08-20"),
                sdf.parse("2023-02-01"),
                sdf.parse("2023-02-02"),
                "admin",
                "user",
                "A",
                2
        );

        Cliente cliente3 = new Cliente(
                3L,
                "11223344C",
                "Morales",
                "Díaz",
                "Luis",
                "644333222",
                "644333221",
                "luis.morales@example.com",
                "M",
                sdf.parse("1975-12-30"),
                sdf.parse("2023-03-01"),
                sdf.parse("2023-03-02"),
                "user",
                "admin",
                "A",
                3
        );
        clienteService.save(cliente1);
        clienteService.save(cliente2);
        clienteService.save(cliente3);
    }

    @Test
    void debeRetornarClientesPorEstado() throws Exception {
        setup();
        List<Cliente> clientes = clienteRepository.consultarClientesPorEstado("A");
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }
    }

    @Test
    void debeRetornarClientesPorCorreo(){
        List<Cliente> clientes = clienteRepository.consultarClientePorCorreoElectronico("luis.morales@example.com");
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }
    }

    @Test
    void debeRetornarClientesPorID(){
        List<Cliente> clientes = clienteRepository.consultarClientePorIdentificacion("11223344C");
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }
    }

    @Test
    void debeRetornarClientePorNombre(){
        List<Cliente> clientes = clienteRepository.consultarClientePorNombre("Luis");
        for (Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }

    @Test
    void debeRetornarClientesPorRangoDeFecha() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        List<Cliente> clientes = clienteRepository.consultarClientePorrangoFecha(sdf.parse("1985-04-15"),sdf.parse("1991-05-15"));
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }
    }

    @Test
    void debeRetornarTotalClientesPorEstado(){
        List<Cliente> clientes = clienteRepository.consultarTotalClientePorEstado("A");
        int count = 0;
        for (Cliente cliente : clientes){
            count++;
        }
        System.out.println(count);
    }

    @Test
    void debeRetornarPorTipoDeID(){
        List<Cliente> clientes = clienteRepository.consultaEspecial("1");
        for (Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }



}