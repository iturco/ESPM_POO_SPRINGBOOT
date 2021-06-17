package br.espm.poo_springboot.auth.common.controller;

import br.espm.poo_springboot.auth.common.datatype.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("auth-service")
public interface AuthController {

    @GetMapping("/usuario/{idUsuario}")
    Usuario usuario(@PathVariable String idUsuario);
   
    @PostMapping("usuario")
    Usuario create(@RequestBody Usuario carteira);
}
