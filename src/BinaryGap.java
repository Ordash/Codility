public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(113492088));
        System.out.println(binaryGap(113492088));
        System.out.println(Integer.toBinaryString(1041));
        System.out.println(binaryGap(1041));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(binaryGap(15));
    }

    public static int binaryGap(int N){
        N >>>= Integer.numberOfTrailingZeros(N);
        int steps = 0;
        while ((N & (N + 1)) != 0) {
            N |= N >>> 1;
            steps++;
        }
        return steps;
    }
}
