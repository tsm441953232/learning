package com.example.learn.javese.chapter6;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Lambda表达式学习
 * 函数编程：即可理解是将⼀个函数（也称为⾏为）作为⼀个参数进⾏传递， ⾯向对象编程是对数据的抽象（各种各样的POJO类），⽽函数式编程则是对⾏为的抽象（将⾏为作为⼀个参数进⾏传递）
 * Lambda表达式使⽤场景：⼀个接⼝中只包含⼀个⽅法，则可以使⽤Lambda表达式，这样的接⼝称之为函数接⼝语法 (params) -> expression
 * 例如使用到的 Comparator 接口，该接口
 * @see java.util.Comparator
 *
 * 第⼀部分为括号内⽤逗号分隔的形式参数，参数是函数式接⼝⾥⾯⽅法的参数；第⼆部分为⼀个箭头符号->；第三部分为⽅法体，可以是表达式和代码块
 *
 * 参数列表：
 * 括号中参数列表的数据类型可以省略不写
 * 括号中的参数只有⼀个，那么参数类型和()都可以省略不写
 *
 * ⽅法体：
 * 如果{}中的代码只有⼀⾏，⽆论是否返回值，可以省略{}，return、分号要⼀起省略；其他则需要加上
 *
 * Lambda表达式的实现⽅式在本质是以匿名内部类的⽅式进⾏实现
 */
public class Lambda {


    public static void main(String[] args) {

        //Comparator 是一个函数式声明的接口,我们可以看到
        List<Integer> list = Arrays.asList(22, 30, 19);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list.stream().forEach(e -> System.out.println(e));


        /*List<Integer> list = Arrays.asList(22, 30, 19);
        Collections.sort(list, Comparator.reverseOrder());//降序
        list.stream().forEach(e -> System.out.println(e));*/


        /*List<Integer> list = Arrays.asList(22, 30, 19);
        Collections.sort(list, (o1, o2) -> {
            return o2.compareTo(o1);//降序
        });
        list.stream().forEach(e -> System.out.println(e));*/


        /*List<Integer> list = Arrays.asList(22, 30, 19);
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        list.stream().forEach(e -> System.out.println(e));*/

        Map map = new ConcurrentHashMap();

    }

}
