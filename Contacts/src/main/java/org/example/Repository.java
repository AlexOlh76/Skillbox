package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Repository {

    private List<Contact> repository = new ArrayList<>();

    public List<Contact> getRepository() {
        return repository;
    }

    public void setRepository(List<Contact> repository) {
        this.repository = repository;
    }

    public void writeContact(Contact contact) {

        if (repository.contains(contact)) {
            System.out.println("Контакт существует уже");
            return;
        }
        repository.add(contact);
    }

    public void deleteContact(Contact contact) {

        repository.remove(contact);
    }
}
