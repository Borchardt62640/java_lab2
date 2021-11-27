import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void read(List<String> lista){
        for(String str : lista){
            System.out.println(str);
        }
    }
    public static void read(Set<Integer> lista){
        for(Integer str : lista){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
//        List<String> lista = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<5; i++){
//            lista.add(sc.next());
//        }
//        read(lista);
//
//        lista.remove(lista.size()-1);
//        lista.remove(lista.size()-1);
//
//        lista.add(sc.next());
//        lista.add(sc.next());
//        lista.add(sc.next());
//        read(lista);
//        System.out.println("wielkosc listy = " + lista.size());
//
//        Collections.sort(lista, Collections.reverseOrder());
//
//        read(lista);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Scanner sc = new Scanner(System.in);
        Set<Integer> wiek = new TreeSet<>();
        for(int i =0; i<10; i++){
            wiek.add(Integer.parseInt(sc.next()));
        }

        wiek.stream().sorted().forEach(System.out::println);
        read(wiek);
    }

}
