public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
        int mod = secondNumber % firstNumber;

        /*System.out.println("Dodawanie " + addition);
        System.out.println("Odejmowanie " + subtraction);
        System.out.println("Mnozenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Reszta z dzielenia " + mod);
*/
        // ponizej mamy nadpisywanie wartosci . zmienna firstnumber jest zmieniana po kazdej operacji
        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Dodawanie " + firstNumber);
        firstNumber-=secondNumber; // firstNumber = firstNumber - secondNumber
        System.out.println("Odejmowanie " + firstNumber);
        firstNumber*=secondNumber; // firstNumber = firstNumber * secondNumber
        System.out.println("Mnozenie " + firstNumber);
        firstNumber/=secondNumber; // firstNumber = firstNumber / secondNumber
        System.out.println("Dzielenie " + firstNumber);
        firstNumber%=secondNumber; // firstNumber = firstNumber % secondNumber
        System.out.println("Reszta z dzielenia " + firstNumber);


    }
}
