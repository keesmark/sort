import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> result = Arrays.asList(1, 3, 5, 2, 4);
//        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(sorted(result));
    }

    public static boolean sorted(List<Integer> num) {
        List<Integer> clone = new ArrayList<>(num);
        List<Integer> sortedList = sort(clone);
        return num.equals(sortedList);
    }

    public static List<Integer> sort(List<Integer> num) {
        Collections.sort(num);
        return num;
    }
}
