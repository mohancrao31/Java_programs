//
////public class Sum{
////    public static void main (String[] args){
////
////
////        Scanner scanner = new Scanner(System.in);
////
////        int size = scanner.nextInt();
////        scanner.nextLine();
////        int sum = 0;
////        for (int i = 0; i < size; i++){
////
////            sum = 0;
////            String s = scanner.nextLine();
////            int num = isvowel(s);
////            sum += num;
////            System.out.println(sum + " ");
//
//
//
//
//            public class Sum{
//                private int firstnumber;
//                private int step;
//                private int totalnumbers;
//
//                public Sum(int firstnumber, int step, int totalnumbers){
//                    this.firstnumber = firstnumber;
//                    this.step = step;
//                    this.totalnumbers = totalnumbers;
//                }
//
//                public int sumofdigits(){
//                    int sum = 0;
//
//                    for (int i = 0; i < totalnumbers; i++){
//                        sum = sum + firstnumber;
//                        firstnumber = firstnumber+step;
//                    }
//                    return sum;
//
//                }
//
//                public static void main(String[] args){
//
//                    Scanner scanner = new Scanner(System.in);
//                    int size = scanner.nextInt();
//
//                    for (int i = 0; i < size; i++){
//                        switch(i){
//                            case 20:
//                        }int num = Integer.parseInt("1772");
//                        int n = 30;
//                        String s = String.valueOf(scanner.nextInt());
//                        System.out.println(s);
//                        System.out.println(num);
////                        Sum s = new Sum(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
////                        System.out.println(s.sumofdigits());
//                    }
//                }
//            }

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            while (true) {
                int num = scanner.nextInt();
                if (num == 0) {
                    int avg = sum / count;
                    break;
                }
                sum += num;
                count++;
            }

        }
    }
}