package kitsoftlesson;

import lombok.Getter;


public class Orange extends Food implements FoodColor {

    public void cfood(Color colorfood) {
        switch (colorfood) {
            case BLUE:
                System.out.println("Цвет синий.");
                break;
            case GREEN:
                System.out.println("Цвет зеленый.");
                break;
            case ORANGE:
                System.out.println("Цвет оранжевый.");
                break;
            case RED:
                System.out.println("Цвет красный.");
                break;

        }
    }


    @Getter
    private int month;

    public void setMonth(int month) {
        this.month = month;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Фрукты собраны зимой");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Фрукты собраны весной");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Фрукты собраны летом");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Фрукты собраны осенью");
                break;
            default:
                System.out.println("Проверьте свой календарь. Там значения от 1-го до 12-ти. Вот их и вводите.");
        }
    }
}