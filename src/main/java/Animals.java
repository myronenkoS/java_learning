public class Animals {
    private int fur; // животное линяет или обрастает шерстью
    private boolean isFish; //возможно животное рыба =D
    private double legs; // все равно будем использовать тут целые числа, так как лапы у нашей рыбы будут целые!!!!
    private byte tail; // тут их не должно быть много

    public int getFur(){
        return fur;
    }
    public void setFur(int fur){
        this.fur = fur;
    }
    public boolean isFish () {
        return isFish;
    }
    public void setFish (boolean Fish) {
        isFish = Fish;
    }
    public double getLegs () {
        return legs;
    }
    public void  setLegs (double legs) {
        this.legs = legs;
    }
    public byte getTail () {
        return tail;
    }
    public void setTail (byte tail) {
        this.tail = tail;
    }
    public static void main (String args[]) {
        Animals an = new Animals();

        an.setFur(40);
        System.out.println(an.getFur());

        an.setFish(false);
        if (an.isFish())
            System.out.println("Рыба");
        else
            System.out.println("Не рыба");

        an.setLegs(10);
        System.out.println(an.getLegs());

        an.setTail((byte)7);
        System.out.println(an.getTail());
    }

}
