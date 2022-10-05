package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.ProductoDao;
import edu.utp.plataformaqh.entity.Producto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductoDaoImpl extends DaoGenericoImpl<Producto, Long> implements ProductoDao {
    public ProductoDaoImpl() {
        super(Producto.class);
    }
}
