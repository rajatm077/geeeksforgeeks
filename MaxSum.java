/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxSum {
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
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.length;i++) {
                if (i % 2 == 0) sum1 += arr[i];
                else sum2 += arr[i];
            }
            sum1 = Math.max(sum1, sum2);
            System.out.println(sum1);

        }
    }
}
