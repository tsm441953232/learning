package com.example.learn.collection;

import java.util.Comparator;

public class ComparableDemo {
        public static class AscComparator implements Comparator<Person> {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        public static class DescCompareator implements  Comparator<Person>{
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        }

}
