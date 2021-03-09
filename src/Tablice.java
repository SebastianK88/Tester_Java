public class Tablice {

    public static void main(String[] args) {

        String[] imiona = new String[3];

        imiona[0] = "Sebastian";
        imiona[1] = "Ziutek";
        imiona[2] = "Liliana";

/*        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

        int[] lottoNumbers = new int[] {1,4,7,9,12,20};
/*        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println("Elementow w tablicy: " + lottoNumbers.length);*/

        for (int i = 0; i < imiona.length; i++) {
            System.out.println(imiona[i]);
        }

        for (int j = 0; j < lottoNumbers.length; j++) {
            System.out.println(lottoNumbers[j]);
        }
        System.out.println(lottoNumbers[6]); // brak 7 elementu w tabeli . tabela ma tylko 6 pozycji
    }

}
