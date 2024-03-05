package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.Cliente;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //Consulta #2
    @Query("select cl from Cliente cl where cl.estado = ?1 ORDER BY cl.numeroIdentificacion")
    public List<Cliente> consultarClientesPorEstado(String estado, Pageable pageable);

    //Consulta #3
    @Query("select cl from Cliente cl where LOWER(cl.correo) = lower(?1)")
    public List<Cliente> consultarClientePorCorreoElectronico(String correo);

    //Consulta #4
    @Query("select cl from Cliente cl where cl.numeroIdentificacion like ?1")
    public List<Cliente> consultarClientePorIdentificacion(String id);

    //Consulta #5
    @Query("select cl from Cliente cl where lower(cl.nombre) like lower(?1) ")
    public List<Cliente> consultarClientePorNombre(String nombre);

    //Consulta #6
    @Query("select cl from Cliente cl where cl.fechaNacimiento BETWEEN ?1 AND ?2")
    public List<Cliente> consultarClientePorrangoFecha(String fecha1,String fecha2 );

    //Consulta #8
    @Query("select cl.estado, count(cl.numeroIdentificacion) as Total_Cliente from Cliente cl GROUP BY ?1")
    public List<Cliente> consultarTotalClientePorEstado(String estado);

    //Consulta #9
    @Query("select cl from Cliente cl where cl.idTiid = ?1")
    public Page<Cliente> consultarPorTipoDeID(String estado, Pageable pageable);

    //Consulta #10
    @Query("select cl from Cliente cl where cl.primerApellido = ?1 OR cl.segundoApellido = ?1")
    public List<Cliente> consultarClientePorApellido(String apellido);


    //Consulta $14
    @Query("select cl.nombre from Cliente cl join TipoIdentificacion  t on ?1 = t.idTiid where cl.estado = 'A' order by cl.nombre ")
    public List<Cliente> consultaEspecial(String Ididentificacion);
}