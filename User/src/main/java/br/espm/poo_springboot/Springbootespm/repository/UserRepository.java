package br.espm.poo_springboot.Springbootespm.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.espm.poo_springboot.Springbootespm.model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<UserModel, String> {

    @Override
    Iterable<UserModel> findAll();

    @Override
    Optional<UserModel> findById(String s);

    @Override
    UserModel save(UserModel user);

    @Override
    void deleteById(String s);

    @Query("SELECT u FROM UserModel u WHERE UPPER(u.cli_Nome) LIKE(UPPER(CONCAT('%',:name,'%')))") // JPQL
    List<UserModel> listByUserName(@Param("name") String name);

}
