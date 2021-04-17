// zadanie domowe - stworz 3 obiekty klasy student. przypisz wartosci do pol. stworz tablice i dodaj studentow do tablicy
// przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody z klasy Student

public class StudentChecker2 {

    public static void main(String[] args) {

        Student2 firstStudent = new Student2();
        firstStudent.imie = "Sebastian";
        firstStudent.nazwisko = "Kowalski";
        firstStudent.nick = "Chytry";
        firstStudent.email = "Sebastian@gmail.com";
        firstStudent.nrIndexu = 1234;

        Student2 secondStudent = new Student2();
        secondStudent.imie = "Ziutek";
        secondStudent.nazwisko = "Nowak";
        secondStudent.nick = "Nowy";
        secondStudent.email = "Ziutek@orange.com";
        secondStudent.nrIndexu = 2345;

        Student2 thirdStudent = new Student2();
        thirdStudent.imie = "Liliana";
        thirdStudent.nazwisko = "Wozniak";
        thirdStudent.nick = "Motylek";
        thirdStudent.email = "Liliana@interia.eu";
        thirdStudent.nrIndexu = 3456;

        Student2[] students = new Student2[3];
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
