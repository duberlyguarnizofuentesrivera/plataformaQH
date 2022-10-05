package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.ProveedorDao;
import edu.utp.plataformaqh.entity.Proveedor;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProveedorDaoImpl extends DaoGenericoImpl<Proveedor, Long> implements ProveedorDao {
    public ProveedorDaoImpl() {
        super(Proveedor.class);
    }
}