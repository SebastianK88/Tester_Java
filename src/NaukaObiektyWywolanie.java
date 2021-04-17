import java.util.Scanner;

public class NaukaObiektyWywolanie {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int age = data.nextInt();
        System.out.println("Podaj swoje imie: ");
        String name = data.next();
        System.out.println("Podaj swoje nazwisko: ");
        String surname = data.next();

        NaukaObiekty osoba = new NaukaObiekty();
        osoba.name = name;
        osoba.surname = surname;
        osoba.age = age;

        NaukaObiekty[] person = new NaukaObiekty[1];
        person[0] = osoba;

        for (int i=0; i<person.length; i++ ) {
            person[i].powitanie();
            person[i].wiek();
        }



    }


}
