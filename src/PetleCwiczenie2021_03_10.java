import java.util.Scanner;

public class PetleCwiczenie2021_03_10 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Podaj nazwe produktu: Jablko, Pomidor, Ziemniak");
        String dish = myscanner.next();
        System.out.println("Podaj liczbe sztuk: ");
        int number = myscanner.nextInt();

        int cenaJablka = 8;
        int cenaPomidora = 6;
        int cenaZiemniaka = 14;

        int multiplicationJablko = number * cenaJablka;
        int multiplicationPomidor = number * cenaPomidora;
        int multiplicationZiemniak = number * cenaZiemniaka;

        switch (dish) {
            case "Jablko":
                System.out.println("Cena jablek to: " + multiplicationJablko + " zl");
                break;
            case "Pomidor":
                System.out.println("Cena pomidorow to: " + multiplicationPomidor + " zl");
                break;
            case "Ziemniak":
                System.out.println("Cena ziemniakow to: " + multiplicationZiemniak + " zl");
                break;
            default:
                System.out.println("Podano bledne wartosci.");
        }


    }


}
