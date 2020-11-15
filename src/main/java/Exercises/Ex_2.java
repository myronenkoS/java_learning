package Exercises;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x.");
        int x = scan.nextInt();
        System.out.println("Введите y.");
        int y = scan.nextInt();


        if (x == 10 || y == 10 || x + y == 10) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
