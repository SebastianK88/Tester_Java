import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println("Czy " + secondNumber + " jest wieksze niz " + firstNumber + " : " + result);
        System.out.println("Czy " + firstNumber + " jest wieksze niz " + secondNumber + ": " + (firstNumber > secondNumber)); // czy 4 wieksze od 6
        System.out.println("Czy " + firstNumber + " jest mniejsze niz " + secondNumber + ": " + (firstNumber < secondNumber)); // czy 4 mniejsze od 6
        System.out.println("Czy " + firstNumber + " jest wieksze lub rowne " + secondNumber + ": " + (firstNumber >= secondNumber)); // czy 4 wieksze lub rowne 6
        System.out.println("Czy " + firstNumber + " jest mniejsze lub rowne " + secondNumber + ": " + (firstNumber <= secondNumber)); // czy 4 mniejsze lub rowne 6
        System.out.println("Czy " + firstNumber + " jest rowne " + secondNumber + ": " + (firstNumber == secondNumber)); // czy 4 i 6 sa sobie rowne
        System.out.println("Czy " + firstNumber + " jest rozne od " + secondNumber + ": " + (firstNumber != secondNumber)); // czy 4 i 6 sa rozne od siebie


    }
}
