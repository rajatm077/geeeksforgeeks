/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class SumOfKSmallest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            if (k == 1) {
                System.out.println(arr[0]);
                continue;
            }
            int index = 0;
            int count = 1;
            long sum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] != arr[i]) {
                    count++;
                    sum += arr[i];
                    if (count == k) {
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
