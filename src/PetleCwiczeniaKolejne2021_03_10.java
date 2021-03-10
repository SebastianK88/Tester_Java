import java.util.Scanner;

public class PetleCwiczeniaKolejne2021_03_10 {
// wypisz liczby od 0 do wartosci wprowadzonej, podzielne przez 2 --- do dopracowania

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe od 1 do 10");
        int number = myscanner.nextInt();
        int i = 0;

        if (number < 0 || number > 10) {
            System.out.println("Podano wartosc spoza zakresu.");
        } else if (number >= i && i % 2 == 0) {
            System.out.println(i);

        }
    }
}
