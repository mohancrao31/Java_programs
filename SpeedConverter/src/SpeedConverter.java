public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        long milesperhour = -1L;
        if( kilometersPerHour >=0){
            milesperhour = Math.round(kilometersPerHour / 1.609);
            return milesperhour;
                    }
        return milesperhour;
    }
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour >= 0){
           int milesperhour = (int)(toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + milesperhour + " mi/h" );
        } else {
            System.out.println("Invalid Value");
        }
    }
}
