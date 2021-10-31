import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    // Zad 1
    public static void zad_1(int[] tab){
        for(int i = 19; i>=0; i--){
            tab[i] = i + 20;
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    // Zad 2
    public static void zad_2(String[] tab){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            System.out.println("podaj wartosc");
            tab[i] = sc.next();
        }
        for(int i = 5; i >= 0; i--){
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }

    // Zad 3
    public static void zad_3(String imie){
        System.out.println("imie "+ imie);
    }
    public static void zad_3(String imie, String nazwisko){
        System.out.println("imie "+ imie);
        System.out.println("nazwisko "+ nazwisko);
    }
    public static void zad_3(String imie, String nazwisko, int wiek){
        System.out.println("imie "+ imie);
        System.out.println("nazwisko "+ nazwisko);
        System.out.println("wiek "+ wiek);
    }

    // Zad 4
    public static int zad_4(int a, int b){
        return a + b;
    }
    public static int zad_4(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

//        int[] tab_x = new int[20];
//        zad_1(tab_x);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

//        String[] tab_s = new String[6];
//        zad_2(tab_s);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

//        String im = "Piotr";
//        String na = "Borchardt";
//        int w = 25;
//        zad_3(im);
//        zad_3(im, na);
//        zad_3(im, na, w);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

//        int a = 3;
//        int b = 8;
//        int c = 51;
//        int d = zad_4(a, b);
//        int e = zad_4(a, b, c);
//        System.out.println("wynik : "+ (zad_4(a, b) + zad_4(a, b, c)));
    }

}
