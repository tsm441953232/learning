package com.example.learn.javese.chapter3;

/**
 * 当进行两个数值进行二元操作时（例如 n + f，n 是整数， f 是浮点数，) 先要将两个操作数转换为同一种类型，然后再进行计算。
 * •如果两个操作数中有一个是 double 类型， 另一个操作数就会转换为 double 类型。
 * •否则，如果其中一个操作数是 float 类型，另一个操作数将会转换为 float 类型。
 * •否则， 如果其中一个操作数是 long 类型， 另一个操作数将会转换为 long 类型。
 * •否则， 两个操作数都将被转换为 int 类型。
 */
public class NumberCastCalculation {


    public void int2float(int i , float f){
        int x = i; // 99999
        float y = f ;
        y = x ; //将一个int赋值为一个 float变量
        System.out.println(y);
    }

    public void double2int(int i , double f){
        int x = i; // 99999
        double y = f ;
        x = (int) y; //将一个double赋值为一个 int变量
        System.out.println(x);
    }

    //如果试图将一个数值从一种类型强制转换为另一种类型， 而又超出了目标类型的
    //表示范围，结果就会截断成一个完全不同的值。例如，（byte ) 300 的实际值为 44
}
