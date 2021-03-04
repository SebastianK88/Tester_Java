import java.util.Scanner;

public class InstrukcjaWarunkowaIfElse {

    public static void main(String[] args) {
        // instrukcja warunkowa pozwala okreslic ktora czesc kodu ma zostac wykonana gdy zostanie spelniony warunek

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza wartosc: ");
        float dzielna = scanner.nextFloat();
        System.out.println("Wprowadz druga wartosc: ");
        float dzielnik = scanner.nextFloat();
        if (dzielnik!=0) {
            System.out.println("Wynik dzielenia to: " + (dzielna/dzielnik));
        } else {
            System.out.println("Nie mozna dzielic przez 0 !");
        }
    }
}
