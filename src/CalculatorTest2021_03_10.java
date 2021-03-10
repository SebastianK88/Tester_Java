import java.util.Scanner;

public class CalculatorTest2021_03_10 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Wybierz typ dzialania: Dodawanie, Odejmowanie, Mnozenie, Dzielenie");
        String dzialanie = myscanner.next();

        System.out.println("Wprowadz wartosc nr 1: ");
        float firstNumber = myscanner.nextFloat();

        System.out.println("Wprowadz wartosc nr 2: ");
        float secondNumber = myscanner.nextFloat();

        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        switch (dzialanie) {
            case "Dodawanie":
                System.out.println("Wynik dodawania: " + addition);
                break;
            case "Odejmowanie":
                System.out.println("Wynik odejmowania: " + subtraction);
                break;
            case "Mnozenie":
                System.out.println("Wynik mnozenia: " + multiplication);
                break;
            case "Dzielenie":
                System.out.println("Wynik dzielenia: " + division);
                break;
            default:
                System.out.println("Wybrano bledny typ dzialania.");

        }

    }

}
