package br.espm.poo_springboot.Springbootespm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.espm.poo_springboot.Springbootespm.datatype.UserBean;

import java.util.UUID;

@Entity
@Table(name="cliente")
public class UserModel {

    @Id
    private String cli_code;
    private String cli_Nome;

    public UserModel() {

    }

    public UserModel(UserBean b) {
        this.cli_code = b.getId().toString();
        this.cli_Nome = b.getName();
    }

    public UserBean to() {
        UserBean b = new UserBean();
        b.setId(UUID.fromString(cli_code));
        b.setName(cli_Nome);
        return b;
    }

}
