public class StudentChecker {

    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.imie = "Sebastian";
        firstStudent.nazwisko = "Kowalski";
        firstStudent.login = "Chytry";
        firstStudent.email = "Seba@gmail.com";
        firstStudent.nrIndex = 12345;

        Student secondStudent = new Student();
        secondStudent.imie = "Ziutek";
        secondStudent.nazwisko = "Malewski";
        secondStudent.login = "Gruby";
        secondStudent.email = "Byby@gmail.com";
        secondStudent.nrIndex = 44444;

        Student thirdStudent = new Student();
        thirdStudent.imie = "Kasia";
        thirdStudent.nazwisko = "Brzydula";
        thirdStudent.login = "Ula";
        thirdStudent.email = "UlaBrzydula@wp.pl";
        thirdStudent.nrIndex = 54321;

        Student[] students = new Student[3];
        students[0] = firstStudent;
        students[1] = secondStudent;
        students[2] = thirdStudent;

        for (int i=0; i<students.length; i++) {
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].podajEmail();
            students[i].podajNrIndexu();
        }



    }


}
