package com.example.learn.javese.chapter3;

/**
 * Java的基本数据类型
 */
public class SecondSample {
    //以下定义了变量 变量名对大小写敏感
    int int_i = 0;
    short short_i = 9999; //不能为99999
    long long_i = 333L; // 即使写为333也不会编译器报错
    byte byte_i = 127; //不能大于127

    //从 Java 7 开始， 加上前缀 0b 或 0B 就可以写二进制数。
    int octal_i = 0b1111; //八进制进制
    int hex_i = 0x1111; //十六进制进制

    final int common_int = 1; //定义常量
    final static int common_int_2 = 2; //定义类常量

    public static void main(StringSample[] args){
        System.out.println(2.0-1.1);//结果为0.8999999999999999

    }


}
