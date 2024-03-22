package Phone;

public class Main {

    public static void main(String[] args) {

        Phone nokia = new Phone();
        System.out.println(nokia.getInfo());
        System.out.println(nokia.getNumber());

        Phone samsung = new Phone("89535128822", "s5 mini");
        System.out.println(samsung.getInfo());
        System.out.println(samsung.getNumber());

        Phone asus = new Phone("89526781267", "rog 6s", 213);
        System.out.println(asus.getInfo());
        System.out.println(asus.getNumber());

        nokia.receiveCall("Антон");
        samsung.receiveCall("Настя", "89577852465");
        asus.sendMessage();

    }

}
