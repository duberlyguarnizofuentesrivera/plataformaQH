package edu.utp.plataformaqh.dao;

import java.util.Optional;

public interface DaoGenerico<T, K> {
    Optional<T> findById(K id);

    void create(T entity);

    T save(T entity);

    void deleteById(Long id);

    void delete(T entity);
}
