package com.example.learn.javese.chapter5;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 内容较多 后续专项练习
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        //1.
        Class<?> employeeClass1 = Employee.class;

        //2.
        Employee employee = new Employee();
        Class employeeClass2 = employee.getClass();

        System.out.println(employeeClass2.getName()); //com.example.learn.javese.chapter5.Employee

        //3.获取类
        String className = "com.example.learn.javese.chapter5.Employee";
        Class classZ = Class.forName(className);
        System.out.println(classZ.getName()); //com.example.learn.javese.chapter5.Employee

        //4.根据类的默认构造方法新建一个实例
        Employee employee2 = (Employee) classZ.newInstance();
        System.out.println(employee2.toString()); //com.example.learn.javese.chapter5.Employee

        //5.获取类上的注解
        Annotation[] annotations = classZ.getDeclaredAnnotations();
        System.out.println(annotations); //com.example.learn.javese.chapter5.Employee

        //6.获取该类及其父类的公有属性域
        Field[] allFields = classZ.getFields();
        for (Field field:allFields) {
            System.out.println(field.getType().getName());
        }

        //7.获取该类的公有属性域
        Field[] thisFields = classZ.getDeclaredFields();
        for (Field field:thisFields) {
            System.out.println(field.getType().getName());
        }

        //8.获取Field中的值
        Field field = classZ.getDeclaredField("name");
        field.setAccessible(true);
        Object value = field.get(employee2);
        String nameValue = (String)value;
        System.out.println(nameValue);



    }
}
