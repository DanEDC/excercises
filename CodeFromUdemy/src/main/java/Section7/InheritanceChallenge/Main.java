package Section7.InheritanceChallenge;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(5, "VTurbo", 6, 60, "Cabrio",
                "Red", true, 4);

        car.acceleration(20);
        car.decreasing(50);
        car.changeGear(-2);
        car.reverseGear(10);
        System.out.println(car.getSpeed());
        System.out.println(car.getCurrentGear());
        car.steering();

        BMW bmw116i = new BMW(5, "136HP", 6, 100, "Hackback", "Grey"
                , 4, 2);

        bmw116i.acceleration(30);


    }
}
