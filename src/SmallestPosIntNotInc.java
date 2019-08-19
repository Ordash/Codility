import java.util.Arrays;

public class SmallestPosIntNotInc {
    public static void main(String[] args) {

        System.out.println(solution2(new int[]{-4,-5,-32,4,5,2,1}));
    }

    public static int solution(int[] A){
        int[] positiveOnlyDistinct = Arrays.stream(A).filter(s -> s > 0).distinct().toArray();
        Arrays.sort(positiveOnlyDistinct);
        for (int i = 0; i < positiveOnlyDistinct.length; i++) {
            if(positiveOnlyDistinct[i] != i + 1) {
                return i + 1;
            } else if(i == positiveOnlyDistinct.length - 1){
                return i + 2;
            }
        }
        return 1;
    }

    public static int solution2(int[] A) {
        int j = 1;
        Arrays.sort(A);
        for (int i : A) {
            if (i == j) {
                j++;
            }
        }
        return j;
    }
}
