public class Student {

    public String imie;
    public String nazwisko;
    public String login;
    public String email;
    public int nrIndex;

    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Loguje sie loginem: " + login);
    }

    public void podajNrIndexu() {
        System.out.println("Moj numer indexu to: " + nrIndex);
    }

    public void podajEmail() {
        System.out.println("Moj adres email to: " + email);
    }

}
