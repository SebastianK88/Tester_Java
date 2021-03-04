import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Wprowadz liczbe od -10 do 10");
        float number = scanner.nextFloat();

        if (number > 0 && number < 10) {
            System.out.println("Wartosc jest dodatnia");
        } else if (number > 2) {
            System.out.println("Wartosc jest wieksza niz 2"); // wiadomosc nie zostanie wyswietlona bo system konczy prace po spelnieniu pierwszego warunku
        } else if (number < 0 && number > -10) {
            System.out.println("Wartosc jest ujemna");
        } else if (number == 0) {
            System.out.println("Wartosc jest rowna 0");
        } else {
            System.out.println("Wprowadzono wartosc spoza zakresu");
        }
    }
}
