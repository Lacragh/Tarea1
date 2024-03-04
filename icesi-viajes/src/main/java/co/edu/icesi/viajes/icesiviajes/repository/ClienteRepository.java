package co.edu.icesi.viajes.icesiviajes.repository;

import co.edu.icesi.viajes.icesiviajes.domain.Cliente;
import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select cl from Cliente cl where cl.estado = ?1 ORDER BY cl.numeroIdentificacion")
    public List<Cliente> consultarClientesPorEstado(String estado, Pageable pageable);

    @Query("select cl from Cliente cl where LOWER(cl.correo) = lower(?1)")
    public List<Cliente> consultarClientePorCorreoElectronico(String correo);

    @Query("select cl from Cliente cl where cl.numeroIdentificacion like ?1")
    public List<Cliente> consultarClientePorIdentificacion(String id);

    @Query("select cl from Cliente cl where lower(cl.nombre) like lower(?1) ")
    public List<Cliente> consultarClientePorNombre(String nombre);

    @Query("select cl from Cliente cl where cl.fechaNacimiento BETWEEN ?1 AND ?2")
    public List<Cliente> consultarClientePorrangoFecha(String fecha1,String fecha2 );

    @Query("select cl.estado, count(cl.numeroIdentificacion) as Total_Cliente from Cliente cl GROUP BY ?1")
    public List<Cliente> consultarTotalClientePorEstado(String estado);

    //9.    Consultar clientes por tipo de identificación. Debe de ser paginado FALTA

    @Query("select cl from Cliente cl where cl.primerApellido = ?1 OR cl.segundoApellido = ?1")
    public List<Cliente> consultarClientePorApellido(String apellido);
}