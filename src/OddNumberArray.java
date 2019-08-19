import java.util.HashMap;
import java.util.Map;

public class OddNumberArray {
    public static void main(String[] args) {
        System.out.println(OddOccurrencesInArray(new int[]{9,3,9,3,5,5,7}));
        String a = "Valami";
        String b = new String("Valami");
        System.out.println(a.hashCode());
        System.out.println(b == a);

    }

    public static int OddOccurrencesInArray (int[] A){
        int elem = 0;
        for (int value : A) {
            elem ^= value;
        }
        return elem;
    }
}
