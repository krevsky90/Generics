package generic_type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krevsky on 22.08.2019.
 */

/**
 * Example of Generic Type usage
 */
public class GenericTypeMain {
    public static void main(String[] args) {
        BoxGenericType<String> b1 = new BoxGenericType<>("a");
        BoxGenericType<Integer> b2 = new BoxGenericType<>(123);
        List<BoxGenericType> boxList = new ArrayList<>();

        boxList.add(b1);
        boxList.add(b2);

        for (BoxGenericType b : boxList) {
            System.out.println("value = " + b.getV() + ", type = " + b.getType());
        }
    }
}

