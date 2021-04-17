public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "X5";
        mercedes.rok = 2015;
        mercedes.przebieg = 20000;

        mercedes.jedz();
        mercedes.stoj();
        mercedes.info();

        Auto skoda = new Auto();
        skoda.marka = "Skoda";
        skoda.model = "Fabia";
        skoda.rok = 2010;
        skoda.przebieg = 120000;

        skoda.jedz();
        skoda.stoj();
        skoda.info();

        Auto fiat = new Auto();
        fiat.marka = "Fiat";
        fiat.rok = 2000;

        fiat.info();


    }

}
