package Phone;

public class Phone {

    private String number;

    private String model;

    private float weight;

    public Phone() {
        System.out.println("Created Phone.");
    }

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println("Created Phone with number, model and weight.");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        System.out.println("Created Phone with number, model.");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + "!");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " ("+ number + ")!");
    }

    public String getNumber() {
        return "Number: " + number + "\n";
    }

    public void sendMessage() {
        System.out.println("89517395153\n89415436732\n89258546237");
    }

    public String getInfo() {
        return ("Number: " + number
                + "\nModel: " + model
                + "\nWeight: " + weight
                + "\n");
    }

}