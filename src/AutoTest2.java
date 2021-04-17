public class AutoTest2 {

    public static void main(String[] args) {

        Auto2 mercedes = new Auto2(); // tzw OBIEKT klasy AUTO ktory ma zmienna typu Auto o nazwie mercedes
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2020;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();


        Auto2 audi = new Auto2();
        audi.marka = "Audi";
        audi.model = "A4";
        audi.rok = 2010;
        audi.przebieg = 100000;

        audi.jedz();
        audi.hamuj();
        audi.info();


        Auto2 noName = new Auto2();

        noName.jedz();
        noName.hamuj();
        noName.info(); // wyswietli komunikat null dla marki i modelu bo String oraz 0 dla roku i przebiegu bo int. jesli napiszemy Intiger to bedzie tez null


    }

}
