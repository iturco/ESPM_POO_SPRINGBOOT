package br.espm.poo_springboot.ativo;

import br.espm.poo_springboot.ativo.datatype.Ativo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class AtivoService {

    @Autowired
    private AtivoRepository ativoRepository;

    public List<Ativo> listAll() {
        return StreamSupport
                .stream(ativoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList())
                .stream().map(AtivoModel::to)
                .collect(Collectors.toList());
    }

    public Ativo findBy(UUID id) {
        return ativoRepository
                .findById(id.toString())
                .map(AtivoModel::to)
                .orElse(null);
    }

    public Ativo findBySimbolo(String simbolo) {
        return ativoRepository
                .findBySimbolo(simbolo)
                .map(AtivoModel::to)
                .orElse(null);
    }

}
