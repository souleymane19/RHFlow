package com.RhFlow.backend.services;

import java.util.List;

public interface AbstractService <T>{
    public void add(T t);
    public void update(Long id, T t);
    public void delete(T t);
    public List<T> getAll();
}
