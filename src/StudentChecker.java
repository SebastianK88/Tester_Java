// zadanie domowe - stworz 3 obiekty klasy student. przypisz wartosci do pol. stworz tablice i dodaj studentow do tablicy
// przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody z klasy Student

import java.util.Scanner;

public class StudentChecker {

    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.imie = "Sebastian";
        firstStudent.nazwisko = "Kowalski";
        firstStudent.nick = "Chytry";
        firstStudent.email = "Sebastian@gmail.com";
        firstStudent.nrIndexu = 1234;

        Student secondStudent = new Student();
        secondStudent.imie = "Ziutek";
        secondStudent.nazwisko = "Nowak";
        secondStudent.nick = "Nowy";
        secondStudent.email = "Ziutek@orange.com";
        secondStudent.nrIndexu = 2345;

        Student thirdStudent = new Student();
        thirdStudent.imie = "Liliana";
        thirdStudent.nazwisko = "Wozniak";
        thirdStudent.nick = "Motylek";
        thirdStudent.email = "Liliana@interia.eu";
        thirdStudent.nrIndexu = 3456;

        Student[] students = new Student[3];
        students[0] = firstStudent;
        students[1] = secondStudent;
        students[2] = thirdStudent;


        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndexu();
            students[i].zalogujSie();


        }


    }
}
