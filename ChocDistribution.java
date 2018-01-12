/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class ChocDistribution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int m = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            m--;
            int diff = Integer.MAX_VALUE;
            for (int i = 0; i+m < arr.length; i++) {
                diff = Math.min(diff, (arr[i+m] - arr[i]));
            }
            System.out.println(diff);

        }
    }
}
