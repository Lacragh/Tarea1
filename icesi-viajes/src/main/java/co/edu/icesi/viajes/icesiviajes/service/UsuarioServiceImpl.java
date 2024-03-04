package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Usuario;
import co.edu.icesi.viajes.icesiviajes.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Scope("singleton")
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> lstUsuario = usuarioRepository.findAll();
        return lstUsuario;
    }

    @Override
    public Optional<Usuario> findById(Long aLong) {
        return usuarioRepository.findById(aLong);
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Usuario entity) throws Exception {
        return usuarioRepository.save(entity);
    }

    @Override
    public void delete(Usuario entity) throws Exception {
        usuarioRepository.delete(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        usuarioRepository.deleteById(aLong);
    }

    @Override
    public void validate(Usuario entity) throws Exception {

    }

    @Override
    public Long count() {
        return usuarioRepository.count();
    }
}
