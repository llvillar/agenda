package com.llv.agenda.services;

import java.util.List;

import com.llv.agenda.models.Contacto;

public interface ContactoService {

    public List<Contacto> findAll();
    public Contacto findById(int id);
    public Contacto save(Contacto contacto);
    public void update(int id, Contacto contacto);
    public void deleteById(int id);
    public void deleteAll();
}
