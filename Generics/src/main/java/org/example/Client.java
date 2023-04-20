package org.example;

import java.time.LocalDate;

public class Client {
    private final String CPF;
    private String name;
    private LocalDate birthDate;
    private String phone;

    public Client(String CPF, String name, String phone) {
        this.CPF = CPF;
        this.name = name;
        this.birthDate = LocalDate.now();
        this.phone = phone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CPF='" + CPF + '\'' +
                "\nName='" + name + '\'' +
                "\nBirthDate=" + birthDate +
                "\nPhone='" + phone + '\'' +
                '\n';
    }
}
