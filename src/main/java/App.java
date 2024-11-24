
public class App {

    public static void main(String[] args) {
        Car car1 = new Car("GLE", "Mercedes", "white", 2020, 5, 350_000);
        Car car2 = new Car("GLC", "Mercedes", "silver", 2023, 3, 200_000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("Hashcode of car1 is: " + car1.hashCode());
        System.out.println("Hashcode of car2 is: " + car2.hashCode());
    }
}

