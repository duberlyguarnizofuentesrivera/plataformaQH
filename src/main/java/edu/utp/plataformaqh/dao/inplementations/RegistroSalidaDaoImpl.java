package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.RegistroSalidaDao;
import edu.utp.plataformaqh.entity.RegistroSalida;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegistroSalidaDaoImpl extends DaoGenericoImpl<RegistroSalida, Long> implements RegistroSalidaDao {
    public RegistroSalidaDaoImpl() {
        super(RegistroSalida.class);
    }
}