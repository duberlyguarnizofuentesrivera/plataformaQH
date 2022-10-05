package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.SucursalDao;
import edu.utp.plataformaqh.entity.Sucursal;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SucursalDaoImpl extends DaoGenericoImpl<Sucursal, Long> implements SucursalDao {
    public SucursalDaoImpl() {
        super(Sucursal.class);
    }
}