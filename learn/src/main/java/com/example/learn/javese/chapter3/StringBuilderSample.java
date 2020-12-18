package com.example.learn.javese.chapter3;

public class StringBuilderSample {

    /**
     * 一、线程安全的问题
     * 在 JDK5.0 中引入 StringBuilder 类。 这个类的前身是 StringBuffer
     * 线程安全 StringBuffer:线程安全,StringBuilder:线程不安全。因为 StringBuffer 的所有公开方法都是 synchronized 修饰的,
     * 而 StringBuilder 并没而 StringBuilder 并没有 synchronized 修饰。
     *
     * 二、缓冲区的问题
     * StringBuffer 每次获取 toString 都会直接使用缓存区的 toStringCache 值来构造一个字符串。
     * StringBuilder 则每次都需要复制一次字符数组，再构造一个字符串。
     * 所以， StringBuffer 对缓存区优化，不过 StringBuffer 的这个toString 方法仍然是同步的。
     *
     * 三、性能问题
     * 既然 StringBuffer 是线程安全的，它的所有公开方法都是同步的，StringBuilder 是没有对方法加锁同步的，所以毫无疑问，StringBuilder 的性能要远大于 StringBuffer。
     * @param args
     */
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append("ssss");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        stringBuffer.append("ssss");
    }


}
