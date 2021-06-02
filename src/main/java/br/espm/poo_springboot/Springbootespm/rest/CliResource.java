package br.espm.poo_springboot.Springbootespm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.espm.poo_springboot.Springbootespm.service.CliService;

@RestController
public class CliResource {

    @Autowired
    private CliService cli;
    
    @GetMapping(path = "/client")
    public List<CliBean> ListAll() { return CliService.ListAll();}

    @GetMapping(path = "/client/{id}")
    public CliBean findBy (@PathVariable UUID id) {
        CliBean foundCli = CliService.findBy(id);
        if(foundCli == null) {
            throw new RecordNotFound(id.toString());
        }
        return foundCli;
    }

    @PostMapping(path = "/customers")
    public ResponseEntity<Object> save(@RequestBody CliBean cli) {
        CliBean savedCli = CliService.create(cli);
    }

    //COMPLETAR
    URI location = ServletUriComponentBuilder
        
       
    return ResponseEntity.created(location).build();
}

@DeleteMapping(path = "/customers/{id}") 
public void deleteBy(@PathVariable UUID id) {CliService.delete(id);
}