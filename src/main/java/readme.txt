http://www.quizful.net/post/java-generics-tutorial
!! https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html
!! https://javarevisited.blogspot.com/2012/06/10-interview-questions-on-java-generics.html
!!! https://habr.com/ru/company/sberbank/blog/416413/

ВОПРОСЫ:
+ 1) в чем разница?
    Set<? extends MyClass>
    Set<T extends MyClass>
    ответ: разница начинается, когда нужно повторно обратиться к типу элемента.
            например, метод должен возвращать значение передаваемого типа. Мы не можем вернуть тип ?, но можем вернуть T
+ 2) в чем разница?
    List<?> list
    List<Object> list
    ответ:
        List<?> list - лист с НЕИЗВЕСТНЫМ типом
        List<Object> list - лист с ЛЮБЫМ типом
        You can assign List<String>, List<Integer> to List<?>
        but you can not assign List<String> to List<Object>.
    доп:
        List<?> равносильно List<? extends Object>
+ 2.1) в чем разница?
    List<Object> list
    просто List
    ответ:
        1) Main difference between raw type and parametrized type List<Object> is that, compiler will not check type-safety of raw type
            at compile time but it will do that for parametrized type and by using Object as Type it inform compiler that it can hold any Type of Object
            e.g. String or Integer. This Java Generics interview question is based on correct understanding of  raw type in Generics.
        2) Any way second difference between them is that you can pass any parametrized type to raw type List
            but you can not pass List<String> to any method which accept List<Object> it will result in compilation error
        3) In case of raw type List (i.e. List without <>) you need to cast each time:
            List listOfRawTypes = new ArrayList();
            listOfRawTypes.add("abc");
            listOfRawTypes.add(123); //compiler will allow this - exception at runtime
            String item = (String) listOfRawTypes.get(0); //explicit cast is required
            item = (String) listOfRawTypes.get(1); //ClassCastException because Integer can not be cast in String

            Read more: https://javarevisited.blogspot.com/2012/06/10-interview-questions-on-java-generics.html#ixzz6JJGRNVzE
3) в чем разница?
    generic_type.BoxGenericType<String> b1 = new generic_type.BoxGenericType<>()
    generic_type.BoxGenericType<String> b1 = new generic_type.BoxGenericType()
    ответ:
4)


