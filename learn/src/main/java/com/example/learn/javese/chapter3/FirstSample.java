package com.example.learn.javese.chapter3;

/**
 * Java的基本程序设计结构
 * 一个简单的程序
 *
 */
public class FirstSample {

    /**
     * Java区分大小写 如将main变更为Main，则程序无法正常运行
     * public 为访问控制修饰符
     * 关键字 class 表明 Java 程序中的全部内容都包含在类中。这里，只需要将类作为一个加载程序逻辑的容器，程序逻辑定义了应用程序的行为。
     *
     * 关键字 class 后面紧跟类名。 Java 中定义类名的规则很宽松。名字必须以字母开头，后面可以跟字母和数字的任意组合。长度基本上没有限制。但是不能使用 Java 保留字
     *
     * 标准的命名规范为（类名 FirstSample 就遵循了这个规范）：类名是以大写字母开头的名词。如果名字由多个单词组成，每个单词的第一个字母都应该大写
     * （这种在一个单词中间使用大写字母的方式称为胳蛇命名法。以其自身为例， 应该写成 CamelCase)。
     *
     * 源代码的文件名必须与公共类的名字相同，并用 .java 作为扩展名。因此，存储这段源代码的文件名必须为  FirstSample.java
     * (再次提醒大家注意，大小写是非常重要的， 千万不能写成 firstsample.java)
     *
     * 如果已经正确地命名了这个文件， 并且源代码中没有任何录人错误，在编译这段源代码之后就会得到一个包含这个类字节码的文件。Java 编译器将字节码文件自动地命名为
     * FirstSample. class, 并与源文件存储在同一个目录下。最后， 使用下面这行命令运行这个程序
     * java FirstSample(请记住，不要添加 .class 扩展名。）程序执行之后，控制台上将会显示“ We will not use Hello,World！”。
     *
     * 运行已编译的程序时，Java 虚拟机将从指定类中的 main 方法开始执行（这里的“ 方法”就是 Java 中所说的“ 函数”），因此为了代码能够执行，在类的源文件中必须包含一个 main
     * 方法。当然，也可以将用户自定义的方法添加到类中，并且在 main 方法中调用它们（第4章将讲述如何自定义方法)。
     *
     * @param args
     */
    public static void main(StringSample[] args){
        System.out.println("We will not use Hello,World！");
    }
}
