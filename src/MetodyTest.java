public class MetodyTest {

    public static void main(String[] args) {

        Metody metody = new Metody();
        metody.pobierzWynik();


        int result =  metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultant pomnozony * 2: " + result2);

    }

}
