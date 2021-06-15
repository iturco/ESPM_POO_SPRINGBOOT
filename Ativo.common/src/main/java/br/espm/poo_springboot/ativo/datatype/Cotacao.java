package br.espm.poo_springboot.ativo.datatype;

import br.espm.poo_springboot.ativo.datatype.Ativo;
import java.math.BigDecimal;
import java.util.Date;

public class Cotacao {

    private String id;
    private Ativo ativo;
    private BigDecimal valor;
    private Date data;

    public String getId() {
        return id;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
