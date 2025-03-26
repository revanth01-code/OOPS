class Vehicle {
    String Brand;
    String Color;
    String Fuel;
    boolean Sunroof;

    Vehicle(String Brand, String Color, String Fuel, boolean Sunroof) {
        this.Brand = Brand;
        this.Color = Color;
        this.Fuel = Fuel;
        this.Sunroof = Sunroof;
    }

    void display() {
        System.out.println("Brand: " + Brand);
    }
}

class Car extends Vehicle {
    int Speed;

    Car(String Brand, String Color, String Fuel, boolean Sunroof, int Speed) {
        super(Brand, Color, Fuel, Sunroof);
        this.Speed = Speed;
    }

    @Override
    void display() {
        System.out.println("Brand: " + Brand);
        System.out.println("Color: " + Color);
        System.out.println("Fuel: " + Fuel);
        System.out.println("Sunroof: " + Sunroof);
        System.out.println("Speed: " + Speed);
    }
}

public class Vehicle_Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Blue", "Gasoline", true, 120);
        car.display();
    }
}
