package com.udemycourse;

public class SwitchStatement {
    public static void alphabet(char alpha) {
        switch (alpha) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("the alphabet is " + alpha);
                break;

            default:
                System.out.println("the alphabet is not a, b,c,d or e");
                break;

        }
    }

    public static void alphabet2(char Alpha) {
       char Alphanext = (char) (Alpha + 1);
        System.out.println("Alphanext is " + Alphanext);
        alphabet(Alphanext);
    }

}



