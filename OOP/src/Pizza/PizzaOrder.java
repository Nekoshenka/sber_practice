package Pizza;

public class PizzaOrder {

    private Size size;

    private boolean withSauce;

    private String address;

    private boolean isAccepted;

    public PizzaOrder(Size size, boolean withSauce, String address) {

        this.size = size;
        this.withSauce = withSauce;
        this.address = address;
        System.out.println("\nЗаказ создан.");

    }

    public void order() {

        if (!isAccepted) {
            System.out.print("\nЗаказ принят. ");
            switch (size) {
                case BIG:
                    System.out.print("Большая пицца \"Аль-Капчоне\" ");
                    break;
                case MEDIUM:
                    System.out.print("Средняя пицца \"Аль-Капчоне\" ");
                    break;
                case SMALL:
                    System.out.print("Маленькая пицца \"Аль-Капчоне\" ");
                    break;
            }
            if (withSauce) {
                System.out.print("с соусом ");
            } else {
                System.out.print("без соуса ");
            }
            System.out.println("на адрес " + address + ".");
            isAccepted = true;
        } else {
            System.out.println("Заказ уже принят.");
        }

    }

    public void cancel() {
        if (isAccepted) {
            System.out.println("Заказ отменён.");
            isAccepted = false;
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public void setWithSauce(boolean withSauce) {
        this.withSauce = withSauce;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSauce() {
        String withSauce = "Нет";
        if (this.withSauce) {
            withSauce = "Да";
        }
        return withSauce;
    }

    public String getSize() {
        String size = null;
        switch (this.size) {
            case BIG:
                size = "Большая";
                break;
            case MEDIUM:
                size = "Средняя";
                break;
            case SMALL:
                size = "Маленькая";
                break;
        }
        return size;
    }

    public String getAddress() {
        return address;
    }

    public void getInfo() {
        System.out.println("\nРазмер: " + getSize()
        + "\nСоус есть в заказе: " + getSauce()
        + "\nАдрес: " + getAddress());
    }

}
