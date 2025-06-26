package unit2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", номер: " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Номера:");
        for (String i : numbers) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "телефон: " + "номер- " + number + " модель- " + model + " вес- " + weight;
    }
}
