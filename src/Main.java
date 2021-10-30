public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

//        int i = 1000;
//        int a = 0;
//        while(i >= 0){
//            a = i;
//            while(a >= 100){
//                a = a - 100;
//            }
//            if(a == 0 || i % a != 0);
//            else System.out.print("\nindex: " + i + " " + (i % a));
//            i--;
//        }

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

//        int[] tab1 = {3, 4, 5, 6, 7};
//        double[] tab2 = {3.5, 4.3, 5.2, 6.1, 7.9};
//        String[] tab3 = {"Q", "W", "E", "R", "T"};
//        int i = 0;
//
//        while(i < tab1.length){
//            System.out.print("\ntab1[" + i + "] = " + tab1[i]);
//            i++;
//        }
//        i = 0;
//        while(i < tab2.length){
//            System.out.print("\ntab2[" + i + "] = " + tab2[i]);
//            i++;
//        }
//        i = tab3.length-1;
//        while(i >= 0){
//            System.out.print("\ntab3[" + i + "] = " + tab3[i]);
//            i--;
//        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

//        while(true){
//            System.out.print("\ntrue");
//        }
//        while(false){
//            System.out.print("\nfalse");
//        }

    }
}
