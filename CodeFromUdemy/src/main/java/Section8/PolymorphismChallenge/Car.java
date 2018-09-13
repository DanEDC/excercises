package Section8.PolymorphismChallenge;


class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base model");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW(6, "116i");

        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Fiat fiat = new Fiat(4, "Grande Punto");

        System.out.println(fiat.startEngine());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());

        Audi audi = new Audi(6, "A4");

        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
    }
}

class Audi extends Car {

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> starts engine";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate";
    }

    @Override
    public String brake() {
        return "Audi -> brakes";
    }
}

class Fiat extends Car {

    public Fiat(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Fiat -> starts engine";
    }

    @Override
    public String accelerate() {
        return "Fiat -> accelerate";
    }

    @Override
    public String brake() {
        return "Fiat -> brakes";
    }
}

class BMW extends Car {

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> starts engine";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate";
    }

    @Override
    public String brake() {
        return "BMW -> brakes";
    }
}

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> starts engine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brakes";
    }
}
