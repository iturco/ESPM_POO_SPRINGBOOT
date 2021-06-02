package br.espm.poo_springboot.Springbootespm.service;

import antlr.collections.List;
import br.espm.poo_springboot.Springbootespm.DataType.CliBean;
import br.espm.poo_springboot.Springbootespm.models.Cliente;
import br.espm.poo_springboot.Springbootespm.repository.CliRepository;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CliService {

  @Autowired
  private CliRepository CliRepository;

  public List<CliBean> listAll() {
    list<CliBean> listaCli = new ArrayList<>();
    CliRepository.findAll().forEach(Cliente -> listaCli.add(Cliente.to));
    return listaCli;
    // return StreamSupport
    //   .stream(CliRepository.findAll().spliterator(), false)
    //   .collect(Collectors.toList())
    //   .stream()
    //   .map(Cliente::to)
    //   .collect(Collectors.toList());
  }

  public CliBean findBy(UUID id) {
    Optional<Cliente> c = CliRepository.findById(id.toString()).get();
    return c.isEmpty() ? null : c.get().to();
    // return CliRepository
    //         .findById(id.toString())
    //         .map(Cliente -> Cliente.to())
    //         .orElse(null);
  }

  public List<CliBean> listByName(String name) {
    return CliRepository
      .listByCliName(name)
      .stream()
      .map(Cliente::to)
      .collect(Collectors.toList());
  }

  public List<CliBean> listByName(String name) {
    CliRepository
      .listByName()
      .stream()
      .map(Cliente::to)
      .collect(Collectors.tolist());
  }

  public CliBean create(CliBean Cli) {
    cli.setId(UUID.randomUUID());
    return CliReCliRepository.save(new Cliente(cli)).to();
    // Cliente cli = new Cliente(); //Model
    // return CliRepository.save(cli);

    // if(cli.getId() == null) {
    //     Cli.setId(UUID.randomUUID());
    // }
    // cli.put(user.getId, cli);
    // return cli;
  }

  public void delete(UUID id) {
    CliRepository.deleteById(id.toString());
  }
}
