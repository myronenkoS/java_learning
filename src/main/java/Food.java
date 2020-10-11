public class Food {
    private String whatIsIt; //вид продукта
    private boolean isSoup; // возможно это суп
    private double weight; // у продукта может быть разный вес
    private int kCal; // килокалории пляшут туда сюда


    public String getWhatIsIt () {
        return  whatIsIt;
    }
    public void setWhatIsIt (String whatIsIt) {
        this.whatIsIt = whatIsIt;
    }
    public boolean isSoup () {
        return isSoup;
    }
    public void setSoup (boolean Soup) {
        isSoup = Soup;
    }
    public double getWeight () {
        return weight;
    }
    public void setWeight (double weight) {
        this.weight = weight;
    }
    public int getkCal () {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }

    public static void main(String args[]) {
        Food ob = new Food();

        ob.setWhatIsIt("Колбаса");
        System.out.println(ob.getWhatIsIt());

        ob.setSoup(false);
        if (ob.isSoup()) System.out.println("Cуп");

        ob.setWeight(0.500);
        System.out.println(ob.getWeight());

        ob.setkCal(4000);
        System.out.println(ob.getkCal());

        System.out.println();

    }



}
