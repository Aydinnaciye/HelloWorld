package day04_matamatıkselIslemler_ıncrementDecrement;

public class C07_Pre_Post_Icrement {

    public static void main(String[] args) {



        int a= 10;


        int b = a++;


        int c= ++b;


        System.out.println("a: " + a + ", b : " + b +", c : "+ c);



        a= 20;


        b= ++a;


        c= a++;


        System.out.println("a: " + a + ", b : " + b +", c : "+ c);


        a=30;

        System.out.println(a++);

        System.out.println(--a);

        System.out.println(a--);

        System.out.println(a);
    }
}

