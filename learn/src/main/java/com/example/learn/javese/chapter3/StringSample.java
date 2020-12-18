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

        //不可变字符串
        greeting = greeting.substring(0, 3) + "p!"; // 修改引用的指向
        //不可变字符串却有一个优点：编译器可以让字符串共享。为了弄清具体的工作方式，可以想象将各种字符串存放在公共的存储池中。
        // 字符串变量指向存储池中相应的位置。如果复制一个字符串变量， 原始字符串与复制的字符串共享相同的字符。

        //在 C 程序员第一次接触 Java 字符串的时候， 常常会感到迷惑， 因为他们总将字符串认为是字符型数组：
        //char greetingQ[] = "Hello";
        //这种认识是错误的， Java 字符串大致类似于 char* 指针，
        //char* greeting = "Hello";

        //当采用另一个字符串替换 greeting 的时候， Java 代码大致进行下列操作：
        //char* temp = ma 1oc(6);
        //stmcpy(temp, greeting, 3);
        //strncpy(temp + 3, "p!H, 3);
        //greeting = temp;  此刻旧的字符串无引用 Java会自动对其进行垃圾回收
    }
}
