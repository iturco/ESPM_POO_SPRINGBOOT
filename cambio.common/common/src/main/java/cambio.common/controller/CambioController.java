package br.espm.poo_springboot.Springbootespm.cambio.common.controller;

import br.espm.poo_springboot.cambio.datatype.Cotacao;
import br.espm.poo_springboot.cambio.common.datatype.Moeda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;
import java.util.List;

@FeignClient("cambio-service")
public interface CambioController {

    @GetMapping("/moedas")
    List<Moeda> list();

    @GetMapping("/cotacao/{id")
    Cotacao cotacao(String id);

    @GetMapping("/cotacao/{moeda}")
    List<Cotacao> cotacoes(Stirng moeda);
}
