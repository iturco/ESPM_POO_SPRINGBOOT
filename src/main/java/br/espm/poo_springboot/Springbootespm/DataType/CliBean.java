package br.espm.poo_springboot.Springbootespm.DataType;

import java.util.UUID;

public class CliBean {
    private UUID id;
    private String name;

    public CliBean() {

    }

    public CliBean(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CliBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
