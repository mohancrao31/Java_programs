import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;
        while (true){
            boolean isnumberint = scanner.hasNextInt();
            if(isnumberint){
                int number = scanner.nextInt();
                sum += number;
                counter++;
                average = Math.round((double)sum/counter);

            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            } scanner.nextLine();

        }
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
