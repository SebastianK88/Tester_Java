import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner (System.in);
        System.out.println("Wybierz danie z listy: Pizza, Ryba, Frytki");
        String meal = myscanner.next();

        switch (meal) {
            case "Pizza":
                System.out.println("Cena pizzy to 22 zl");
                break;
            case "Ryba":
                System.out.println("Cena ryby to 35 zl");
                break;
            case "Frytki":
                System.out.println("Cena frytek to 12 zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania.");


        }
    }
}
