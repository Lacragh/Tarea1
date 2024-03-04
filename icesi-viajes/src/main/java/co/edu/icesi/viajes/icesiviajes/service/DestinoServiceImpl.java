package co.edu.icesi.viajes.icesiviajes.service;


import co.edu.icesi.viajes.icesiviajes.domain.Destino;
import co.edu.icesi.viajes.icesiviajes.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class DestinoServiceImpl implements DestinoService{

    @Autowired
    private DestinoRepository destinoRepository;

    @Override
    public List<Destino> findAll() {
        List<Destino> lstDestino = destinoRepository.findAll();
        return lstDestino;
    }

    @Override
    public Optional<Destino> findById(Long aLong) {
        return destinoRepository.findById(aLong);
    }

    @Override
    public Destino save(Destino entity) throws Exception {
        return destinoRepository.save(entity);
    }

    @Override
    public Destino update(Destino entity) throws Exception {
        return destinoRepository.save(entity);
    }

    @Override
    public void delete(Destino entity) throws Exception {
        destinoRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        destinoRepository.deleteById(aLong);
    }

    @Override
    public void validate(Destino entity) throws Exception {

    }

    @Override
    public Long count() {
        return destinoRepository.count();
    }
}
