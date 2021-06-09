package br.espm.poo_springboot.Springbootespm.cambio;

import org.springframework.web.bind.annotation.RestController;

import br.espm.poo_springboot.cambio.common.controller.CambioController;
import br.espm.poo_springboot.cambio.datatype.Cotacao;
import br.espm.poo_springboot.cambio.common.datatype.Moeda;

@RestController
public class CambioResource implements CambioController {
    
    @Override
    public List<Moeda> moedas() {
        return null;
    }

    @Override
    public Cotacao cotacao() {
        return null;
    }

    @Override
    public List<Cotacao> cotacoes(String moeda) {
        return null;
    }

}
