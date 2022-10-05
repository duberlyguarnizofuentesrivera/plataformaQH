package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.AnaquelDao;
import edu.utp.plataformaqh.entity.Anaquel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AnaquelDaoImpl extends DaoGenericoImpl<Anaquel, Long> implements AnaquelDao {

    public AnaquelDaoImpl() {
        super(Anaquel.class);
    }
}
