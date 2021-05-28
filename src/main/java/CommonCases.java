import wildcards.structure.SubClass;
import wildcards.structure.SuperClass;

import java.util.*;

/**
 * Generic Term                  |   Meaning
 * Set<E>                        |   Generic Type, E is called formal parameter
 * Set<Integer>                  |   Parametrized type, Integer is actual parameter here
 * Set<T extends Comparable>     |   Bounded type parameter
 * Set<T super Comparable>       |   Bounded type parameter
 * Set<?>                        |   Unbounded wildcard
 * Set<? extends T>              |   Bounded wildcard type
 * Set<? Super T>                |   Bounded wildcards
 * Set                           |   Raw type
 * Set<T extends Comparable<T>>  |   Recursive type bound
 * <p>
 * T � used to denote type
 * E � used to denote element
 * K � keys
 * V - values
 * N � for numbers
 * <p>
 * Read more: https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html#ixzz6IlIRYZd6
 */
public class CommonCases {
    public static void main(String[] args) {
        //1. Parametrized type like Set<T> is subtype of raw type Set
        Set setOfRawType = new HashSet<String>();
        setOfRawType = new HashSet<Integer>();

        //2. Set<Object> is setOfAnyType, it can store String, Integer but you can not assign setOfString or setOfInteger to setOfObject
        Set<Object> setOfAnyType = new HashSet<Object>();
        setOfAnyType.add("abc"); //legal
        setOfAnyType.add(new Float(3.0f)); //legal - <Object> can accept any type
//        setOfAnyType = new HashSet<String>(); - illegal

        //4. Inheritance on type parameter is not supported means Set<Object> will not accept Set<String> as per following Generics code.
//        Set<Object> SetOfObject = new HashSet<String>(); //compiler error - incompatible type

        //7) You can not use Generics in the .class token, parametrized types like List<String> are not allow along with .class literal.
        Class cz = List.class; //legal
//        Class cz2 = List<String>.class;  //illegal
    }

    public static <T> void krevMethod(T var) {
        //do nothing
    }
}