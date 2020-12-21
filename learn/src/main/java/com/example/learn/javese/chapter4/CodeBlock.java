package com.example.learn.javese.chapter4;

public class CodeBlock {
    //静态代码块
    // 静态代码块在类被加载的时候就运行了，而且只运行一次，并且优先于各种代码块以及构造函数。如果一个类中有多个静态代码块，会按照书写顺序依次执行。后面在比较的时候会通过具体实例来证明。
    static {
        System.out.println("我是类的静态代码块1");
    }

    static {
        System.out.println("我是类的静态代码块2");
    }

    //构造代码块
    //在java类中使用{}声明的代码块（和静态代码块的区别是少了static关键字）:
    //构造代码块在创建对象时被调用，每次创建对象都会调用一次，但是优先于构造函数执行。需要注意的是，听名字我们就知道，构造代码块不是优先于构造函数执行，而是依托于构造函数，
    // 也就是说，如果你不实例化对象，构造代码块是不会执行的。
    {
        System.out.println("我是构造代码块 设置i=1");
        this.i=1;
    }

    {
        System.out.println("我是构造代码块 设置i=2");
        this.i=2;
    }

    private int i;

    public CodeBlock(int i) {
        this.i = i;
    }

    public CodeBlock() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args){
        CodeBlock codeBlock = new CodeBlock(3);
        System.out.println(codeBlock.getI());
    }
}
