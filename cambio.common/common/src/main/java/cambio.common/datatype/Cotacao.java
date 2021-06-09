package br.espm.poo_springboot.Springbootespm.cambio.datatype;

import java.util.Date;

public class Cotacao {
    private String id;
    private Moeda moeda;
    private Double valor;
    private Date data;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Moeda getMoeda() {
        return moeda;
    }
    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    } 
    
}
