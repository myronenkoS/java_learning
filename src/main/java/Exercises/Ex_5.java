package Exercises;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        int x = 0;
        while (x < 1 || x > 5) {
            System.out.println("Укажите оценку от 1 до 5");
            Scanner rating = new Scanner(System.in);
            x = rating.nextInt();
        }
        switch (x) {
            case 1:
                System.out.println("Очень неудовлетворительно");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Могло быть и лучше");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;


        }
    }
}
