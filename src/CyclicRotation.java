import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,9,7,6};
        int[] a = solution(arr, 3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(betterSolution(arr, 3)));
    }

    public static int[] solution(int[] A, int K){
        if (A.length == 0){
            return A;
        }
        int[] rotated = new int[A.length];
        K = K % A.length;
        int firstElementIndex = A.length - K;
        for (int i = 0; i < A.length; i++) {
            if(firstElementIndex + i + 1 <= A.length) {
                rotated[i] = A[firstElementIndex + i];
            } else {
                rotated[i] = A[i - K];
            }
        }
        return rotated;
    }

    public static int[] betterSolution(int[] A, int K){
        if(A == null){
            return null;
        }
        int[] newArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            newArr[(i + K) % A.length] = A[i];
        }
        return newArr;
    }
}
