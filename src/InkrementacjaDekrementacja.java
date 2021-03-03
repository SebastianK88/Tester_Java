public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        // inkrementacja
        int a = 0;
        System.out.println("Wartość a: " + a); // 0
        int b = a++; // jesli ++ jest po zmiennej to jest to postinkrementacja
        System.out.println("Wartość b: " + b); // przy postinkrementacji najpierw do b przypisywana jest stara wartosc a czyli 0 a dopiero potem zwiekszana jest o 1
        System.out.println("Wartość a: " + a); // inkrementacja spowoduje wzrost o 1
        int c = ++a; // jesli ++ jest przed zmienna to jest to preinkrementacja
        System.out.println("Wartość c: " + c); // wartosc wyniesie 2 bo a zwiekszylismy najpierw i jak widac ponizej juz wynosi 2
        System.out.println("Wartość a: " + a); // inkrementacja spowoduje wzrost o 1 ale wczesniej juz wartosc zwiekszylismy czyli tera bedzie 2

        // dekrementacja
        int d = 0;
        System.out.println("Wartość d: " + d); // 0
        int e = d--; // jesli -- jest po zmiennej to jest to postdekrementacja
        System.out.println("Wartość e: " + e); // przy postdekrementacji najpierw do e przypisywana jest stara wartosc d czyli 0 a dopiero potem zmniejszana jest o 1
        System.out.println("Wartość d: " + d); // dekrementacja spowoduje spadek o 1 czyli -1
        int f = --d; // jesli -- jest przed zmienna to jest to predekrementacja
        System.out.println("Wartość f: " + f); // wartosc wyniesie -2 bo a zmniejszylismy najpierw i jak widac ponizej juz wynosi -2
        System.out.println("Wartość d: " + d); // dekrementacja spowoduje spadek o 1 ale wczesniej juz wartosc zmniejszylismy czyli tera bedzie -2

    }
}
