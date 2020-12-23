package com.example.learn.javese.chapter5;

import java.util.Date;

public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //在子类中可以增加域、 增加方法或覆盖超类的方法，然而绝对
    //不能删除继承的任何域和方法。
    @Override
    public double getSalary() {
        return this.getBonus() + super.getSalary();
        //return bonus + salary; 不能这么写
    }

    public Manager(String name, double salary, Date hireDay, double bonus) {
        super(name, salary, hireDay);
        this.bonus = 0;
    }

    //如果子类的构造器没有显式地调用超类的构造器， 则将自动地调用超类默认（没有参数 )的构造器。 如果超类没有不带参数的构造器，
    // 并且在子类的构造器中又没有显式地调用超类的其他构造器则 Java 编译器将报告错误。
    public Manager() {
    }
}
