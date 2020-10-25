import kitsoftlesson.Cat;
import kitsoftlesson.Dog;

class myFirstClass {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setFur(40);
        System.out.println("А вот и шерсть " + dog.getFur());

        Cat cat = new Cat();
        cat.setFish(false);


    }
}