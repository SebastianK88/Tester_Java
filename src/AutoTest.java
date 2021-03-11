public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto(); // tzw OBIEKT klasy AUTO ktory ma zmienna typu Auto o nazwie mercedes
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2020;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A4";
        audi.rok = 2010;
        audi.przebieg = 100000;

        audi.jedz();
        audi.hamuj();
        audi.info();


        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info(); // wyswietli komunikat null dla marki i modelu bo String oraz 0 dla roku i przebiegu bo int. jesli napiszemy Intiger to bedzie tez null


    }

}
