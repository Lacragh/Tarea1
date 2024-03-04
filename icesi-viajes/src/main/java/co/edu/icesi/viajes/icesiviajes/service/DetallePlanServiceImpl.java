package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Cliente;
import co.edu.icesi.viajes.icesiviajes.domain.DetallePlan;
import co.edu.icesi.viajes.icesiviajes.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class DetallePlanServiceImpl implements DetallePlanService{

    @Autowired
    private DetallePlanRepository detallePlanRepository;

    @Override
    public List<DetallePlan> findAll() {
        List<DetallePlan> lstDetalleplan = detallePlanRepository.findAll();
        return lstDetalleplan;
    }

    @Override
    public Optional<DetallePlan> findById(Long aLong) {
        return detallePlanRepository.findById(aLong);
    }

    @Override
    public DetallePlan save(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public DetallePlan update(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public void delete(DetallePlan entity) throws Exception {
        detallePlanRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        detallePlanRepository.deleteById(aLong);
    }

    @Override
    public void validate(DetallePlan entity) throws Exception {

    }

    @Override
    public Long count() {
        return detallePlanRepository.count();
    }
}
