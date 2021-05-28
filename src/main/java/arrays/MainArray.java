package arrays;

/**
 * Array and Generics in Java
 * Arrays don't support Generics in Java
 * so you can not create Arrays like T[]
 * which makes gentrifying an existing class hard if you are using arrays.
 * Though there is a workaround which requires a cast from Object[] to T[]
 * which comes with the risk of unchecked cast and warning.
 * For this reason, it's better to use Collections classes like ArrayList and HashMap over an array.
 * <p>
 * By the way, those classes are also implemented on top of the array in Java
 * but JDK handles there type-safety by effectively using generics.
 * here is an example of casting Object array to generic array in Java
 * <p>
 * Read more: https://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html#ixzz6IlOIIK3N
 */
public class MainArray {
    public static void main(String[] args) {
        Holder<Integer> numbers = new Holder<>(10);
        numbers.add(101);
        numbers.add(102);
        System.out.println("Get: " + numbers.get(0));
        System.out.println("Get: " + numbers.get(1));
    }
}

