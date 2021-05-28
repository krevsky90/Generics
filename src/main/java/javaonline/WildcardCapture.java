package javaonline;

import java.util.List;

/**
 * как раз еще один ответ на вопрос 1 из readme.txt про Set<T> vs Set<?>
 */
public class WildcardCapture {
    //Проблема заключается в том, что метод List.set() не может работать с List<?>,
    // так как ему не известен тип List. К ТОМУ ЖЕ НАРУШАЕТСЯ ПРИНЦИП Producer Extends Consumer Super,
    // т.к. List<?> равносильно List<? extends Object>, а это значит, что можно лишь получать элементы, но не добавлять

    // Для решение этой проблемы используют Wildcard Capture (или "Capture helpers"),
    // т.е. обманываем компилятор.
    // Напишем еще один метод с параметризованной переменной и будем его использовать внутри нашего метода.
    private static void swap(List<?> list, int i, int j) {
        swap2(list, i, j);
//        list.set(i, list.get(j)); // Ошибка
    }

    private static <T> void swap2(List<T> list, int i, int j) {
        list.set(i, list.get(j));
    }
}
