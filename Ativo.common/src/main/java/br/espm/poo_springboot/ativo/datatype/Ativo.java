package br.espm.poo_springboot.ativo.datatype;

public class Ativo {

    private String id;
    private String nome;
    private String simbolo;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

}
