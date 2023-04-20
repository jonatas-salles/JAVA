package org.example;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class ClientDAO<T extends Client> implements GenericDAO<T> {
    private LinkedHashMap<String, T> clients = new LinkedHashMap<>();

    @Override
    public void insert(T entry) {
        if (clients.containsKey(entry.getCPF())) return;

        clients.put(entry.getCPF(), entry);
    }

    @Override
    public T findOne(String key) {
        if (!clients.containsKey(key)) return null;

        return clients.get(key);
    }

    @Override
    public Iterator<T> findAll() {
        return clients.values().iterator();
    }

    @Override
    public void update(T entry, String newName, String newPhone) {
        if (!clients.containsKey(entry.getCPF())) return;

        clients.replace(entry.getCPF(), (T) new Client(entry.getCPF(), newName, newPhone)); // Couldn't find any other solution so i had to cast
    }

    @Override
    public void remove(String key) {
        if (!clients.containsKey(key)) return;

        clients.remove(key);
    }
}
