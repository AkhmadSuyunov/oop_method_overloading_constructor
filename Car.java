package mohirdev.oop_methodOverloading_constructor;

public class Car {
    private String color;
    private String model;
    private int price;
    private char type;

    public Car(String color, String model, int price, char type) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.type = type;
    }
    public Car() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Color: " + getColor() + ",  Model: " + getModel() + ", Price: " + getPrice() + "$, Type: " + getType());
    }

    public static void main(String[] args) {
        Car car1 = new Car("White", "Cobalt", 11000, 'M');
        car1.displayInfo();

        Car car2 = new Car();

        car2.setColor("Green");
        car2.setModel("BMW");
        car2.setPrice(250000);
        car2.setType('A');

        car2.displayInfo();
    }
}
