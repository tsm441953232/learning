package com.example.learn.javese.chapter3;

public class StringSample {

    public static void main(String[] args){

        String greeting = "Hello";
        String s = greeting.substring(0,3);//提取字符串

        String str1 = "String 1 ";
        String str2 = "String 2 ";
        int age = 15;
        String message = str1 + str2 + age; //当将一个字符串与一个非字符串的值进行拼接时，后者被转换成字符串（任何一个 Java 对象都可以转换成字符串）。

        //如果需要把多个字符串放在一起， 用一个定界符分隔，可以使用静态 join 方法
        String all = String.join(" / ", "S", "M", "L", "XL");// all is the string "S / H / L / XL"

    }
}
