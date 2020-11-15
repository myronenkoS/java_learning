package Exercises;

public class Ex_6 {
    public static void main(String[] args) {

        int[] num = new int[50];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        for (int k : num) {
            if (k % 2 == 0)
                System.out.println(k);
        }
    }
}
