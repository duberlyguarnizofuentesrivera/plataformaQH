package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.RegistroIngresoDao;
import edu.utp.plataformaqh.entity.RegistroIngreso;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegistroIngresoDaoImpl extends DaoGenericoImpl<RegistroIngreso, Long> implements RegistroIngresoDao {
    public RegistroIngresoDaoImpl() {
        super(RegistroIngreso.class);
    }
}