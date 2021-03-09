public class PetlaFor {

    public static void main(String[] args) {

        // wypisz liczby od 0 do 100 podzielne przez 2

        int number = 100;

        for (int i = 0; i < 100; i=i+2) {
            // i to jest zmienna sterujaca
            System.out.println(i);
        }

        for (int i = 0; i < number; i++) {

            if (i%5 == 0) {
                System.out.println(i);
            }
        }

        for (int j = 0; j <= number; j++) {
            System.out.println("Wyswietl tekst " + j + " razy.");

        }
    }
}
