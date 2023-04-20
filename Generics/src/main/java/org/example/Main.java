package org.example;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericDAO<Client> clients = new ClientDAO<>();

        clients.insert(new Client("123", "Jorge", "119992564"));
        clients.insert(new Client("124", "Marcos", "159912565"));
        clients.insert(new Client("125", "Luiz", "1699333333"));
        clients.insert(new Client("123", "Rita", "19981113214")); // trying to add a Client with a CPF that already exists

        System.out.println("\nFind one (key provided 123):");
        System.out.println(clients.findOne("123").toString());
        System.out.println("----------------------------------------");

        System.out.println("Find all:");
        Iterator<Client> it = clients.findAll();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        System.out.println("----------------------------------------");

        clients.update(clients.findOne("124"), "Maria", "(16) 99111-1111");

        System.out.println("Client with CPF: 124 after update:");
        System.out.println(clients.findOne("124"));
        System.out.println("----------------------------------------");

        clients.remove("123");
        clients.remove("124");
        clients.remove("120"); // Trying to remove a client that doesn't exists

        System.out.println("Find all after removing clients 123 and 124:");
        it = clients.findAll();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        System.out.println("----------------------------------------");
    }
}
