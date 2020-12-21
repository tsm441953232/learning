package com.example.learn.javese.chapter4;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("a", 15, "123");
        Employee employee2 = new Employee("b", 15, "123");
        Employee employee3 = new Employee("c", 15, "123");

    }
}


/**
 * 未定义成为public 也无法定义成为public 只能是同名包下可以访问 默认访问的作用域为 default
 */
class Employee {
    int age;
    private String name;
    private String date;

    public Employee(String name, int age, String date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
