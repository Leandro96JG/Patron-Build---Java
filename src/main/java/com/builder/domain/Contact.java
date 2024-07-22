package com.builder.domain;

public class Contact {
    private String name;
    private Phone phone;
    private Address address;

    public Contact() {
    }

    public Contact(Phone phone, String name, Address address) {
        this.phone = phone;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}
