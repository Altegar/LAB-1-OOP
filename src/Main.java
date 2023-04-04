import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a make: ");
        String make = read.nextLine();
        System.out.print("Enter a power: ");
        int power = read.nextInt();
        System.out.print("Enter a price: ");
        int price = read.nextInt();
        System.out.print("Enter a cargo capacity: ");
        int capacity = read.nextInt();
        System.out.println("-------------------------------");

        Engine engine = new Engine(power);
        Truck truck = new Truck(make, price, engine, capacity);
        truck.display();
    }
}