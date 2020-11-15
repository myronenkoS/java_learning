package Exercises;

import java.util.Arrays;
import java.util.List;

public class Ex_7 extends ExHelper {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 2, 45, 2, 7, 3, 345, 76, 4};
        Arrays.sort(numbers);
        System.out.println("min = " + numbers[0]);
        System.out.println("max = " + numbers[numbers.length - 1]);
    }
}
