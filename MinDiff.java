/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class MinDiff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < arr.length; i++) {
                int diff = arr[i] - arr[i-1];
                min = Math.min(min, diff);
            }
            System.out.println(min);
        }
    }
}
