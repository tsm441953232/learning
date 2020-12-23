package com.example.learn.javese.chapter6;

public interface InterfaceSample {
    //接口中的所有方法自动地属于 public。 因此，在接口中声明方法时，不必提供关键字public
    void interfaceSample();

    //接口可以定义常量
    static int i = 5;

    //Java8之后接口可以提供简单的方法了，但是这些方法不能引用实例域，因为这些接口中没有实例

}
