public class TypyObiektowe {

     public static void main(String[] args) {
        // liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt od -128 do 127
        Short secondNumber = 32689; // 2 bajty od -32688 do 32687
        Integer thirdNumber = 3276899; // 4 bajty od -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów od -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.9993F; // 4 bajty max ok. 6-7 cyfr po przecinku
        Double sixthNumber = 3.9999999999999D; // 8 bajtów max ok. 15 cyfr po przecinku

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedynczy znak
        Character letter = 'A';

        // ciagi znakow
        String hello = "Hello Sebastian";

        System.out.println(hello.charAt(0));

    }
}




