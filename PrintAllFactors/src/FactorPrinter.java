public class FactorPrinter {
        public static final String ERROR_INVALID_ENTRY = "Invalid Value";
        public static void printFactors(int number){
            if (number < 1){
                System.out.println(ERROR_INVALID_ENTRY);
            } else {
                for (int i = 1; i <= number / 2; i++) {
                    int remainder = number % i;
                    if (remainder == 0) {
                        System.out.println(i);
                    }
                }
                System.out.println(number);
            }
        }

    public static void main(String[] args) {
        printFactors(-1);
    }
}
