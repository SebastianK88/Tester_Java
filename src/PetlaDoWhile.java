public class PetlaDoWhile {

    public static void main(String[] args) {

        int i = 21; // program wyswietli ze 21 jest mniejsze niz 20. petla zaczyna od wyswietlenia tekstu a dopiero potem weryfikuje warunek

        do {
            System.out.println("Wartosc " + i + " jest mniejsza od 20");
            i++;
        } while (i < 20);

    }
}
