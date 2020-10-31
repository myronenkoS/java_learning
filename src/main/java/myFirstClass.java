import kitsoftlesson.*;

class myFirstClass {
    public static void main(String[] args) {


        Fish fi = new Fish();
        fi.cfood(Color.GREEN);

        Pineapple pin = new Pineapple();
        pin.cfood(Color.RED);

        Banana ban = new Banana();
        ban.cfood(Color.BLUE);

        Orange or1 = new Orange();
        or1.cfood(Color.ORANGE);

        or1.setMonth(7); // как убрать вывод самого значения 7 ????
        System.out.println(or1.getMonth());


    }
}