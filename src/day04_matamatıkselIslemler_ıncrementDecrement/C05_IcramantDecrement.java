package day04_matamatıkselIslemler_ıncrementDecrement;

public class C05_IcramantDecrement {

    public static void main(String[] args) {

        int sayi = 10 ;

        // bu sayiyi 3 artiralim ve yazdiralim

        sayi = sayi+3;

        System.out.println(sayi); // 13


        sayi +=3;

        System.out.println(sayi); // 16


        int s= 10;
        // bu sayiyi 1 artirin

        s=s+1;

        System.out.println(s); // 11

        s+=1;
        System.out.println(s); // 12

        s++;
        System.out.println(s); // 13

        ++s;
        System.out.println(s); // 14


        int t= 10;
        // bu sayinin degerini 1 eksiltelim

        t=t-1; // 9
        t-=1; // 8
        t--; // 7
        --t; // 6

        System.out.println(t);

    }
}


