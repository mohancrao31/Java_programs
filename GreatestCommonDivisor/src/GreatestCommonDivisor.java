public class GreatestCommonDivisor {
    public static final int ERROR_INVALID_INPUT = -1;
    public static int getGreatestCommonDivisor (int first, int second) {
        int lower = Math.min(first, second);
        int upper = Math.max(first, second);
        int remainder = upper % lower;
        if (first < 10 || second < 10) {
            return ERROR_INVALID_INPUT;
        } else if (first == second) {
            return first;
        }

        if (remainder != 0) {
            for (int i = lower / 2; i > 0; i--) {
                remainder = upper % i;
                int remainder2 = lower % i;
                if (remainder == 0 && remainder2 == 0) {
                    return i;
                }
            }
        }
        return lower;
    }

    public static void main(String[] args) {
        System.out.println(" the GCD of the numbers are " + getGreatestCommonDivisor(32,16) );
    }

}
