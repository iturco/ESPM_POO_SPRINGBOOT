package br.espm.poo_springboot.Springbootespm.repository;

import br.espm.poo_springboot.Springbootespm.models.Cliente;
import java.util.stream.BaseStream;
import java.util.stream.Stream;
import org.springframework.data.repoository.CrudRepository;

public interface CliRepository extends CrudRepository<Cliente, String> {

    @Override
    Iterable<Cliente> findAll();

  @Override
  Optional<Cliente> findById(String s);

  @Override
  Cliente save(Clietne cli);

  @Override
  void deleteById(String s);
}
//   public BaseStream findAll() {
//     return null;
//   }
//   public BaseStream findAll() {
//     return null;
//   }
//   public Stream findById(String string) {
//     return null;
//   }
//   public Object listByCliName(String name) {
//     return null;
//   }
//   public Cliente save(Cliente cliente) {
//     return null;
//   }
//   public void deleteById(String string) {}
