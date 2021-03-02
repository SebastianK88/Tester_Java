public class Zmienne {
// zmienna to zarezerwowane miejsce z okreslonym typem danych - w javie trzeba zadeklarowac zmienna

    String name = "Sebastian";
    // String - to jest typ danych
    // name - to jest nazwa zmiennej

    public static void main(String[] args) {
        // int firstNumber, secondNumber, result; // jesli zmienne maja ten sam typ np int to mozna je zadeklarowac wczesniej a potem przypisywac jedynie wartosci
        int firstNumber;
        int secondNumber;
        int result; // mozna tez wymienic zmienne jako lista

        // konwencja - pierwszy wyraz zaczynamy z malej litery ale jesli sa 2 lub wiecej wyrazow to kolejne wyrazy zaczynamy z wielkiej litery nie dajac spacji

        String name = "Sebastian"; // zeby sie odwolac do zmiennej trzeba te zmienna wrzucic do metody czyli do maina
        firstNumber = 1;
        secondNumber =2;
        result = firstNumber + secondNumber;

     //   name = "Ziutek";
        System.out.println(name);
        System.out.println(result);



    }
}
