public class OperatoryLogiczne {

    public static void main(String[] args) {

        /*boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;*/
        // nie trzeba na sztywno przypisywac do zmiennej wartosci true/false mozna wykorzystac operator porownania
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
        boolean thirdValue = 2 < 1;
        boolean fourthValue = 2 > 1;

        // && - "i" -> true gdy wyrazenia skladowe sa rozne true
        System.out.println(firstValue && secondValue); // wynik: false
        System.out.println(firstValue && fourthValue); // wynik: true
        System.out.println(secondValue && thirdValue); // wynik: false
        // || - "lub" -> true gdy jedno z wyrazen skladowych jest rowne true
        System.out.println(firstValue || secondValue); // wynik: true
        System.out.println(secondValue || thirdValue); // wynik: false
        System.out.println(firstValue || fourthValue); // wynik: true
        // ! - "negacja" - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue); // wynik: false
        System.out.println(!secondValue); // wynik: true

        System.out.println(!(firstValue&&secondValue)); // true i false daje false ale zanegowane daje true


    }
}
