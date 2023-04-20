package org.example;

import java.util.Iterator;

public interface GenericDAO<T> {
    void insert(T entry);

    T findOne(String key);

    Iterator<T> findAll();

    void update(T entry, String newName, String newPhone);

    void remove(String key);
}
