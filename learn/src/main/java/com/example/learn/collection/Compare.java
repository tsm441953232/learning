package com.example.learn.collection;

import java.util.*;

public class Compare implements Comparable{
    private String name;
    private int age;

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     *
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /*public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i<10;i++){
            list0.add(random.nextInt(100));
        }
        System.out.println(list0);//[46, 7, 91, 48, 52, 25, 64, 3, 28, 60]
        *//*
         * 对集合进行自然排序，从小到大
         *//*
        Collections.sort(list0);
        System.out.println(list0);//[2, 19, 44, 46, 61, 67, 68, 89, 91, 94]

        List<String> list1 = new ArrayList<>();
        list1.add("Alive");
        list1.add("Rose");
        list1.add("Jack");
        list1.add("Noname");
        System.out.println(list1);//[Alive, Rose, Jack, Noname]
        Collections.sort(list1);
        *//*
         *对集合进行自然排序，显而易见是按照首字母顺序排序
         *//*
        System.out.println(list1);//[Alive, Jack, Noname, Rose]
    }*/



    public static void main(String[] args) {
//
        List<Person> list = new ArrayList<>();
        list.add(new Person("ccc", 20));
        list.add(new Person("AAA", 30));
        list.add(new Person("bbb", 10));
        list.add(new Person("ddd", 40));
        for (Person p :list) {
            System.out.println("p = " + p);
        }

        Collections.sort(list,new ComparableDemo.AscComparator());


        for (Person p :list) {
            System.out.println("asc p = " + p);
        }

        Collections.sort(list,new ComparableDemo.DescCompareator());

        for (Person p :list) {
            System.out.println("desc p = " + p);
        }

    }


}
