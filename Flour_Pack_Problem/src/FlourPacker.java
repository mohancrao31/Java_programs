public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        int totalbigcountkg = 5; //1 bag of bigcount = 5kg flour
        int smallcountbagkg = 1;

        int totalgoal = totalbigcountkg*bigCount + smallCount*smallcountbagkg;
        if (goal > totalgoal){
            return false;

        }

        for (int i =0; i <= bigCount; i++){
            for (int j = 0; j <= smallCount; j++){
                if (totalbigcountkg*i + smallcountbagkg*j == goal){
                    return true;
                }
            }

        } return false;


    }

    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
    }
}
