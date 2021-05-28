package sberbank;

import wildcards.structure.SubClass;
import wildcards.structure.SuperClass;

import java.util.ArrayList;
import java.util.List;

/**
 * https://habr.com/ru/company/sberbank/blog/416413/
 */
public class SberMain {
    public static void main(String[] args) {
        /**
         * Producer Extends Consumer Super
         * Если мы объявили wildcard с extends, то это producer.
         * Он только «продюсирует», предоставляет элемент из контейнера, а сам ничего не принимает.
         *
         * Если же мы объявили wildcard с super — то это consumer.
         * Он только принимает, а предоставить ничего не может.
         *
         * исключением является возможность записать null для extends и прочитать Object для super
         */

        List<SubClass> subList = new ArrayList<SubClass>();
        subList.add(new SubClass(1));
        subList.add(new SubClass(2));
        List<? extends SuperClass> extendsList = subList;
//        extendsList.add(new SubClass(3)); // compile-time error
        extendsList.get(0); //ok

        List<? super SubClass> superList = subList;
        superList.add(new SubClass(4)); //ok
        superList.get(0);   //ok

        /**
         * <?> и Raw типы
         */
        List<? extends Object> list1 = new ArrayList<>();
//        list1.add("1");   // compile-time error

        List<?> list2 = new ArrayList<>();
//        list2.add("1");   // compile-time error
    }
}
