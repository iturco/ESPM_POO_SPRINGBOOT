package br.espm.poo_springboot.Springbootespm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.espm.poo_springboot.Springbootespm.service.CliService;

@RestController
public class CliResource {

    @Autowired
    private CliService cli;
    
}
