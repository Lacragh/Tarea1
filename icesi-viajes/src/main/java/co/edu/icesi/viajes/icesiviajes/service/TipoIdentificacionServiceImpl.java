package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Cliente;
import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.icesiviajes.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class TipoIdentificacionServiceImpl implements TipoIdentificacionService {

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    public List<TipoIdentificacion> findAll() {
        List<TipoIdentificacion> lstTipoIdentificaion = tipoIdentificacionRepository.findAll();
        return lstTipoIdentificaion;
    }

    @Override
    public Optional<TipoIdentificacion> findById(Long aLong) {
        return tipoIdentificacionRepository.findById(aLong);
    }

    @Override
    public TipoIdentificacion save(TipoIdentificacion entity) throws Exception {
        return tipoIdentificacionRepository.save(entity);
    }

    @Override
    public TipoIdentificacion update(TipoIdentificacion entity) throws Exception {
        return tipoIdentificacionRepository.save(entity);
    }

    @Override
    public void delete(TipoIdentificacion entity) throws Exception {
        tipoIdentificacionRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        tipoIdentificacionRepository.deleteById(aLong);
    }

    @Override
    public void validate(TipoIdentificacion entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoIdentificacionRepository.count();
    }
}
