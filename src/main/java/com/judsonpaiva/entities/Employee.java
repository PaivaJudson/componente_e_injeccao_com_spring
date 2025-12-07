package com.judsonpaiva.entities;

public class Employee {

    private String name;
    private double grossSalary;

    public Employee() {}

    public Employee(double grossSalary, String name) {
        this.grossSalary = grossSalary;
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public String getName() {
        return name;
    }
}
