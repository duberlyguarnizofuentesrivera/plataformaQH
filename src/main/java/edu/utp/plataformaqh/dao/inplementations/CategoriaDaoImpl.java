package edu.utp.plataformaqh.dao.inplementations;

import edu.utp.plataformaqh.dao.DaoGenericoImpl;
import edu.utp.plataformaqh.dao.interfaces.CategoriaDao;
import edu.utp.plataformaqh.entity.Categoria;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriaDaoImpl extends DaoGenericoImpl<Categoria, Long> implements CategoriaDao {

    public CategoriaDaoImpl() {
        super(Categoria.class);
    }
}
