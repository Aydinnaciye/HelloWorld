package day10_stringManipulation;

public class C10_IsEmpty {

    public static void main(String[] args) {

        String str= "";

        System.out.println(str.isEmpty()); // true

        str="   ";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true

        str="x";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false



    }
}

