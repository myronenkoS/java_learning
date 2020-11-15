package Exercises;

import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {


        Scanner scanA = new Scanner(System.in);
        System.out.println("Введите значение А");
        int a = scanA.nextInt();

        Scanner scanB = new Scanner(System.in);
        System.out.println("Введите значение B");
        int b = scanB.nextInt();

        double c = (double) a / b;
        System.out.println("Результат деления А на B равен: " + c);
    }
}
