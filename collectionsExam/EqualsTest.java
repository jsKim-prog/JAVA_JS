package collectionsExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualsTest {
    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,5,6};
        List<Integer> list1 = Arrays.asList(data);
        List<Integer> list2 = Arrays.asList(data);
        List<Integer> list3 = Arrays.asList(1, 3, 4,5,2,6);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
    }
}
