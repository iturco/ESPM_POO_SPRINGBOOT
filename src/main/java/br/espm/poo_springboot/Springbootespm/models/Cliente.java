package br.espm.poo_springboot.Springbootespm.models;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.espm.poo_springboot.Springbootespm.DataType.CliBean;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    private String cli_code;
    private String cli_nome;

    public Cliente(){

    }

public Cliente(CliBean c){
    this.cli_code = c.getId().toString();
    this.cli_nome = c.getName();
}

public CliBean to(){
    CliBean c = new CliBean();
    c.setId(UUID.fromString(cli_code));
    c.setName(cli_nome);
    return c;
}

}
