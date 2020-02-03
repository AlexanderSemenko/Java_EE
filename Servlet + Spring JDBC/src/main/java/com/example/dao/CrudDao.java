/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author alexander
 * @param <T>
 */
public interface CrudDao<T> {
    
    Optional<T> find(Integer id);
    void save(T model);
    void update(T model);
    void delete(Integer id);

    List<T> findAll();
}
