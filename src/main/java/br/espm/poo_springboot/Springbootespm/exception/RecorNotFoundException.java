package br.espm.poo_springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

public class RecordNotFoundException extends RuntimeException {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RecordNotFoundException(String message) {
        super(message);
    }
}