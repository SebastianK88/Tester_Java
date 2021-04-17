public class Metody {

    public void policzWynik() {
        System.out.println("Licze wynik.");
        int result = 0;
        for (int i=0; i<100; i++ ) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
    }

    public int pobierzWYnik() {
        System.out.println("Pobieram wynik.");
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
        return result;
    }
    public void policzWynikParam(int number) {
        System.out.println("Number ma wartosc: " + number);
        System.out.println("Licze wynik.");
        int result = 0;
        for (int i=0; i<number; i++ ) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);
    }

    public int add(int firstNumber, int secondNumber, String word) {
        //System.out.println("Suma to: " + (firstNumber+secondNumber));
        return firstNumber + secondNumber;
    }
}
