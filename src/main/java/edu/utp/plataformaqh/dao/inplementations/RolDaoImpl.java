package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.RolDao;
import edu.utp.plataformaqh.entity.Rol;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RolDaoImpl extends DaoGenericoImpl<Rol, Long> implements RolDao {
    public RolDaoImpl() {
        super(Rol.class);
    }
}