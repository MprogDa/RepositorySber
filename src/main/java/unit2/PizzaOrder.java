package unit2;

enum Size {
    SMALL,
    MEDIUM,
    BIG
}

public class PizzaOrder {

    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean orderAcc;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.orderAcc = false;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // принятие заказа
    public void order() {
        if (orderAcc) {
            System.out.println("Заказ уже принят");
        }
        else {
            this.orderAcc = true;
            String sauceP;
            if(sauce){
                sauceP =  "с соусом";
            }
            else {
                sauceP =  "без соуса";
            }
            System.out.printf("Заказ принят. %s пицца «%s» %s на адрес %s.%n",  getSizeEnum(), name, sauceP, address);
        }
    }

    // отмена заказа
    public void cancel() {
        if (orderAcc) {
            orderAcc = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят, отмена невозможна.");
        }
    }

    private String getSizeEnum() {
        switch (size) {
            case SMALL:
                return "Маленькая";
            case MEDIUM:
                return "Средняя";
            case BIG:
                return "Большая";
            default:
                return "Нет";
        }
    }
    @Override
    public String toString() {
        return "Пицца: " + " название- " + name + " размер- " + getSizeEnum() + " адрес доставки- " + address + " соус- " + (sauce ? "с соусом" : "без соуса") + " заказ- " + (orderAcc ? "принят" : "не принят") ;
    }
}
