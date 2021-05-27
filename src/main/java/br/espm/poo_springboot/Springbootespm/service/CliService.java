package br.espm.poo_springboot.Springbootespm.service;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import antlr.collections.List;
import br.espm.poo_springboot.Springbootespm.DataType.CliBean;
import br.espm.poo_springboot.Springbootespm.models.Cliente;
import br.espm.poo_springboot.Springbootespm.repository.CliRepository;

@Component
public class CliService {
    @Autowired
    private CliRepository CliRepository;

    public List<CliBean> listAll() {
        return StreamSupport
                .stream(CliRepository.findAll().spliterator(), false)
                .collect(Collectors.toList())
                .stream().map(Cliente::to)
                .collect(Collectors.toList());
    }

    public CliBean findBy(UUID id) {
        return CliRepository
                .findById(id.toString())
                .map(Cliente -> Cliente.to())
                .orElse(null);
    }

    public List<CliBean> listByName(String name) {
        return CliRepository.listByCliName(name)
                .stream().map(Cliente::to)
                .collect(Collectors.toList());
    }

    public CliBean create(CliBean Cli) {
        Cli.setId(UUID.randomUUID());
        return CliRepository.save(new Cliente(Cli)).to();
    }

    public void delete(UUID id) {
        CliRepository.deleteById(id.toString());
    }
    
}