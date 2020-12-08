package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class FinalVariableDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(5);
        intList.add(7);

        final int[] sum = new int[]{0};
        intList.forEach(number -> sum[0] += number);

        for (int i : new int[]{1,2,3}) {
            System.out.println(i);
        }

        for (Integer i : intList) {
            System.out.println(i);
        }

        intList.forEach(System.out::println);
    }
}
