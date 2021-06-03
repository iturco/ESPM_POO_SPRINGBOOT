package br.espm.poo_springboot.Springbootespm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.espm.poo_springboot.Springbootespm.datatype.MessageBean;

@RestController
public class HelloResource {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(path = "/html")
    public String html() {
        return "<p style='color:red'>Hello World!</p>: Feliz Springboot";
    }

    @GetMapping(path = "/mensagem")
    public MessageBean message() {
        MessageBean m = new MessageBean();
        m.setMessage("Bom dia!");
        return m;
    }

}
