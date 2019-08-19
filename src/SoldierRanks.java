import java.util.Arrays;

public class SoldierRanks {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,0,2,2,3,0,0};
        int[] arr2 = new int[]{2,-3,3,1,10,8,2,5,13,-5,3,-18};
        System.out.println(solution(arr));

    }

    public static int solution(int[] ranks) {
        Arrays.sort(ranks);
        int actualRank = ranks[0];
        int sameRankCount = 1;
        int reportCount = 0;
        for (int i = 1; i < ranks.length; i++) {
            if(actualRank == ranks[i]){
                sameRankCount++;
            } else if(actualRank + 1 == ranks[i]){
                reportCount += sameRankCount;
                actualRank = ranks[i];
                sameRankCount = 1;
            } else {
                actualRank = ranks[i];
                sameRankCount = 1;
            }
        }
        return reportCount;
    }
}
