package Exercises;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int x = sc.nextInt();
        int y = x;
        String star = "* ";
        String star2 = "";

        if (x > 0 && x < 10) {
            while (x > 0) {
                star2 = star2 + star;
                System.out.println(star2);
                x--;
            }

            StringBuffer sBuf = new StringBuffer(star2);
            do {
                StringBuffer sBuf2 = new StringBuffer(sBuf.substring(0, sBuf.length() - 2));
                System.out.println(sBuf2);
                sBuf = sBuf2;
                y--;

            } while (y > 0);
        } else
            System.out.println("Указанное число не попадает в запрашиваемый диапазон");
    }
}
