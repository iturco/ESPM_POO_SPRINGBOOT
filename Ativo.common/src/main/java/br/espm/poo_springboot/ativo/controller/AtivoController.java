package br.espm.poo_springboot.ativo.controller;

import br.espm.poo_springboot.ativo.datatype.Cotacao;
import br.espm.poo_springboot.ativo.datatype.Ativo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("ativo-service")
public interface AtivoController {

    @GetMapping("/ativos")
    List<Ativo> ativos();

    @GetMapping("/ativos/{simbolo}")
    Ativo ativos(@PathVariable String simbolo);

    @GetMapping("/cotacoes/{id}")
    Cotacao cotacao(@PathVariable String id);

    @GetMapping("/cotacoes/{simbolo}/{data}")
    Cotacao cotacao(
            @PathVariable String simbolo,
            @PathVariable String data
    );

    @GetMapping("/cotacoes")
    List<Cotacao> cotacoes(
            @RequestParam String simbolo,
            @RequestParam String ini,
            @RequestParam String fim
    );

}
