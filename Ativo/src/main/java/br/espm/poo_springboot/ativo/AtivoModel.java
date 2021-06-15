package br.espm.poo_springboot.ativo;

import br.espm.poo_springboot.ativo.datatype.Ativo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ativo")
public class AtivoModel {

    @Id
    @Column(name = "id_ativo")
    private String idAtivo;

    @Column(name = "tx_nome")
    private String txNome;
    @Column(name = "tx_simbolo")
    private String txSimbolo;

    public AtivoModel() {

    }

    public AtivoModel(Ativo m) {
        this.idAtivo = m.getId();
        this.txNome = m.getNome();
        this.txSimbolo = m.getSimbolo();
    }

    public Ativo to() {
        Ativo m = new Ativo();
        m.setId(idAtivo);
        m.setNome(txNome);
        m.setSimbolo(txSimbolo);
        return m;
    }

}
