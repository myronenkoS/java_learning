package kitsoftlesson;

public class Pineapple extends Food implements FoodColor {
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
}
