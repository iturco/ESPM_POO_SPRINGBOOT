package br.espm.poo_springboot.cambio;

import br.espm.poo_springboot.cambio.common.datatype.Moeda;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moeda")
public class MoedaModel {

    @Id
    @Column(name = "idMoeda")
    private String idMoeda;

    @Column(name = "txNome")
    private String txNome;
    @Column(name = "txSimbolo")
    private String txSimbolo;

    public MoedaModel() {

    }

    public MoedaModel(Moeda m) {
        this.idMoeda = m.getId();
        this.txNome = m.getNome();
        this.txSimbolo = m.getSimbolo();
    }

    public Moeda to() {
        Moeda m = new Moeda();
        m.setId(idMoeda);
        m.setNome(txNome);
        m.setSimbolo(txSimbolo);
        return m;
    }

}
