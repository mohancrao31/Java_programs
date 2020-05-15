import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=10; i++){
            System.out.println(" Enter The number #" + i);

            boolean HasNextInt = scanner.hasNextInt();
            if (HasNextInt){

                int number = scanner.nextInt();
                sum += number;

            } else {
                System.out.println("Invalid Number");

                i--;

            } String Enter = scanner.nextLine();
        }

        System.out.println(" The sum of the 10 numbers " + sum );
        scanner.close();

    }
}
