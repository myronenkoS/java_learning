package Exercises;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scan.nextInt();

        if (x > 0) {
            if (x % 3 == 0 || x % 5 == 0)
                System.out.println("true");
            else
                System.out.println("false");
        } else
            System.out.println("false");


        //Вариант Валика
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        System.out.println(a > 0 && ((a % 3) == 0 || (a % 5) == 0));

         */
    }
}
