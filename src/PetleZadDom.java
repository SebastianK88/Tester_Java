public class PetleZadDom {

    public static void main(String[] args) {

        // wypisz liczby z zakresu od 1 do 100 podzielne przez 3
        // odwroc elementy tablicy [1,3,5,7,0] -> [0,7,5,3,1]
      /*  System.out.println("Wartosci podzielne przez 3 bez reszty.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Wartosc: " + i + " jest podzielna bez reszty przez 3");
            }
        }*/

        System.out.println("Tabela normalna.");
        int[] cyfry = new int[] {1,3,5,7,0,8}; // nie wazne czy parzysta czy nieparzysta liczba cyfr
        for (int i = 0; i < cyfry.length; i++) {
            System.out.println(cyfry[i]);

        }

        System.out.println("Tabela odwrocona.");
        for (int i = 0; i < cyfry.length/2; i++) {
            int temp = cyfry[i]; // dla i = 0 bedzie wartosc 1
            cyfry[i] = cyfry[cyfry.length-1-i]; // do wartosci 0 (czyli pierwszej) z tabeli przypisujemy wartosc dlugosc tabeli czyli 4 minus 1 bo zaczynamy od 0 i minus i w tym przypadku 0
            cyfry[cyfry.length-1-i] = temp;
            System.out.println("Iteracja nr " + i);

        }

        for (int i = 0; i < cyfry.length; i++) {
            System.out.println(cyfry[i]);
        }
    }
}
