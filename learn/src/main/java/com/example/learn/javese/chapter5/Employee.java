package com.example.learn.javese.chapter5;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Employee(String name, double salary, Date hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
