package org.example;

import org.springframework.stereotype.Component;

@Component
public class Contact {

    private String name;
    private String patronymic;
    private String surname;
    private String phoneNumber;
    private String eMail;

    public Contact(String name, String patronymic, String surname, String phoneNumber, String eMail) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
