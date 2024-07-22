package com.builder;

import com.builder.domain.Address;
import com.builder.domain.Contact;
import com.builder.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones;
    private List<Contact> contacts;

    public Employee() {
    }

    //Ojo con el orden en que se agregan los atributos
    public Employee(int age,String name,String gender,Address address,List<Phone> phones,List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }


    //* Usando el patron builder
    public static class EmployeeBuilder implements IBuilder{
        //Se agregan los atributos de la clase padre
        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        //const vacio
        public EmployeeBuilder() {
        }

        //seteamos cada atributo
        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }
        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        // Para setear una clase

        //1. Forma: recibiendo el objeto address
        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this;
        }

        //2. Forma: Mandando cada atributo de la clase address
        public EmployeeBuilder setAddress(String country, String city, String address, String cp){
            this.address = new Address(city,country,address,cp);
            return this;
        }

        //Para setear listas - 2 Formas diferentes
        //Recordar que para que funcionen los metodos de la list, tienen que estar creadas en los atributos
        public EmployeeBuilder setPhone(Phone phone){
            this.phones.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String phoneNumber, String ext, String phoneType){
            this.phones.add(new Phone(phoneNumber,ext,phoneType));
            return this;
        }

        public EmployeeBuilder setContact(Phone phone, String name, Address address){
            this.contacts.add(new Contact(phone,name,address));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact);
            return this;
        }

        //Lo que retorna el build
        @Override
        public Employee build() {
            return new Employee(age,name,gender,address,phones,contacts);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, age=" + age +
                "\n, name='" + name + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phones=" + phones +
                "\n, contacts=" + contacts +
                '}';
    }
}
