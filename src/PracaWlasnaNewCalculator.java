import java.math.MathContext;
import java.util.Scanner;
import static java.lang.Math.*;

public class PracaWlasnaNewCalculator {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner (System.in);
        System.out.println("Wprowadz pierwsza liczbe: ");
        int firstNumber = myscanner.nextInt();
        System.out.println("Wprowadz druga liczbe: ");
        int secondNumber = myscanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;
        double power = pow(firstNumber, secondNumber);
        double sqrt1 = sqrt(firstNumber);
        double sqrt2 = sqrt(secondNumber);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("Potega: " + power);
        System.out.println("Pierwiastek 2 stopnia z 1 liczby: " + sqrt1);
        System.out.println("Pierwiastek 2 stopnia z 2 liczby: " + sqrt2);

    }
}
