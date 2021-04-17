public class ObiektyPowtorka {

    public float firstNum;
    public float secondNum;
    public float addition = firstNum + secondNum;
    public float subtraction = firstNum - secondNum;
    public float multiplication = firstNum * secondNum;
    public float division = firstNum / secondNum;
    public float modulo = firstNum % secondNum;

    public void addition() {
        System.out.println("Wynik dodawania to: " + addition);
    }
    public void subtraction() {
        System.out.println("Wynik odejmowania to: " + subtraction);
    }
    public void multiplication() {
        System.out.println("Wynik mnozenia to: " + multiplication);
    }
    public void division() {
        System.out.println("Wynik dzielenia to: " + division);
    }
    public void modulo() {
        System.out.println("Wynik modulo to: " + modulo);
    }

}
