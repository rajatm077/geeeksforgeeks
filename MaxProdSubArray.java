/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxProdSubArray {
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
            int max = 0;
            int temp = 1;
            int prod = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    prod = 1;
                    temp = 1;
                    continue;
                } else if (arr[i] > 0) {
                    prod *= arr[i];
                    if (max < prod) max = prod;
                } else {
                    prod = 1;
                }
                temp *= arr[i];
                if (max < temp) max = temp;
            }
            System.out.println(max);
        }
    }
}
