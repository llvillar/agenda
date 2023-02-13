package com.llv.agenda.exceptions;

public class ContactoNotFoundException extends RuntimeException {
 
    public ContactoNotFoundException() {
        super();
    }
 
    public ContactoNotFoundException(String message) {
        super(message);
    }
 
    public ContactoNotFoundException(long id) {
        super("Contacto no encontrado: " + id);
    }
}