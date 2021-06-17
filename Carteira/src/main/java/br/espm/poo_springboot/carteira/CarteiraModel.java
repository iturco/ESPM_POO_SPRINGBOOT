package br.espm.poo_springboot.carteira;

import br.espm.poo_springboot.carteira.common.datatype.Carteira;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "carteira")
public class CarteiraModel {

    @Id
    @Column(name = "id_carteira")
    private String idCarteira;

    @Column(name = "id_usuario")
    private String idUsuario;



    public CarteiraModel() {

    }

    public CarteiraModel(Carteira c) {
        this.idCarteira = c.getId();
        // this.idUsuario = c.getUsuario.getId();
      
    }

    public Carteira to() {
        // Usuario usuario = new Usuario();
        // usuario.setId(idUsuario);

        Carteira c = new Carteira();
        c.setId(this.idCarteira);
      
        // c.setUsuario(usuario);
        return c;
    }

}
