/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            int total = 0;
            for (int i = 0; i < in.length; i++) {
                total += Integer.parseInt(in[i]);
            }
            int sum = (N * (N + 1)) / 2;
            System.out.println(sum - total);
        }
    }
}
