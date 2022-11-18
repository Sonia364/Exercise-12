import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int n = arr.length;
        System.out.println("The most frequent number in the table is:");
        int[] ans = mostFrequent(arr, n);
        System.out.print(ans[0] + " ( " + ans[1]+ " x)" );
    }

    // Java program to find the most frequent element
    // in an array.
    public static int[] mostFrequent(int[] arr, int n)
    {
        int maxCount = 0;
        int elementHavingMaxFreq = 0;
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                elementHavingMaxFreq = arr[i];
            }
        }

        res[0] = elementHavingMaxFreq;
        res[1] = maxCount;

        return res;
    }
}
