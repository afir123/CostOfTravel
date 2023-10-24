import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj w programie wyliczania kosztu podróży!");
        System.out.println("Podaj odległość");
        Scanner scanner = new Scanner(System.in);
        double lengh = scanner.nextDouble();

        System.out.println("Podaj cene paliwa");
        double price = scanner.nextDouble();
        System.out.println("Podaj spalanie auta (l/100km)");
        double fuelUsage = scanner.nextDouble();


        System.out.println("Odległość to: "+ lengh);
        System.out.println("Cena paliwa to: " + price);
        System.out.println("Spalanie samochodu to: " + fuelUsage);
        double cost = ((lengh * fuelUsage)/100)*price;
        long round = Math.round(cost);
        System.out.println("Twój koszt podróży to: " + round + "zł");

    }
}