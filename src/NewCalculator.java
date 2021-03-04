import java.util.Scanner;

public class NewCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        float secondNumber = scanner.nextInt();

        float suma = firstNumber + secondNumber;
        float roznica = firstNumber - secondNumber;
        float iloczyn = firstNumber * secondNumber;
        float iloraz = firstNumber / secondNumber;
        float modulo = firstNumber % secondNumber;

        System.out.println("Dodawanie: " + suma);
        System.out.println("Odejmowanie: " + roznica);
        System.out.println("Mnozenie: " + iloczyn);
        System.out.println("Dzielenie: " + iloraz);
        System.out.println("Modulo: " + modulo);

    }
}
