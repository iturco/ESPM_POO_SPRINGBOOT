package br.espm.poo_springboot.auth;

import br.espm.poo_springboot.auth.UsuarioService;
import br.espm.poo_springboot.auth.common.controller.AuthController;
import br.espm.poo_springboot.auth.common.datatype.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.UUID;

@RestController
public class AuthResource implements AuthController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Usuario usuario(String idUsuario) {
        return usuarioService.findBy(idUsuario);
    }
    @Override
    public Usuario create(Usuario usuario) {
        Usuario user = new Usuario();
        return usuarioService.create(user);
    }
}
