package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.PersonaDao;
import edu.utp.plataformaqh.entity.Persona;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonaDaoImpl extends DaoGenericoImpl<Persona, Long> implements PersonaDao {
    public PersonaDaoImpl() {
        super(Persona.class);
    }
}
