import java.util.Scanner;

public class ZadDomCalculator {
// napisz program ktory poprosi uzytkownika o 2 liczby, a nastepnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Wprowadz druga liczbe: ");
        float secondNumber = scanner.nextFloat();
        float result;

        result = firstNumber + secondNumber;
        System.out.println("Suma: " + result);
        result = firstNumber - secondNumber;
        System.out.println("Różnica: " + result);
        result = firstNumber * secondNumber;
        System.out.println("Iloczyn: " + result);
        result = firstNumber / secondNumber;
        System.out.println("Iloraz: " + result);
        result = firstNumber % secondNumber;
        System.out.println("Modulo: " + result);

        // inne rozwiazanie
        /*float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        float mod = firstNumber % secondNumber;

        System.out.println("Suma: " + addition);
        System.out.println("Roznica: " + subtraction);
        System.out.println("Iloczyn: " + multiplication);
        System.out.println("Iloraz: " + division);
        System.out.println("Modulo: " + mod);*/

    }
}
