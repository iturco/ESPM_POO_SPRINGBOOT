package br.espm.poo_springboot.ativo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AtivoRepository extends CrudRepository<AtivoModel, String> {

    @Override
    Iterable<AtivoModel> findAll();

    @Override
    Optional<AtivoModel> findById(String s);

    @Query("SELECT m from AtivoModel m WHERE UPPER(m.txSimbolo) = UPPER(:simbolo)")
    Optional<AtivoModel> findBySimbolo(@Param("simbolo") String simbolo);

}
