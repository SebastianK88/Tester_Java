import java.util.Scanner;

public class ObiektyPowtorkaKalkulator {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj wartosc a: ");
        float firstNum1 = scanNumber.nextFloat();
        System.out.println("Podaj wartosc b: ");
        float secondNum2 = scanNumber.nextFloat();

        ObiektyPowtorka result = new ObiektyPowtorka();
        result.firstNum = firstNum1;
        result.secondNum = secondNum2;

        result.addition();
        result.subtraction();
        result.multiplication();
        result.division();
        result.modulo();





    }
}
