import java.util.Arrays;

public class Seasons {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,-14,-5,7,8,42,8,3};
        System.out.println(solution(arr));
    }

    public static String solution(int[] A) {
        String[] seasons = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};
        int highestAmpSeasonIndex = 0;
        int highestAmp = 0;
        int tempAmp;
        int[] seasonTemps = new int[A.length / 4];
        int arrFrom = 0;
        int arrTo = seasonTemps.length;
        for (int i = 0; i < 4; i++) {
            seasonTemps = Arrays.copyOfRange(A,arrFrom,arrTo);
            arrFrom += seasonTemps.length;
            arrTo += seasonTemps.length;
            Arrays.sort(seasonTemps);
            tempAmp = seasonTemps[seasonTemps.length - 1] - seasonTemps[0];
            if(tempAmp >= highestAmp){
                highestAmp = tempAmp;
                highestAmpSeasonIndex = i;
            }
        }
        return seasons[highestAmpSeasonIndex];
    }
}