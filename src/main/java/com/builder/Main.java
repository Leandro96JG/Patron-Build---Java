package com.builder;

import com.builder.domain.Contact;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder()
                .setAge(22)
                .setAddress("Argentina","La Rioja","Virgen Del Valle","5300")
                .build();

        System.out.println("employee = " + employee);
    }
}