package br.espm.poo_springboot.auth;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, String> {

    @Override
    Iterable<UsuarioModel> findAll();

    @Override
    Optional<UsuarioModel> findById(String s);
   
    @Override
    UsuarioModel save(UsuarioModel s);
}
