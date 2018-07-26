package DayTwo.com.vadon;

public class FinalizationDemo {
    public static void main(String[] args) {
        Cake cakeOne = new Cake(1);
        Cake cakeTwo = new Cake(2);
        Cake cakethree = new Cake(3);

        cakeTwo = cakethree = null;
        System.gc();
    }
}

class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}