/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RotateArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in2 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in2[0]);
            int d = Integer.parseInt(in2[1]) % n;
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int[] new_arr = new int[n];

            for (int i = 0; i < n; i++) {
                int next = ((i-d) % n + n) % n;
                new_arr[next] = arr[i];
            }

            for (int i = 0; i < in.length; i++) {
                System.out.print(new_arr[i] + " ");
            }
            System.out.println();
        }
    }
}
