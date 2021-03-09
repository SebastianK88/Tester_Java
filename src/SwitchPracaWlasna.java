import java.util.Scanner;

public class SwitchPracaWlasna {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Wybierz danie: Pizza, Ryba, Frytki");
        String dish = myscanner.next();

        switch (dish) {

            case "Pizza":
                System.out.println("Cena Pizzy to 22zl");
                break;
            case "Ryba":
                System.out.println("Cena Ryby to 35zl");
                break;
            case "Frytki":
                System.out.println("Cena Frytek to 12zl");
                break;
            default:
                System.out.println("Nie ma takiego dania.");

        }
    }
}
