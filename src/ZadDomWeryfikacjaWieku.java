import java.util.Scanner;

public class ZadDomWeryfikacjaWieku {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();

        if (age >= 18 && age < 118) {
            System.out.println("Dziekujemy za zakup alkoholu.");
        } else if (age > 0 && age < 18){
            System.out.println("Niepelnoletnim alkoholu nie sprzedajemy.");
        } else {
            System.out.println("Wprowadzono bledna wartosc.");
        }
    }
}
