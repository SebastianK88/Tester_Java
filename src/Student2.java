public class Student2 { // klasa o nazwie Student - tej samej nazwie co plik

    public String imie; // tzw. pole o nazwie imie, nazwisko, nick itd
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndexu;

    public void przedstawSie() { // to jest tak zwana metoda
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie za pomoca: " + nick);
    }

    public void podajNrIndexu() {
        System.out.println("Moj nr indexu to: " + nrIndexu);
    }

    public void podajEmail() {
        System.out.println("Moj email to: " + email);
    }

}
