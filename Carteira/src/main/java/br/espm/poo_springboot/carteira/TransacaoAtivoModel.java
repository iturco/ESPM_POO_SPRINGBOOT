package br.espm.poo_springboot.carteira;

import br.espm.poo_springboot.ativo.datatype.Cotacao;
import br.espm.poo_springboot.carteira.common.datatype.Carteira;
import br.espm.poo_springboot.carteira.common.datatype.TransacaoAtivo;
import br.espm.poo_springboot.carteira.common.datatype.TransacaoTipo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transacaoativo")
public class TransacaoAtivoModel {

    @Id
    @Column(name = "id_transacaoativo")
    private String idTransacaoAtivo;

    @Column(name = "id_carteira")
    private String idCarteira;

    @Column(name = "id_cotacao")
    private String idCotacao;

    @Column(name = "dt_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtData;

    @Column(name = "nr_qtd")
    private BigDecimal nrQtd;

    @Column(name = "nr_tipo")
    private Integer nrTipo;

    public TransacaoAtivoModel() {

    }

    public TransacaoAtivoModel(TransacaoAtivo tc) {
        this.idTransacaoAtivo = tc.getId();
        this.dtData = tc.getData();
        this.idCarteira = tc.getCarteira().getId();
        this.idCotacao = tc.getCotacao().getId();
        this.nrTipo = tc.getTipo().equals(TransacaoTipo.VENDA) ? 1 : 2;
        this.nrQtd = tc.getQuantidade();
    }

    public TransacaoAtivo to() {
        Carteira carteira = new Carteira();
        carteira.setId(idCarteira);

        Cotacao cotacao = new Cotacao();
        cotacao.setId(idCotacao);

        TransacaoAtivo tc = new TransacaoAtivo();
        tc.setId(idTransacaoAtivo);
        tc.setData(dtData);
        tc.setQuantidade(nrQtd);
        tc.setTipo(1 == nrTipo ? TransacaoTipo.VENDA : TransacaoTipo.COMPRA);
        tc.setCarteira(carteira);
        tc.setCotacao(cotacao);
        return tc;
    }

}
