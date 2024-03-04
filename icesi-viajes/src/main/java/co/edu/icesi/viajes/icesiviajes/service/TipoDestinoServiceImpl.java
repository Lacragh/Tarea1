package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.TipoDestino;
import co.edu.icesi.viajes.icesiviajes.repository.TipoDestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class TipoDestinoServiceImpl implements TipoDestinoService{

    @Autowired
    private TipoDestinoRepository tipoDestinoRepository;

    @Override
    public List<TipoDestino> findAll() {
        List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
        return lstTipoDestino;
    }

    @Override
    public Optional<TipoDestino> findById(Long id) {
        return tipoDestinoRepository.findById(id);
    }

    @Override
    public TipoDestino save(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public TipoDestino update(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public void delete(TipoDestino entity) throws Exception {
        tipoDestinoRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        tipoDestinoRepository.deleteById(aLong);
    }

    @Override
    public void validate(TipoDestino entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoDestinoRepository.count();
    }


}
