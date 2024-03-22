package Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaOrder first = new PizzaOrder(Size.MEDIUM, false, "Северная 7");

        first.order();
        first.order();
        first.cancel();
        first.cancel();

        first.getInfo();

    }

}
