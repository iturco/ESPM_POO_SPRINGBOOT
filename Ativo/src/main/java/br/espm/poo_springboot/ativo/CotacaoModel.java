package br.espm.poo_springboot.ativo;

import br.espm.poo_springboot.ativo.datatype.Cotacao;
import br.espm.poo_springboot.ativo.datatype.Ativo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "cotacao")
public class CotacaoModel {

    @Id
    @Column(name = "idCotacao")
    private String idCotacao;

    @Column(name = "idAtivo")
    private String idAtivo;

    @Column(name = "dtData")
    @Temporal(TemporalType.DATE)
    private Date dtData;

    @Column(name = "vrValor")
    private BigDecimal vrValor;

    public CotacaoModel() {

    }

    public CotacaoModel(Cotacao c) {
        this.idCotacao = c.getId();
        this.idAtivo = c.getAtivo().getId();
        this.dtData = c.getData();
        this.vrValor = c.getValor();
    }

    public Cotacao to() {
        Ativo m = new Ativo();
        m.setId(idAtivo);

        Cotacao c = new Cotacao();
        c.setId(idCotacao);
        c.setAtivo(m);
        c.setData(dtData);
        c.setValor(vrValor);
        return c;
    }

}
