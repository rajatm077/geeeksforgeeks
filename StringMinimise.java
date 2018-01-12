/**
 * Created by MalhotR1 on 04/20/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMinimise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toLowerCase().toCharArray();
            int k = Integer.parseInt(br.readLine().trim());
            if (k >= in.length) {
                System.out.println(0);
                continue;
            }

            int[] arr = new int[26];
            for (int i = 0; i < in.length; i++) {
                arr[in[i] - 97]++;
            }
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0 && k > 0; i--) {
                k = k - arr[i] + 1;
                arr[i] = 1;

            }
            if (k > 0) {
                for (int i = arr.length - 1; i >= 0 && k > 0; i--) {
                    k = k - arr[i];
                    arr[i] = 0;
                }
            }

            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) sum += arr[i] * arr[i];
            }
            System.out.println(sum);
        }
    }
}
