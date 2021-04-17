import java.sql.SQLOutput;
import java.util.Scanner;

public class Powtorka {

    public static void main(String[] args) {

    /*String name;
    String surname;
    String inicials;

    name = "Sebastian";
    surname = "Kowalski";
    inicials = name.charAt(0) + "." + surname.charAt(0) + ".";
        System.out.println(name);
        System.out.println(surname);
        System.out.println("Inicjaly: " + inicials);
*/
   /* float firstNumber;
    float secondNumber;
    float addition;
    float subtraction;

    Scanner scannedNumber = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        firstNumber = scannedNumber.nextFloat();
        System.out.println("Podaj druga liczbe: ");
        secondNumber = scannedNumber.nextFloat();


    addition = firstNumber + secondNumber;
    subtraction = firstNumber - secondNumber;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
*/
  /*  int a;
    int b;
    int c;

    a = 0;
        System.out.println(a);
    b = ++a;
        System.out.println(b);
        System.out.println(a);
    c = a++;
        System.out.println(c);
        System.out.println(a);
*/


    /*int firstNumber;
    String name;
    Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
    firstNumber = scanNumber.nextInt();
        System.out.println("Podana wartosc: " + firstNumber);

    Scanner scanName = new Scanner(System.in);
        System.out.println("Podaj imie:");
    name = scanName.nextLine();
        System.out.println("Podano imie: " + name);*/

   /* int firstNumber = 2;
    int secondNumber = 4;
    boolean result = firstNumber > secondNumber;

        System.out.println(result);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber != secondNumber);*/

   /* boolean firstValue = true;
    boolean secondValue = false;
    boolean thirdValue = true;
    boolean fourthValue = false;

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println( secondValue && fourthValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || fourthValue);
        System.out.println(firstValue && (!secondValue));
        System.out.println(!(secondValue && fourthValue));

    int firstNumber = 2;
    int secondNumber = 4;
    boolean result1 = firstNumber > secondNumber;
    boolean result2 = firstNumber < secondNumber;
        System.out.println(result1 && result2);
        System.out.println(!result1 && result2);*/

    /*float a = 10F;
    float b = 5F;

    if (b==0) {
        System.out.println("Nie dzielimy przez zero");
    } else if (b!=0) {
        System.out.println("Wynik dzielenia a przez b to: " + a/b);
    }
*/

        /*Scanner numberScan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = numberScan.nextInt();

        if (number > 0) {
            System.out.println("Wartość jest większa niż 0");
        } else if (number < 0) {
            System.out.println("Wartość jest mniejsza niż 0");
        } else if (number == 0) {
            System.out.println("Wartość jest równa 0");
        } else {
            System.out.println("Podano błędną wartość");
        }
*/

       /* Scanner ageScan = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int age = ageScan.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("Niepełnoletnim alkoholu nie sprzedajemy.");
        } else if (age >= 18 && age < 123) {
            System.out.println("Dziękujemy za zakupy.");
        } else if (age <= 0 || age >= 123) {
            System.out.println("Podano błędną wartość.");
        }*/
/*

        Scanner scanAge = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        int age = scanAge.nextInt();

        if (age > 0 && age < 18) {
            System.out.println("Niepelnoletnim alkoholu nie sprzedajemy.");
        } else if (age <= 0 || age > 123) {
            System.out.println("Podano bledna wartosc.");
        } else if (age >= 18 && age <= 123) {
            System.out.println("Dziekujemy za zakupy.");
        }
*/
/*
    Scanner scanDish = new Scanner(System.in);
        System.out.println("Wybierz danie: pizza, lody, frytki");
    String dish = scanDish.next();

    switch (dish) {
        case "pizza":
            System.out.println("Pizza kosztuje 20 zl");
            break;
        case "lody":
            System.out.println("Lody kosztuja 12 zl");
            break;
        case "frytki":
            System.out.println("Frytki kosztuja 10 zl");
            break;
        default:
            System.out.println("Nie ma takiego dania.");
    }*/

   /* Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj wartosc max");
    int max = scanNumber.nextInt();

    for (int i = 0; i <= max; i++) {
        if (i%3 == 1)
        System.out.println(i);
    }

    */
/*

    Scanner scanDish = new Scanner(System.in);
        System.out.println("Wybierz danie: a, b, c");
    String dish = scanDish.next();

    switch (dish) {
        case "a":
            System.out.println("cena to a");
            break;
        case "b":
            System.out.println("cena to b");
            break;
        case "c":
            System.out.println("cena to c");
            break;
        default:
            System.out.println("brak dania");
    }
*/

   /* int number = 21;
    while (number < 20) {
        System.out.println("Wartosc " + number + " jest mniejsza od 20.");
        number++;
    }*/

    /*int number2 = 21;
    do {
        System.out.println("Wartosc " + number2 + " jest mniejsza od 20.");
        number2++;
    } while (number2 < 20);
*/

    /*    String[] imiona = new String[3];

        imiona[0] = "Kasia";
        imiona[1] = "Ziutek";
        imiona[2] = "Seba";
*//*
            System.out.println(imiona[0]);
            System.out.println(imiona[1]);
            System.out.println(imiona[2]);*//*

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
           *//* System.out.println(lottoNumbers[0]);
            System.out.println(lottoNumbers[1]);
            System.out.println(lottoNumbers[2]);
            System.out.println(lottoNumbers[3]);
            System.out.println(lottoNumbers[4]);
            System.out.println(lottoNumbers[5]);

            System.out.println("Dlugosc tablicy " + lottoNumbers.length);*//*

        for (int i=0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }
        for (int j=0; j< imiona.length; j++) {
            System.out.println(imiona[j]);
        }

*/

       /* int number = 100;
        for (int i=0; i<=number; i++) {
            if (i%3==0)
            System.out.println("Wartosc " + i + " jest podzielna przez 3.");
        }*/

      /*  int[] numbers = new int[] {1,3,5,7,9};
        for (int j=0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }
        for (int j=0; j<(numbers.length/2);j++) {
            int temp = numbers[j]; // j=0
            numbers[j] = numbers[numbers.length-1-j]; // poz 4 -> 9
            numbers[numbers.length-1-j] = temp; // 1

        }
        for (int j=0; j<numbers.length; j++) {
            System.out.println(numbers[j]);
        }*/

/*
        int num = 10;
        if (num > 0) {
            System.out.println("Liczba " + num + " jest wieksza od 0");
        } else {
            System.out.println("Bledna liczba");
        }
*/

      /*  String dish = "Pizza";

        switch (dish) {
            case "Pizza":
                System.out.println("Danie to pizza.");
                break;
            default:
                System.out.println("Brak takiego dania.");
        }*/

/*
        for (int i=0; i<20; i=i+2) {
            if (i%3==0)
            System.out.println(i);
        }
*/
  /*      int num = 20;
        while (num<30) {
            System.out.println(num + " jest mniejsze niz 30.");
            num++;
        }*/

    /*    int num = 20;
        do {
            System.out.println(num + " jest mniejsze od 10");
            num++;
        } while (num<10);
*/


  /*      int[] tablica = new int[] {1,2,3};

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);

        for (int i=0; i<3; i++) {
            System.out.println(tablica[i]);
        }*/

 /*       String[] imiona = new String[3];

        imiona[0] = "Seba";
        imiona[1] = "Ziutek";
        imiona[2] = "Ewa";

        for (int i=0; i<3; i++) {
            System.out.println(imiona[i]);
        }*/

 /*       for (int i=0; i<=100; i++) {
            if (i%3==0)
            System.out.println(i);
        }*/


/*        int[] odwrot = new int[] {1,4,6,9};
        for (int i=0; i<odwrot.length;i++) {
            System.out.println(odwrot[i]);
        }
        for (int i=0; i<(odwrot.length/2);i++) {
            int temp = odwrot[i];
            odwrot[i] = odwrot[odwrot.length-1-i];
            odwrot[odwrot.length-1-i] = temp;
        }
        for (int i=0; i<odwrot.length;i++) {
            System.out.println(odwrot[i]);
        }*/


        int[] lotto = new int[] {1,3,4,6,7};
        for (int i=0; i< lotto.length; i++) {
            System.out.println(lotto[i]);
        }
        for (int i=0; i< (lotto.length/2); i++) {
            int temp = lotto[i];
            lotto[i] = lotto[lotto.length-1-i];
            lotto[lotto.length-1-i] = temp;
            System.out.println("Nr iteracji: " + i);
        }
        for (int i=0; i< lotto.length; i++) {
            System.out.println(lotto[i]);
        }

        String imie = new String("Kasia");
        String imie2 = "Magda";

    }
}
