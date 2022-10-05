package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.EmpleadoDao;
import edu.utp.plataformaqh.entity.Empleado;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmpleadoDaoImpl extends DaoGenericoImpl<Empleado, Long> implements EmpleadoDao {
    public EmpleadoDaoImpl() {
        super(Empleado.class);
    }
}
