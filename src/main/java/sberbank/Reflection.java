package sberbank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://habr.com/ru/company/sberbank/blog/416413/
 */
public class Reflection {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Class<? extends List> k = ints.getClass();

        System.out.println(k);
    }
}
